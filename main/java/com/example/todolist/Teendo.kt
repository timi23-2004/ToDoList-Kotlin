package com.example.todolist
import android.os.Bundle
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity

class Teendo {
    private val lista= mutableListOf<Task>()
    fun hozzaad(uj:Task){
        lista.add(uj)
    }
    fun kiir(){
        for(n in lista){
            println("$n \n")
        }
    }
}
