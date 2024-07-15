package com.formationkilo.todoapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.formationkilo.todoapp.Todo

@Dao
interface TodoDao {

    @Query("SELECT *FROM TODO")
    fun getAllTodo_v2():LiveData<List<Todo>>

    //@Query("INSERT INTO ")
    @Insert
    fun addTodo_v2(todo: Todo)

    @Query("Delete FROM todo where id=:id")
    fun deleteTodo_v2(id:Int)
}