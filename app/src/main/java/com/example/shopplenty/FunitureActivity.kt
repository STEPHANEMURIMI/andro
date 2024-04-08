package com.example.shopplenty

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.shopplenty.ui.theme.ShopPlentyTheme

class FunitureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         MyFuniture()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyFuniture(){

    Column() {

//Topappbar
        TopAppBar(
            title = { Text(text = "",
                color = Color.Black,

                ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "A",
                        tint = Color.White
                    )
                }

            }
            , actions = {



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


Row (
    modifier = Modifier.horizontalScroll(rememberScrollState())
){
    Text(
        text = " Chairs",
        fontSize = 30.sp,
        fontFamily = FontFamily.Serif,

        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold


    )
    Spacer(modifier = Modifier.width(20.dp))
    Text(
        text = " Tables",
        fontSize = 30.sp,
        fontFamily = FontFamily.Serif,

        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold


    )
    Spacer(modifier = Modifier.width(20.dp))
    Text(
        text = " Sofa",
        fontSize = 30.sp,
        fontFamily = FontFamily.Serif,

        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold


    )
    Spacer(modifier = Modifier.width(20.dp))
    Text(
        text = " Beds",
        fontSize = 30.sp,
        fontFamily = FontFamily.Serif,

        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold


    )

    
}

Column {
    Row {
        Text(text = "120products",
            fontSize = 25.sp

        )

        Spacer(modifier = Modifier.width(100.dp))
        Row {
            Text(
                text = "Popular",
                fontFamily = FontFamily.Serif,
                fontSize = 25.sp,


                )
            Spacer(modifier = Modifier.width(0.dp))

            IconButton(onClick = {
            }
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown, contentDescription = "A",
                    tint = Color.Black

                )
            }


        }
    }
}
Column() {


//row 1
        Row(
            modifier = Modifier.padding(start = 25.dp)

        ) {


//Col 1
            Column {
                Spacer(modifier = Modifier.height(50.dp))

                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(100.dp)
                ) {

                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center,

                        ) {
                        Spacer(modifier = Modifier.width(2.dp))

                        Image(
                            painter = painterResource(id = R.drawable.bann),
                            contentDescription = "thiland",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                }
                Spacer(modifier = Modifier.height(20.dp))

                Row() {
                    Text(
                        text = "AmosChairs",
                        fontFamily = FontFamily.Serif,
                        fontSize = 25.sp,


                        )
                    Spacer(modifier = Modifier.height(30.dp))

                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "We are having trouble ",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,


                    )
                Text(
                    text = "restoring your last bg ",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,


                    )
                Spacer(modifier = Modifier.height(20.dp))

                Row {
                    Text(
                        text = "$680",
                        fontFamily = FontFamily.Serif,
                        fontSize = 25.sp,


                        )
                    Spacer(modifier = Modifier.width(50.dp))

                    IconButton(onClick = {
                    }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart, contentDescription = "A",
                            tint = Color.Black

                        )
                    }


                }
                Spacer(modifier = Modifier.height(2.dp))
                Row {


                }


            }
            //End col
            Spacer(modifier = Modifier.width(20.dp))

//Col 1
            Column {
                Spacer(modifier = Modifier.height(50.dp))

                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(100.dp)
                ) {

                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center,

                        ) {
                        Spacer(modifier = Modifier.width(2.dp))

                        Image(
                            painter = painterResource(id = R.drawable.bann),
                            contentDescription = "thiland",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                }
                Spacer(modifier = Modifier.height(20.dp))

                Row() {
                    Text(
                        text = "AmosChairs",
                        fontFamily = FontFamily.Serif,
                        fontSize = 25.sp,


                        )
                    Spacer(modifier = Modifier.height(30.dp))

                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "We are having trouble ",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,


                    )
                Text(
                    text = "restoring your last bg ",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,


                    )
                Spacer(modifier = Modifier.height(20.dp))

                Row {
                    Text(
                        text = "$680",
                        fontFamily = FontFamily.Serif,
                        fontSize = 25.sp,


                        )
                    Spacer(modifier = Modifier.width(50.dp))

                    IconButton(onClick = {
                    }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart, contentDescription = "A",
                            tint = Color.Black

                        )
                    }


                }
                Spacer(modifier = Modifier.height(2.dp))
                Row {


                }


            }
            //End col

        }
    // end row
//row 1
    Row(
        modifier = Modifier.padding(start = 25.dp)

    ) {


//Col 1
        Column {
            Spacer(modifier = Modifier.height(50.dp))

            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,

                    ) {
                    Spacer(modifier = Modifier.width(2.dp))

                    Image(
                        painter = painterResource(id = R.drawable.bann),
                        contentDescription = "thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )


                }

            }
            Spacer(modifier = Modifier.height(20.dp))

            Row() {
                Text(
                    text = "AmosChairs",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.height(30.dp))

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "We are having trouble ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "restoring your last bg ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(
                    text = "$680",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.width(50.dp))

                IconButton(onClick = {
                }
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart, contentDescription = "A",
                        tint = Color.Black

                    )
                }


            }
            Spacer(modifier = Modifier.height(2.dp))
            Row {


            }


        }
        //End col
        Spacer(modifier = Modifier.width(20.dp))

//Col 1
        Column {
            Spacer(modifier = Modifier.height(50.dp))

            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,

                    ) {
                    Spacer(modifier = Modifier.width(2.dp))

                    Image(
                        painter = painterResource(id = R.drawable.bann),
                        contentDescription = "thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )


                }

            }
            Spacer(modifier = Modifier.height(20.dp))

            Row() {
                Text(
                    text = "AmosChairs",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.height(30.dp))

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "We are having trouble ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "restoring your last bg ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(
                    text = "$680",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.width(50.dp))

                IconButton(onClick = {
                }
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart, contentDescription = "A",
                        tint = Color.Black

                    )
                }


            }
            Spacer(modifier = Modifier.height(2.dp))
            Row {


            }


        }
        //End col

    }
    // end row
    //row 1
    Row(
        modifier = Modifier.padding(start = 25.dp)

    ) {


//Col 1
        Column {
            Spacer(modifier = Modifier.height(50.dp))

            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,

                    ) {
                    Spacer(modifier = Modifier.width(2.dp))

                    Image(
                        painter = painterResource(id = R.drawable.bann),
                        contentDescription = "thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )


                }

            }
            Spacer(modifier = Modifier.height(20.dp))

            Row() {
                Text(
                    text = "AmosChairs",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.height(30.dp))

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "We are having trouble ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "restoring your last bg ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(
                    text = "$680",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.width(50.dp))

                IconButton(onClick = {
                }
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart, contentDescription = "A",
                        tint = Color.Black

                    )
                }


            }
            Spacer(modifier = Modifier.height(2.dp))
            Row {


            }


        }
        //End col
        Spacer(modifier = Modifier.width(20.dp))

//Col 1
        Column {
            Spacer(modifier = Modifier.height(50.dp))

            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,

                    ) {
                    Spacer(modifier = Modifier.width(2.dp))

                    Image(
                        painter = painterResource(id = R.drawable.bann),
                        contentDescription = "thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )


                }

            }
            Spacer(modifier = Modifier.height(20.dp))

            Row() {
                Text(
                    text = "AmosChairs",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.height(30.dp))

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "We are having trouble ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "restoring your last bg ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(
                    text = "$680",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.width(50.dp))

                IconButton(onClick = {
                }
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart, contentDescription = "A",
                        tint = Color.Black

                    )
                }


            }
            Spacer(modifier = Modifier.height(2.dp))
            Row {


            }


        }
        //End col

    }
    // end row
    //row 1
    Row(
        modifier = Modifier.padding(start = 25.dp)

    ) {


//Col 1
        Column {
            Spacer(modifier = Modifier.height(50.dp))

            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,

                    ) {
                    Spacer(modifier = Modifier.width(2.dp))

                    Image(
                        painter = painterResource(id = R.drawable.bann),
                        contentDescription = "thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )


                }

            }
            Spacer(modifier = Modifier.height(20.dp))

            Row() {
                Text(
                    text = "AmosChairs",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.height(30.dp))

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "We are having trouble ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "restoring your last bg ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(
                    text = "$680",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.width(50.dp))

                IconButton(onClick = {
                }
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart, contentDescription = "A",
                        tint = Color.Black

                    )
                }


            }
            Spacer(modifier = Modifier.height(2.dp))
            Row {


            }


        }
        //End col
        Spacer(modifier = Modifier.width(20.dp))

//Col 1
        Column {
            Spacer(modifier = Modifier.height(50.dp))

            Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            ) {

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,

                    ) {
                    Spacer(modifier = Modifier.width(2.dp))

                    Image(
                        painter = painterResource(id = R.drawable.bann),
                        contentDescription = "thiland",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )


                }

            }
            Spacer(modifier = Modifier.height(20.dp))

            Row() {
                Text(
                    text = "AmosChairs",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.height(30.dp))

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "We are having trouble ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Text(
                text = "restoring your last bg ",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,


                )
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(
                    text = "$680",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,


                    )
                Spacer(modifier = Modifier.width(50.dp))

                IconButton(onClick = {
                }
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart, contentDescription = "A",
                        tint = Color.Black

                    )
                }


            }
            Spacer(modifier = Modifier.height(2.dp))
            Row {


            }


        }
        //End col

    }
    // end row

}
            Spacer(modifier = Modifier.width(10.dp))
        }




    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyfunPreview(){
    MyFuniture()
}