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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.shopplenty.ui.theme.ShopPlentyTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        Explore()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
Column (modifier = Modifier.fillMaxSize()){

    val mContext = LocalContext.current


//Topappbar
    TopAppBar(
        title = { Text(text = "Cities",
            color = Color.Black,

            ) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
        navigationIcon = {
            IconButton(onClick = {
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
            }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu",
                    tint = Color.White
                )
            }

        }
        , actions = {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Share, contentDescription = "share",
                    tint = Color.Black )


            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Menu",
                    tint = Color.Black )


            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Notifications, contentDescription = "Menu",
                    tint = Color.Black )


            }

        }


    )

//end topbar

Column(
    modifier = Modifier
        .verticalScroll(rememberScrollState())
)
{
   Text(
       text = "Tickets",
       fontFamily = FontFamily.Cursive,
       fontSize = 40.sp,
       fontWeight = FontWeight.ExtraBold,
       modifier = Modifier.padding(20.dp)
   )

Spacer(modifier = Modifier.height(10.dp))

//row 1
Row(
modifier = Modifier.padding(start = 25.dp)

) {

//Col 1
    Column {
        Card(
            modifier = Modifier
                .width(160.dp)
                .height(100.dp)
        ) {

            Box(modifier =Modifier.fillMaxWidth() ,
                contentAlignment = Alignment.Center,

                ){
                Image(painter = painterResource(id = R.drawable.bann),
                    contentDescription ="thiland",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription ="favorite",
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(15.dp)

                )

            }

        }
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Rongai",
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(15.dp)

        )
        Spacer(modifier = Modifier.height(2.dp))
        Row (){
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "50,555 reviews",
            fontFamily = FontFamily.Serif,
            fontSize = 15.sp,


            )
        Text(
            text = "From Ksh.5000000",
            fontFamily = FontFamily.Serif,
            fontSize = 15.sp,
            color = Color.Blue

        )
        Spacer(modifier = Modifier.height(2.dp))
        Row {
            OutlinedButton(onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0720245837".toUri()
                mContext.startActivity(callIntent) }
            ) {
                Text(text = "call")
            }
            OutlinedButton(onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent) }
            ) {
                Text(text = "email")
            }
        }


    }


    //End col
    Spacer(modifier = Modifier.width(10.dp))
//Col 1
    Column {
        Card(
            modifier = Modifier
                .width(160.dp)
                .height(100.dp)
        ) {

            Box(modifier =Modifier.fillMaxWidth() ,
                contentAlignment = Alignment.Center,

                ){
                Image(painter = painterResource(id = R.drawable.bannn),
                    contentDescription ="thiland",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription ="favorite",
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(15.dp)

                )

            }

        }
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "xclusive",
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(15.dp)

        )
        Spacer(modifier = Modifier.height(2.dp))
        Row (){
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "50,555 reviews",
            fontFamily = FontFamily.Serif,
            fontSize = 15.sp,


            )
        Text(
            text = "From Ksh.5000000",
            fontFamily = FontFamily.Serif,
            fontSize = 15.sp,
            color = Color.Blue

        )
        Spacer(modifier = Modifier.height(2.dp))
        Row {
            OutlinedButton(onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0720245837".toUri()
                mContext.startActivity(callIntent) }
            ) {
                Text(text = "call")
            }
            OutlinedButton(onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent) }
            ) {
                Text(text = "email")
            }
        }


    }


    //End col
}
// end row
    Spacer(modifier = Modifier.height(20.dp))
//row 1
    Row(
        modifier = Modifier.padding(start = 25.dp)

    ) {

//Col 1
        Column {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(modifier =Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center,

                    ){
                    Image(painter = painterResource(id = R.drawable.ban),
                        contentDescription ="thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription ="favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)

                    )

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Thiland",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(15.dp)

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row (){
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "50,555 reviews",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "From Ksh.5000000",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent) }
                ) {
                    Text(text = "call")
                }
                OutlinedButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent) }
                ) {
                    Text(text = "email")
                }
            }


        }


        //End col
        Spacer(modifier = Modifier.width(10.dp))
//Col 1
        Column {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(modifier =Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center,

                    ){
                    Image(painter = painterResource(id = R.drawable.bg),
                        contentDescription ="thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription ="favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)

                    )

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Mombasa",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(15.dp)

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row (){
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "50,555 reviews",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "From Ksh.5000000",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent) }
                ) {
                    Text(text = "call")
                }
                OutlinedButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent) }
                ) {
                    Text(text = "email")
                }
            }


        }


        //End col
    }
// end row
    Spacer(modifier = Modifier.height(20.dp))

    //row 1
    Row(
        modifier = Modifier.padding(start = 25.dp)

    ) {

//Col 1
        Column {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(modifier =Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center,

                    ){
                    Image(painter = painterResource(id = R.drawable.bann),
                        contentDescription ="thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription ="favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)

                    )

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Dubai",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(15.dp)

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row (){
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "50,555 reviews",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "From Ksh.5000000",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent) }
                ) {
                    Text(text = "call")
                }
                OutlinedButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent) }
                ) {
                    Text(text = "email")
                }
            }


        }


        //End col
        Spacer(modifier = Modifier.width(10.dp))
//Col 1
        Column {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(modifier =Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center,

                    ){
                    Image(painter = painterResource(id = R.drawable.ban),
                        contentDescription ="thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription ="favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)

                    )

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Switzerland",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(15.dp)

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row (){
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "50,555 reviews",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "From Ksh.5000000",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent) }
                ) {
                    Text(text = "call")
                }
                OutlinedButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent) }
                ) {
                    Text(text = "email")
                }
            }


        }


        //End col
    }
// end row
    Spacer(modifier = Modifier.height(20.dp))

    //row 1
    Row(
        modifier = Modifier.padding(start = 25.dp)

    ) {

//Col 1
        Column {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(modifier =Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center,

                    ){
                    Image(painter = painterResource(id = R.drawable.bann),
                        contentDescription ="thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription ="favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)

                    )

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "xclusive",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(15.dp)

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row (){
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "50,555 reviews",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "From Ksh.5000000",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent) }
                ) {
                    Text(text = "call")
                }
                OutlinedButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent) }
                ) {
                    Text(text = "email")
                }
            }


        }


        //End col
        Spacer(modifier = Modifier.width(10.dp))
//Col 1
        Column {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(modifier =Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center,

                    ){
                    Image(painter = painterResource(id = R.drawable.bann),
                        contentDescription ="thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription ="favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)

                    )

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Ruai",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(15.dp)

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row (){
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "50,555 reviews",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "From Ksh.5000000",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent) }
                ) {
                    Text(text = "call")
                }
                OutlinedButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent) }
                ) {
                    Text(text = "email")
                }
            }


        }


        //End col
    }
// end row
    Spacer(modifier = Modifier.height(20.dp))

    //row 1
    Row(
        modifier = Modifier.padding(start = 25.dp)

    ) {

//Col 1
        Column {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(modifier =Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center,

                    ){
                    Image(painter = painterResource(id = R.drawable.bann),
                        contentDescription ="thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription ="favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)

                    )

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "xclusive",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(15.dp)

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row (){
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "50,555 reviews",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "From Ksh.5000000",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent) }
                ) {
                    Text(text = "call")
                }
                OutlinedButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent) }
                ) {
                    Text(text = "email")
                }
            }


        }


        //End col
        Spacer(modifier = Modifier.width(10.dp))
//Col 1
        Column {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(modifier =Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center,

                    ){
                    Image(painter = painterResource(id = R.drawable.bann),
                        contentDescription ="thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription ="favorite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)

                    )

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "xclusive",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(15.dp)

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row (){
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "50,555 reviews",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "From Ksh.5000000",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent) }
                ) {
                    Text(text = "call")
                }
                OutlinedButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent) }
                ) {
                    Text(text = "email")
                }
            }


        }


        //End col
    }
// end row
    Spacer(modifier = Modifier.height(20.dp))



}
}
}

@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()
}