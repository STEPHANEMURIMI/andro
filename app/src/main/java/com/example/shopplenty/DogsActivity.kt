package com.example.shopplenty

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopplenty.ui.theme.ShopPlentyTheme

class DogsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Dogs()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dogs(){


    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 10.dp, end = 10.dp)) {
        val mContext = LocalContext.current
//Topappbar
        TopAppBar(
            title = { Text(text = "HomeScreen",
                color = Color.Cyan,

                ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Menu",
                        tint = Color.White
                    )
                }

            }
            , actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "Menu",
                        tint = Color.White )


                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "Menu",
                        tint = Color.White )


                }

            }


        )




//end topbar
        Spacer(modifier = Modifier.height(20.dp))

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(start = 150.dp)){
            Image(painter = painterResource(id = R.drawable.african),
                contentDescription ="paw" ,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
            )

            Spacer(modifier = Modifier.height(3.dp))

            Text(text = "Woof",
                fontSize = 30.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.ExtraBold)
        }
Spacer(modifier = Modifier.height(10.dp))
        Card (modifier = Modifier.fillMaxWidth())
        {
            Row {


                Box (modifier = Modifier
                    .padding(start = 5.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.bann),
                        contentDescription = "Dog",
                        modifier = Modifier
                            .clip(shape = CircleShape)



                    )
                }
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(text = "Koda",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "2 years old",
                        fontSize = 10.sp,
                        fontFamily = FontFamily.Default)
                }



            }
        }


    }


}
@Preview(showBackground = true)
@Composable
fun DogsPreview(){
    Dogs()
}