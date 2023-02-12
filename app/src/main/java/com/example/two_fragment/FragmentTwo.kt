package com.example.two_fragment

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment(R.layout.two_fragment) {
    private var mainActivity : MainActivity? = null
    lateinit var tvName : TextView
    lateinit var tvLastName : TextView
    lateinit var tvGender : TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvName = view.findViewById(R.id.tvTextPersonName)
        tvLastName = view.findViewById(R.id.tvLastName)
        tvGender = view.findViewById(R.id.tvGender)

        mainActivity?.mainViewModel?.liveUserDetails?.observe(viewLifecycleOwner) {
            tvName.setText(it.name)
            tvLastName.setText(it.lastName)
            tvGender.setText(it.gender)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = activity as MainActivity

    }

}