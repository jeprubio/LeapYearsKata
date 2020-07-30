package com.jeprubio.leapyears.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.jeprubio.leapyears.R
import com.jeprubio.leapyears.viewmodel.ListYearsViewModel

class ListYearsFragment : Fragment() {

    private lateinit var viewModel: ListYearsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_years_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ListYearsViewModel::class.java)
        // TODO: Use the ViewModel
    }
}