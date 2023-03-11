package com.example.calendar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

@Suppress("UNREACHABLE_CODE")
class Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_, container, false)

        fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val dateTextView = view.findViewById<TextView>(R.id.calendarView)
            val selectedDateTextView = view.findViewById<TextView>(R.id.tv)

            dateTextView.setOnClickListener {
                val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val selectedDate = dateFormat.parse(dateTextView.text.toString())
                selectedDateTextView.text = dateFormat.format(selectedDate)
            }
        }
    }
    }





