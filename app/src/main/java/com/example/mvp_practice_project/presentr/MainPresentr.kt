package com.example.mvp_practice_project.presentr

import com.example.mvp_practice_project.view.MainView

class MainPresentr(private val view: MainView) {
    private var clickCount = 0

    fun onButtonClicked() {
        clickCount++
        if (clickCount == 10) {
            view.showToast("Button cliked 10-times")
        }
    }
}