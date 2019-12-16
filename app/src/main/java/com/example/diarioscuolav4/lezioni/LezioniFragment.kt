package com.example.diarioscuolav4.lezioni

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.diarioscuolav4.R

class LezioniFragment : Fragment() {

    companion object {
        fun newInstance() = LezioniFragment()
    }

    private lateinit var viewModel: LezioniViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lezioni_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LezioniViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
