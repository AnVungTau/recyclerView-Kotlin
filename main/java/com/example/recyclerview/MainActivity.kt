package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rcvMusic: RecyclerView
    private lateinit var listMusic: MutableList<Music>
    private lateinit var musicAdapter: MusicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvMusic = findViewById(R.id.recycler_view_music)

        listMusic = Music.getMock()
        musicAdapter = MusicAdapter(listMusic)
        rcvMusic.adapter = musicAdapter
    }
}