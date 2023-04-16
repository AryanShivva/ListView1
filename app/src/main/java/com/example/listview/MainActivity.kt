package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView) //finding

        val tasklist = arrayListOf<String>()  //creating an array
        tasklist.add("Attend Exam")
        tasklist.add("Complete the project")
        tasklist.add("Improve internet presence")
        tasklist.add("Shop items from market")
        tasklist.add("Work on Resume")
        tasklist.add("Complete Assignment ")

        //craeting adapter//the below line decides the apperance of the listview
        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,tasklist)
        listView.adapter = adapterForMyListView
        //assigning the adapter.//setting the adapter.


        //action performing when we click on each item in the list
        listView.setOnItemClickListener{ parent, view, position, id ->
            val text = "Clicked on item : " + (view as TextView).text //t
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }



    }
}