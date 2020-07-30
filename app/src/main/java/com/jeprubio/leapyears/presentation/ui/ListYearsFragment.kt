package com.jeprubio.leapyears.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.jeprubio.leapyears.R
import com.jeprubio.leapyears.databinding.ListYearsFragmentBinding
import com.jeprubio.leapyears.presentation.adapters.YearAdapter
import com.jeprubio.leapyears.presentation.viewmodel.ListYearsViewModel
import java.util.*

class ListYearsFragment : Fragment() {

    private lateinit var viewModel: ListYearsViewModel
    private lateinit var binding: ListYearsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.list_years_fragment, container, false
        )
        binding.lifecycleOwner = this

        viewModel = ViewModelProvider(this).get(ListYearsViewModel::class.java)

        init()

        return binding.root
    }

    private fun init() {
        val yearsAdapter = YearAdapter()

        binding.recycler.apply {
            setHasFixedSize(false)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = yearsAdapter
        }

        viewModel.createYearsList(GregorianCalendar().get(Calendar.YEAR))

        viewModel.yearsList.observe(viewLifecycleOwner, Observer {
            yearsAdapter.items = it
            yearsAdapter.notifyDataSetChanged()
        })
    }
}