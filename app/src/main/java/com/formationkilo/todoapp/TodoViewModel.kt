package com.formationkilo.todoapp

import android.icu.text.CaseMap.Title
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.Instant
import java.util.Date


class TodoViewModel: ViewModel(){
 // private var _todoList=MutableLiveData<List<Todo>>()
val todoDao=MainApplication.todoDatabase.getTodoDao()
  //val todoList:LiveData<List<Todo>>=_todoList
  val todoList:LiveData<List<Todo>> =todoDao.getAllTodo_v2()

/*
  fun getAllTodo(){
     _todoList.value=TodoManager.getAllTodo().reversed()
  }
  fun addTodo(title:String){
    TodoManager.addTodo(title)
    getAllTodo()
  }
  fun deleteTodo(id:Int){
   TodoManager.deleteTodo(id)
    getAllTodo()

  }*/
    fun addTodo(title: String){
        todoDao.addTodo_v2(Todo(title=title, creatededAt = Date.from(Instant.now())))
    }
    fun deleteTodo(id:Int){
        todoDao.deleteTodo_v2(id)
    }
}