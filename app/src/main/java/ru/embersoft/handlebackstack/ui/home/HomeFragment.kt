package ru.embersoft.handlebackstack.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import ru.embersoft.handlebackstack.R

class HomeFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment))
        val navHostFragment = NavHostFragment.findNavController(this)
        NavigationUI.navigateUp(navHostFragment, appBarConfiguration)

        val button = root.findViewById<Button>(R.id.detailBtn)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_detailHomeFragment)
        }

        return root
    }
}