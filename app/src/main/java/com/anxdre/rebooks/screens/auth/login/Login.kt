package com.anxdre.rebooks.screens.auth.login


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.anxdre.rebooks.R
import com.anxdre.rebooks.screens.mainmenu.MainMenu
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class Login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_register.setOnClickListener { findNavController().navigate(R.id.action_login_to_register) }
        btn_login.setOnClickListener { startActivity(Intent(context,MainMenu::class.java)) }
    }
}
