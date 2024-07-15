package com.formationkilo.todoapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.time.LocalDate
import java.util.Date

@Entity
data class Todo (
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    var title:String,
    // creatededAt :Date?
   var creatededAt:Date?



)


/*

fun getFakeTodo(): List<Todo> {
    return listOf(
        Todo(1,"First todo", Date.from(Instant.now())),
        Todo(2,"Second todo",Date.from(Instant.now())),
        Todo(3,"Third todo", Date.from(Instant.now())),
        Todo(4,"Fourth todo", Date.from(Instant.now()))

    );

}*/