package com.example.list_of_content

import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var tvItemVersionName:TextView
    private var clContainer:ConstraintLayout

    init {
       tvItemVersionName = itemView.findViewById(R.id.tvItem)
        clContainer = itemView.findViewById(R.id.clContainer)


    }

    fun configItem(nomeVersao: String, cor: String){
       tvItemVersionName.text = nomeVersao
        val color = Color.parseColor(cor)
        clContainer.setBackgroundColor(color)
        clContainer.setOnClickListener {
            // action of Click
            Toast.makeText(itemView.context,"Clicou em $nomeVersao" ,Toast.LENGTH_LONG).show()
        }
    }
}