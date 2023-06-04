package com.example.list_of_content

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val listaDeNomes = listOf<String>(
            "Android 4 Ice Cream Sandwich",
            "Android 4.1 Jelly Bean",
            "Android 4.4 KitKat",
            "Android 5 Lollipop",
            "Android 6 Marshmallow",
            "Android 7 Nougat",
            "Texto8 Oreo"

        )
        val colors = resources.getStringArray(R.array.colors)

        val recycle = findViewById<RecyclerView>(R.id.rvLista)
        recycle.adapter = DroidVersionAdapter(listaDeNomes, colors)

    }
}