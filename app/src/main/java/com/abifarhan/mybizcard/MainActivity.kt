package com.abifarhan.mybizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abifarhan.mybizcard.ui.theme.MyBizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBizCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CreateBizCard()
                }

            }
        }
    }
}

@Composable
fun CreateBizCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(12.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            backgroundColor = Color.White,
            elevation = 4.dp
        ) {
            Column(
                modifier = Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreateImageProfile()
                Divider(
                )
                CreateInfo()
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Portfolio",
                    style = MaterialTheme.typography.button)
                }

            }
                        
        }
    }
}

@Preview
@Composable
fun Content() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Surface(modifier = Modifier
            .padding(3.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
            shape = RoundedCornerShape(corner = CornerSize(6.dp)),
            border = BorderStroke(width = 2.dp, color = Color.LightGray)
        ) {

            PortFolio(data = listOf("Project 1", "Project 2", "Project 3"))

        }
    }
}

@Composable
fun PortFolio(data: List<String>) {
    Text(text = "Projects go here!")
}

@Composable
private fun CreateInfo() {
    Column(modifier = Modifier.padding(5.dp)) {
        Text(
            text = "Miles P. +",
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.primaryVariant
        )

        Text(
            text = "Android Compose Programmer",
            modifier = Modifier.padding(3.dp)
        )

        Text(
            text = "@themilesCompose",
            modifier = Modifier.padding(2.dp),
            style = MaterialTheme.typography.subtitle1
        )

    }
}

@Composable
private fun CreateImageProfile(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(150.dp, 150.dp)
            .padding(5.dp),
        shape = CircleShape,
        border = BorderStroke(0.5.dp, Color.LightGray),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_person_24),
            contentDescription = "Profile Image",
            modifier = Modifier.size(135.dp)
        )
    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MyBizCardTheme {
//        CreateBizCard()
//    }
//}