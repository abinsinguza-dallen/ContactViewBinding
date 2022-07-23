package com.ron.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ron.mycontacts.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso


class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }

    fun getExtras() {
        val extras = intent.extras
        var name = extras?.getString("NAME", "")
        var phone = extras?.getString("PHONENUMBER", "")
        var email = extras?.getString("EMAIL", "")
        var address = extras?.getString("LOCATION", "")
        var image = binding.imgDisplay

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        binding.tvname1.text=name
        binding.tvphoneNumber.text=phone
        binding.tvEmaill.text=email
        binding.tvLocation.text=address
        Picasso.get().load(intent.getStringExtra("IMAGE"))
            .resize(600,600)
            .centerCrop()
            .into(image)
    }
}