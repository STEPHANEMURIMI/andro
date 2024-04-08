package com.example.shopplenty

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
    MyForm()
        }
    }
}

@Composable

fun MyForm(){
Column(
    modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.bannn),
            contentScale = ContentScale.FillBounds
        )




) {

    val mContext = LocalContext.current
var firstname by remember {    mutableStateOf("")}
var lastname by remember {    mutableStateOf("")}
var email by remember {    mutableStateOf("")}
var password by remember {    mutableStateOf("")}
var contact by remember {    mutableStateOf("")}

    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center) {

        Image(
            painter = painterResource(id = R.drawable.register), contentDescription = "register",
            modifier = Modifier.size(width = 200.dp, height = 150.dp)
        )

    }
Spacer(modifier = Modifier.height(5.dp))

Text(
    text = "Create an email",
    fontSize = 40.sp,
    fontFamily = FontFamily.Cursive,
    modifier = Modifier.fillMaxWidth(),
    textAlign = TextAlign.Center,
    fontWeight = FontWeight.Bold


)

    Spacer(modifier = Modifier.height(10.dp))
TextField(
    value =firstname ,
    onValueChange = {firstname = it},
    placeholder = { Text(text = "firstname")},
    leadingIcon = { Icon(imageVector =Icons.Default.Person , contentDescription = "")},
    modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp,end = 20.dp),
  keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
)
    Spacer(modifier = Modifier.height(10.dp))

    TextField(
        value =lastname ,
        onValueChange = {lastname = it},
        placeholder = { Text(text = "lastname")},
        leadingIcon = { Icon(imageVector =Icons.Default.Person , contentDescription = "")},
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp,end = 20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
    )
    Spacer(modifier = Modifier.height(10.dp))


    TextField(
        value =email ,
        onValueChange = {email = it},
        placeholder = { Text(text = "email")},
        leadingIcon = { Icon(imageVector =Icons.Default.Email , contentDescription = "")},
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp,end = 20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
    Spacer(modifier = Modifier.height(10.dp))

    TextField(
        value =password ,
        onValueChange = {password = it},
        placeholder = { Text(text = "password")},
        leadingIcon = { Icon(imageVector =Icons.Default.Lock , contentDescription = "lock")},
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp,end = 20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation()
    )
    Spacer(modifier = Modifier.height(10.dp))


    TextField(
        value =contact ,
        onValueChange = {contact = it},
        placeholder = { Text(text = "+254")},
        leadingIcon = { Icon(imageVector =Icons.Default.Call , contentDescription = "")},
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp,end = 20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
    )
    Spacer(modifier = Modifier.height(10.dp))

    Box (modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center){
        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)

        ) {
            Text(text = "SignUp" )


        }
    }
    Text(
        text = " Destinations",
        fontSize = 30.sp,
        fontFamily = FontFamily.Cursive,
        modifier = Modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold


    )
  }
}



@Preview(showBackground = true)
@Composable

fun MyFormPreview(){

MyForm()

}