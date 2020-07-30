package com.jeprubio.leapyears.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jeprubio.leapyears.R
import com.jeprubio.leapyears.domain.model.YearItem
import com.jeprubio.leapyears.domain.model.YearType
import kotlinx.android.synthetic.main.year.view.*


class YearAdapter(var items: List<YearItem> = arrayListOf()) :
    RecyclerView.Adapter<YearAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.year,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: YearItem) = with(itemView) {
            year.text = item.year.toString()
            isLeapYear.text = when (item.yearType) {
                YearType.LeapYear -> "Leap Year"
                YearType.CommonYear -> "Common Year"
                else -> "Undefined year"
            }
        }
    }
}