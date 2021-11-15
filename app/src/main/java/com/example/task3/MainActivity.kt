package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class MainActivity : AppCompatActivity() {

    var recyclerview: RecyclerView?=null
    var layoutManger:RecyclerView.LayoutManager?=null

    var list1 = arrayListOf<data>()

    var  adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list1.add(data("Mango","tom",R.drawable.ic_launcher_background ))
        list1.add(data("Banana","mark",R.drawable.ic_launcher_background))
        list1.add(data("Guava","mike",R.drawable.ic_launcher_background))
        list1.add(data("Lemon","mike",R.drawable.ic_launcher_background))
        list1.add(data("Guava","frank",R.drawable.ic_launcher_background))
        list1.add(data("Pear","tom",R.drawable.ic_launcher_background))
        list1.add(data("orange","joe",R.drawable.ic_launcher_background))
//        list1.add("Apple")
//        list1.add("Bannana")
//        list1.add("Guava")
//        list1.add("lemon")
//        list1.add("Pear")
//        list1.add("orange")
//
//        list2.add("tom")
//        list2.add("joe")
//        list2.add("Mark")
//        list2.add("Mike")
//        list2.add("Mike")
//        list2.add("Frank")
//        list2.add("Joe")

        recyclerview=findViewById(R.id.recyclerview)



        adapter=RecyclerAdapter(list1,this)

        recyclerview?.adapter=adapter

       layoutManger= LinearLayoutManager(this)


       recyclerview?.layoutManager=layoutManger


    }










}