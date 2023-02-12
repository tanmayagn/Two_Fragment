package com.example.two_fragment

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FragmentOne : Fragment(R.layout.one_fragment) {

    private var mainActivity : MainActivity? = null
    lateinit var etName : EditText
    lateinit var etLastName: EditText
    lateinit var etGender: EditText
    lateinit var submit:Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        etName = view.findViewById(R.id.etName)
        etLastName = view.findViewById(R.id.etLastName)
        etGender = view.findViewById(R.id.etGender)
        submit = view.findViewById(R.id.button)

        submit.setOnClickListener(View.OnClickListener {
            mainActivity?.mainViewModel?.liveUserDetails?.value = UserDetails(etName.text.toString()
                ,etLastName.text.toString()
                ,etGender.text.toString())
        })
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = activity as MainActivity
    }

}