package com.formationkilo.todoapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.ai.client.generativeai.type.content
import java.text.SimpleDateFormat
import java.util.Locale


@SuppressLint("SuspiciousIndentation")
@Composable
@RequiresApi(Build.VERSION_CODES.O)
fun TodoListPage(){
 var todoList= getFakeTodo()
   // Text(text = todoList.toString())
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        LazyColumn (
            content = {
                itemsIndexed(todoList){index: Int, item: Todo ->  
                   TodoItem(item = item)
                }
            }
           
        )
        
    }
}

@Composable
fun TodoItem(item:Todo){
   Row(modifier = Modifier
       .fillMaxSize()
       .padding(8.dp)
       .clip(RoundedCornerShape(16.dp))
       .background(MaterialTheme.colorScheme.primary)
       .padding(16.dp),
       verticalAlignment = Alignment.CenterVertically
       ) {

       Column(modifier = Modifier.weight(1f)) {
          // Text(text = item.creatededAt.toString())
           //Text(text =item.creatededAt.toString())
           Text(text=SimpleDateFormat("HH:mm:aa, dd/mm",Locale.ENGLISH).format(item.creatededAt),
               fontSize = 10.sp,
               color = Color.LightGray
               )
           Text(text = item.title,
              fontSize = 20.sp,
               color = Color.White
           )
       }
       IconButton(onClick = { /*TODO*/ }) {
           Icon(painter = painterResource(id = R.drawable.baseline_delete_24),
               contentDescription = "Delete",
               tint = Color.White)
       }
   }
}