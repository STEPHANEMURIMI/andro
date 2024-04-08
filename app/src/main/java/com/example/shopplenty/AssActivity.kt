package com.example.shopplenty

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopplenty.ui.theme.ShopPlentyTheme

class AssActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAss()
        }
    }
}

@Composable

fun MyAss(){
    Column(
        modifier = Modifier
            .fillMaxSize()





    ) {

        val mContext = LocalContext.current
        var firstname by remember {    mutableStateOf("")}
        var lastname by remember {    mutableStateOf("")}
        var email by remember {    mutableStateOf("")}
        var password by remember {    mutableStateOf("")}
        var contact by remember {    mutableStateOf("")}

     Box(
         modifier = Modifier.fillMaxWidth(),
         contentAlignment = Alignment.Center
     ) {
         Row {
             Image(painter = painterResource(id = R.drawable.instagram) ,
                 contentDescription = "",



             )
             Text(
                 text = "Woof",
                 fontSize = 40.sp,
                 fontFamily = FontFamily.Cursive,

                 textAlign = TextAlign.Center,
                 fontWeight = FontWeight.Bold


             )

         }
     }
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value =firstname ,
            onValueChange = {firstname = it},
            placeholder = { Column {
                Text(text = "Keda")

                Text(text = "2 Years old")

            }},


            leadingIcon = {   Image(painter = painterResource(id = R.drawable.ashera),
                contentDescription = "Monalisa",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp),
                contentScale = ContentScale.Crop
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value =lastname ,
            onValueChange = {lastname = it},
            placeholder = { Column {
                Text(text = "Lola")

                Text(text = "2 Years old")

            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.bg),
                contentDescription = "Monalisa",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp),
                contentScale = ContentScale.Crop)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))


        TextField(
            value =email ,
            onValueChange = {email = it},
            placeholder = { Column {
                Text(text = "Frankie")

                Text(text = "2 Years old")

            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.african),
                contentDescription = "Monalisa",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp),
                contentScale = ContentScale.Crop)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value =password ,
            onValueChange = {password = it},
            placeholder = { Column {
                Text(text = "Nox")

                Text(text = "2 Years old")

            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.ban),
                contentDescription = "Monalisa",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp),
                contentScale = ContentScale.Crop)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(10.dp))


        TextField(
            value =contact ,
            onValueChange = {contact = it},
            placeholder = { Column {
                Text(text = "Faye")

                Text(text = "2 Years old")

            }},
            leadingIcon = {Image(painter = painterResource(id = R.drawable.bann),
                contentDescription = "Monalisa",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp),
                contentScale = ContentScale.Crop)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value =contact ,
            onValueChange = {contact = it},
            placeholder = { Column {
                Text(text = "Bella")

                Text(text = "2 Years old")

            }},
            leadingIcon = {Image(painter = painterResource(id = R.drawable.ban),
                contentDescription = "Monalisa",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp),
                contentScale = ContentScale.Crop)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value =contact ,
            onValueChange = {contact = it},
            placeholder = { Column {
                Text(text = "Moana")

                Text(text = "2 Years old")

            }},
            leadingIcon = {Image(painter = painterResource(id = R.drawable.ashera),
                contentDescription = "Monalisa",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp),
                contentScale = ContentScale.Crop)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}



@Preview(showBackground = true)
@Composable

fun MyAssPreview(){

    MyAss()

}