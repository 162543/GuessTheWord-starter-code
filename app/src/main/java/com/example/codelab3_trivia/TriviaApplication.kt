package com.example.codelab3_trivia

import android.app.Application
import timber.log.Timber

class TriviaApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())     //*  initialize the Timber library:

    }
}