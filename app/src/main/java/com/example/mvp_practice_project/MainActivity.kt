package com.example.mvp_practice_project

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mvp_practice_project.presentr.MainPresentr
import com.example.mvp_practice_project.view.MainView

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var presenter: MainPresentr

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCliced: Button = findViewById(R.id.btn_cliced)
        presenter = MainPresentr(this)

        btnCliced.setOnClickListener {
            presenter.onButtonClicked()
        }

    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }


}