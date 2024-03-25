package com.example.shopplenty

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopplenty.ui.theme.ShopPlentyTheme

class layout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
Column(modifier = Modifier.fillMaxSize()) {
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
Text(
    text = "DESTINATIONS",
fontSize = 30.sp,
modifier = Modifier.fillMaxWidth(),
    textAlign = TextAlign.Center,
    fontFamily = FontFamily.Cursive

    )

//first row
Row {

    Image(
        painter = painterResource(id = R.drawable.bann),
    contentDescription = "Thiland",
    modifier = Modifier.size(width = 100.dp, height = 150.dp)
    )

    Spacer(modifier =Modifier.width(10.dp))

    Column {
        Text(text = "Thiland", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = "Thiland picturesque coastal town of Essaouira has earned a position on Travel Lemming's list of the “50 Top Travel Destinations for 2024,”...\n" +
                ".\n" +
                "14 Nov 2023")
    }
}

    Row {

        Image(
            painter = painterResource(id = R.drawable.bannn),
            contentDescription = "Thiland",
            modifier = Modifier.size(width = 100.dp, height = 150.dp)
        )

        Spacer(modifier =Modifier.width(15.dp))

        Column {
            Text(text = "Malasia", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text(text = "Thiland picturesque coastal town of Essaouira has earned a position on Travel Lemming's list of the “50 Top Travel Destinations for 2024,”...\n" +
                    ".\n" +
                    "14 Nov 2023")
        }
    }
    Spacer(modifier = Modifier.height(10.dp))
    Row {

        Image(
            painter = painterResource(id = R.drawable.ban),
            contentDescription = "Thiland",
            modifier = Modifier.size(width = 100.dp, height = 150.dp)
        )

        Spacer(modifier =Modifier.width(15.dp))

        Column {
            Text(text = "Mombasa Raha", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text(text = "Thiland picturesque coastal town of Essaouira has earned a position on Travel Lemming's list of the “50 Top Travel Destinations for 2024,”...\n" +
                    ".\n" +
                    "14 Nov 2023")
        }
    }
//row end
    Spacer(modifier = Modifier.height(40.dp))
    Button(onClick = { mContext.startActivity(Intent(mContext,IntentActivity::class.java)) },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(Color.Blue)
        , modifier = Modifier
            .fillMaxWidth()


    ) {
        Text(text = "next")


    }

}


}

@Preview(showBackground = true)
@Composable
fun LayoutPreview() {

       Layout()
    }
