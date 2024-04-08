package com.example.shopplenty

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.shopplenty.ui.theme.ShopPlentyTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         MySpash()
val mContext = LocalContext.current
val coroutine = rememberCoroutineScope()
            coroutine.launch {
             delay(5000)
                mContext.startActivity(Intent(mContext,ForthActivity::class.java))
finish()
            }
        }
    }
}

@Composable
fun MySpash(){
Column(modifier = Modifier

    .fillMaxSize()

    .paint(
        painterResource(id = R.drawable.bannn),
        contentScale = ContentScale.FillBounds
    )
    , horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,

) {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(composition, progress,
        modifier = Modifier.size(300.dp)
    )
    //Lottie Animation
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row {
            Image(painter = painterResource(id = R.drawable.payment) ,
                contentDescription = "",



                )
            Text(
                text = "ShoPlenty",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,

                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold


            )

        }
    }

    Text(
        text = " WITH INFINATE POSSIBILITIES",
        fontSize = 20.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontFamily = FontFamily.Cursive
        , fontWeight = FontWeight.ExtraBold


    )

}



}
@Preview(showBackground = true)
@Composable
fun MysplashPreview(){
    MySpash()
}