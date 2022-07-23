package com.ron.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ron.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()

    }
    fun displayContacts(){
        var contact=Contacts("anna","dalle@gmail.com","0787376476384","mawempe", "https://images.unsplash.com/photo-1628191013085-990d39ec25b8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")
        var contact2=Contacts("beth","bethe@gmail.com","0787376476384","baempe", "https://images.unsplash.com/photo-1592598015799-35c84b09394c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")
        var contact3=Contacts("clare","claelle@gmail.com","0787376476384","dawempe", "https://images.unsplash.com/photo-1542385151-efd9000785a0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=389&q=80")
        var contact4=Contacts("dallen","dalle@gmail.com","0787376476384","fawempe", "https://images.unsplash.com/photo-1639832060243-442b6125f18c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")
        var contact5=Contacts("anna","dalle@gmail.com","0787376476384","mawempe", "https://images.unsplash.com/photo-1504439158909-5a2f08876082?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1471&q=80")
        var contact6=Contacts("anna","dalle@gmail.com","0787376476384","mawempe", "https://images.unsplash.com/photo-1592598015799-35c84b09394c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")
        var contact7=Contacts("anna","dalle@gmail.com","0787376476384","mawempe", "https://images.unsplash.com/photo-1528743061033-811f9c409881?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
        var contact8=Contacts("anna","dalle@gmail.com","0787376476384","mawempe", "https://images.unsplash.com/photo-1607605150327-df8a94851f4e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80")
        var contact9=Contacts("anna","dalle@gmail.com","0787376476384","mawempe", "https://images.unsplash.com/photo-1528425646626-fcc5dd57daf5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=358&q=80")
        var contact10=Contacts("anna","dalle@gmail.com","0787376476384","mawempe", "https://images.unsplash.com/photo-1628191013085-990d39ec25b8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")

        var contactlist= listOf(contact,contact2,contact4,contact5,contact3,contact6,contact7,contact8,contact9,contact10)
        var contactsAdaptor=contactRvAdaptor(contactlist)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdaptor
    }
}