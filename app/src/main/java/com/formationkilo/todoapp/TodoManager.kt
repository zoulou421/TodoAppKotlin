package com.formationkilo.todoapp

import java.time.Instant
import java.util.Date

//THE CLASS IS NO LONGER NEED
//IT WAS USED FOR INMEMORY PURPOSE
//YOU CAN DELETE IT NOW THAT WE
object TodoManager {

   private val todoList= mutableListOf<Todo>()
    fun getAllTodo():List<Todo>{
       return todoList
    }
    fun addTodo(title:String){
         todoList.add(Todo(System.currentTimeMillis().toInt(),title,Date.from(Instant.now())))
    }
    fun deleteTodo(id:Int){
         todoList.removeIf{
             it.id==id
         }
    }
}