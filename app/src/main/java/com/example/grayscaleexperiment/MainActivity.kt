package com.example.grayscaleexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.sample_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch_to_toggle_view_state.setOnCheckedChangeListener { _, _ ->
            if (switch_to_toggle_view_state.isChecked) {
                setSampleViewToEnabled()
            } else {
                setSampleViewToDisabled()
            }
        }
    }

    private fun setSampleViewToDisabled() {
        (sample_view as ConstraintLayoutWithDisableSupport).disabled = true
    }

    private fun setSampleViewToEnabled() {
        (sample_view as ConstraintLayoutWithDisableSupport).disabled = false
    }
}