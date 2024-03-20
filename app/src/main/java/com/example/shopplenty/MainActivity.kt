package com.example.shopplenty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopplenty.ui.theme.ShopPlentyTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Demo()
        }
    }
}

@Composable
fun Demo(){

   Column(modifier = Modifier
       .fillMaxSize()




   ) {
     Text(
           text = "Welcome to Android",
           fontSize = 30.sp,
           color = Color.Blue,
           fontWeight = FontWeight.Bold,
           fontStyle = FontStyle.Italic,
         textDecoration = TextDecoration.Underline
         )
       Text(
           text = "that positively impact the society and most importantly transform the lives of those around us is a core value that we hold dear"


       )
       Spacer(modifier = Modifier.height(10.dp))
     Text(
         text = "Types of cars",
         modifier = Modifier
             .fillMaxWidth()
             .background(Color.Blue)
             .height(30.dp)
         ,
         textAlign = TextAlign.Center,
         color = Color.Cyan

         )



     Text(text = "1.Subaru")
     Text(text = "2.Ferrari")
     Text(text = "3.Audi")

       Spacer(modifier = Modifier.height(10.dp))
Divider()

       Text(
           text = "Phone Updates",
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Blue)
               .height(30.dp)
           ,
           textAlign = TextAlign.Center,
           color = Color.Cyan

       )



       Text(


           text = "1.TECNO",
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Blue)
               .height(30.dp)
           ,
           textAlign = TextAlign.Center,
           color = Color.Cyan)
       Text(text =
               "    RAM: 8GB\n" +
               "    Internal Storage: 256GB\n" +
               "    Battery: 5000mAh\n" +
            "    OS: Android 13, MIUI 14\n")
       Text(text = "2.SAMSUNG",
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Blue)
               .height(30.dp)
           ,
           textAlign = TextAlign.Center,
           color = Color.Cyan
           )



       Text(text = "\n" +


               "    Processor: Qualcomm SM6225 Snapdragon 685 (6 nm)\n" +
               "    Connectivity: Dual sim, 3G, 4G, Wi-Fi\n" +
               "    Colors: Midnight Black, Mint Green, Ice Blue, Ocean Sunset\n" +
               "    OS: Android 13, MIUI 14\n")



       Button(onClick = { /*TODO*/ },
           shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Blue)
           , modifier = Modifier
               .fillMaxWidth()
               .padding(start = 100.dp, end = 100.dp)

       ) {
           Text(text = "more phones" )


       }
       Divider()

       Spacer(modifier = Modifier.height(5.dp))





       Text(text = "Emobilis mobile training institute",

fontSize = 20.sp,
           fontWeight = FontWeight.Bold

           )


       Spacer(modifier = Modifier.height(5.dp))
//image centering
Box(modifier = Modifier.fillMaxWidth(),
    contentAlignment = Alignment.Center) {
    Image(painter = painterResource(id = R.drawable.ashera),
        contentDescription = "Monalisa",
        modifier = Modifier
            .size(150.dp))


}
Button(onClick = { /*TODO*/ },
shape = RoundedCornerShape(10.dp),
    colors = ButtonDefaults.buttonColors(Color.Blue)
, modifier = Modifier
    .fillMaxWidth()
        .padding(start = 30.dp, end = 30.dp)

    ) {
Text(text = "continue")


}

   }


}

@Preview(showBackground = true)
@Composable
fun demoPreview(){

    Demo()
}