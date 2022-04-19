package com.example.myapplication

import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    lateinit var viewModal: MyViewModlel
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var mediaPlayer: MediaPlayer

    @Inject
    lateinit var myClass: MyClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        mediaPlayer.setVolume(1.0f, 1.0f);
        mediaPlayer.isLooping = false;
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer = MediaPlayer.create(this, R.raw.file)
        mediaPlayer.start() // no need to call prepare(); create() does that for you





       /* viewModal = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        )[MyViewModlel::class.java]

        viewModal.startTimer()

        viewModal.data.observe(this, Observer { its ->
            its?.let {
                //on below line we are updating our list.
                Log.d("onCreate", "onCreate: $it")
            }
        })*/


    }
}