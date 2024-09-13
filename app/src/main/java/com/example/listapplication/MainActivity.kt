package com.example.listapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.listapplication.ui.theme.ListApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PreviewScreen()
            }
        }
    }
//@Preview(showSystemUi = true)
@Composable
fun PreviewCard() {
    // Sample list of data to display
    val cardData = listOf(
        CardData("VIIT Canteen", "Serves Chinese, South Indian, Punjabi Food", "9:00AM - 5:00PM", R.drawable.viitcanteenpic),
        CardData("VIIT Cafeteria", "Serves South Indian, Chinese, Juices, Indian Food", "10:30AM - 3:30PM", R.drawable.viitcafeteria),
        CardData("VIIT Canteen", "Serves Chinese, South Indian, Punjabi Food", "9:00AM - 5:00PM", R.drawable.viitcanteenpic),
        CardData("VIIT Cafeteria", "Serves South Indian, Chinese, Juices, Indian Food", "10:30AM - 3:30PM", R.drawable.viitcafeteria)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(cardData.size) { index ->
            card(
                titlename = cardData[index].title,
                category = cardData[index].category,
                times = cardData[index].timings,
                img = cardData[index].img
            )
        }
    }
}


data class CardData(
    val title: String,
    val category: String,
    val timings: String,
    val img: Int
)
@Composable
fun card(titlename: String, category: String , times: String, img: Int) {

    Card(
        elevation = CardDefaults.cardElevation(),
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .width(400.dp)
            .height(305.dp)
            .size(100.dp)
            .padding(15.dp, 35.dp, 15.dp, 15.dp),
        colors = CardDefaults.cardColors(Color.LightGray),
        


    ) {
        Column {
            Image(
                painter = painterResource(id = img),
                contentDescription = "graphimage",
                alignment = Alignment.Center,

                modifier = Modifier
                    .padding(50.dp, 15.dp, 0.dp, 0.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .width(220.dp)
                    .size(120.dp)
//                    .border(2.dp, Color.Gray, RoundedCornerShape(20.dp))
            )
            Text(
                text = titlename,
//                text="Serves",
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier.Companion

                    .align(Alignment.CenterHorizontally)
                    .width(400.dp)
                    .padding(0.dp, 5.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = category,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(0.dp, 5.dp)
                    ,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,

                )
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Timings: ")
                    }
                    append(times) // Add the complete time (e.g., "9:00AM - 5:00PM")
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
//                    .align(alignment = Alignment.Vertical)
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                    .background(Color.Yellow)
//                    .padding(4.dp)  // Adjust padding inside the background
                    .fillMaxWidth()
                    .fillMaxHeight(),  // Make sure the text takes up available width
                textAlign = TextAlign.Center
            )
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun PreviewScreen(){
    firstpage()
}
@Composable
fun firstpage(){


}




