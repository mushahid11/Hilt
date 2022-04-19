package com.example.myapplication

import android.media.MediaPlayer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object AnalyticsModule {


    @Provides
    fun mediaPlayer(): MediaPlayer {
        return MediaPlayer()
    }

}