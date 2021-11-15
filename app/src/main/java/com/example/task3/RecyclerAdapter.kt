package com.example.task3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private var list2: ArrayList<data>,var ctx2:Context)
    : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    lateinit var ctx: Context
    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context) .inflate(R.layout.card_layout, parent, false)

        ctx = parent.context
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        holder.bindItems(list ma data provide krna ka li [position])

        holder.title.text =  list2[position].name
        holder.detail.text =  list2[position].name2
        holder.im.setImageResource(list2[position].name3)

       holder.itemView.setOnClickListener {


          Toast.makeText(ctx,list2[position].name2,Toast.LENGTH_SHORT).show()


      }

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return list2.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title = itemView.findViewById(R.id.text1) as TextView
        val detail = itemView.findViewById(R.id.text2) as TextView
        var im=itemView.findViewById(R.id.im) as ImageView

    }

}


