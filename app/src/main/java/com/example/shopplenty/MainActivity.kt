package com.example.shopplenty

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
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

       .paint(
           painterResource(id = R.drawable.bg),
           contentScale = ContentScale.FillBounds
       )

   )

   {

       val mContext = LocalContext.current
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

       //Lottie Animation
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




   Box (modifier = Modifier.fillMaxWidth(),
       contentAlignment = Alignment.Center){
       Button(onClick = { mContext.startActivity(Intent(mContext,SplashActivity::class.java)) },
           shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Blue)

       ) {
           Text(text = "Destinations" ,


               )


       }
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
            .clip(shape = CircleShape)
            .size(150.dp),
        contentScale = ContentScale.Crop
    )


}
Button(onClick = {
mContext.startActivity(Intent(mContext,layout::class.java))

},
shape = RoundedCornerShape(10.dp),
    colors = ButtonDefaults.buttonColors(Color.Blue)
, modifier = Modifier
        .fillMaxWidth()
        .padding(start = 30.dp, end = 30.dp)

    ) {
Text(text = "continue")


}
       Button(onClick = {
           mContext.startActivity(Intent(mContext,LottieActivity::class.java))

       },
           shape = RoundedCornerShape(10.dp),
           colors = ButtonDefaults.buttonColors(Color.Blue)
           , modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp, end = 30.dp)

       ) {
           Text(text = "lottie")


       }

   }


}

@Preview(showBackground = true)
@Composable
fun demoPreview(){

    Demo()
}