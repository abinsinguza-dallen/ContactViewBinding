package com.ron.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ron.mycontacts.databinding.ActivityMainBinding
import com.ron.mycontacts.databinding.ContactsListItemBinding
import com.squareup.picasso.Picasso

class contactRvAdaptor (var contactlist:List<Contacts>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactsListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactlist.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvphoneNumber.text=currentContact.phoneNumber
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvLocation.text=currentContact.address
      Picasso.get().load(currentContact.image).resize(300,300)
          .centerCrop()
          .placeholder(R.drawable.ic_baseline_person_24)
          .into(holder.binding.ivContatct)
        val context= holder.itemView.context
        var currentContacts=contactlist.get(position)
        with(holder.binding){
            tvName.text=currentContact.name
            tvEmail.text=currentContact.email
            tvphoneNumber.text=currentContact.phoneNumber
            tvLocation.text=currentContact.address
            Picasso.get()
                .load(currentContacts.image)
                .resize(350,350)
                .centerCrop()
                .into(ivContatct)
        }
        holder.binding.ivContatct.setOnClickListener {
            Toast
                .makeText(context,"you have clicked the image",Toast.LENGTH_SHORT)
                .show()
        }
        holder.binding.cvcontacts.setOnClickListener {
            val intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("PHONENUMBER",currentContact.phoneNumber)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("LOCATION",currentContact.address)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
        }

        
    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}
class ContactViewHolder(var binding: ContactsListItemBinding):RecyclerView.ViewHolder(binding.root)




