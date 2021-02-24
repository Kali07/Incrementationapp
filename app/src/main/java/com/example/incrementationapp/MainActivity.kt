package com.example.incrementationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ajout(view: View){
        //transformer le text qu'on va rentrer en int (au depart en format texte)
        var contenu = textView.text.toString().toInt();

        contenu = contenu + 1;

        textView.text = contenu.toString();
    }


    fun diminuer(view: View){
        //transformer le text qu'on va rentrer en int (au depart en format texte)
        var contenu = textView.text.toString().toInt();

        contenu = contenu - 1;

        textView.text = contenu.toString();
    }

}