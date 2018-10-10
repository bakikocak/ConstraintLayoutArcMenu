package com.bakikocak.arcmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.Group
import android.support.design.widget.FloatingActionButton
import android.view.View

class MainActivity : AppCompatActivity() {

    private var isMenuShown = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabShare = findViewById<FloatingActionButton>(R.id.fab_share);
        val group = findViewById<Group>(R.id.group_menu)

        fabShare.setOnClickListener {
            group.visibility = if (group.visibility == View.VISIBLE){
                View.GONE
            } else{
                View.VISIBLE
            }
        }

    }
}
