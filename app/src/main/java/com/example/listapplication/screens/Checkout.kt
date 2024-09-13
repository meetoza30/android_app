package com.example.listapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listapplication.R
import java.lang.reflect.Modifier

@Preview(showSystemUi = true)
@Composable
fun previewcheckout(){
    Checkout()
}
@Composable
fun checkbtn(){
    Column(
        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
    ) {
        Text(
            text = "₹140.00",
            style = MaterialTheme.typography.titleMedium,
            modifier = androidx.compose.ui.Modifier.padding(16.dp),
            color = Color.Black
        )
        Button(
            onClick = { /* Handle checkout */ },
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text(text = "₹140.00 Checkout", color = Color.White)
        }
    }

}


@Composable
fun QuantitySelector() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = androidx.compose.ui.Modifier.padding(0.dp,35.dp).background(Color.Gray, RoundedCornerShape(12.dp)
            )
    ) {
        Text(text = "-", fontSize = 30.sp, modifier = androidx.compose.ui.Modifier.padding(
            10.dp,
            0.dp,
            10.dp,
            0.dp
        )
        )
        Text(text = "1 Qty", color = Color.Black, fontSize = 15.sp)
        Text(text = "+", fontSize = 20.sp, modifier = androidx.compose.ui.Modifier.padding(
            8.dp,
            0.dp,
            10.dp,
            0.dp
        )
        )
    }
}

@Composable
fun addnote(){
    val noteState = remember {
        mutableStateOf("")
    }
    Column(modifier = androidx.compose.ui.Modifier
        .padding(17.dp)) {
        Text(text="ADD A NOTE",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            modifier = androidx.compose.ui.Modifier
                .padding(0.dp, 10.dp)
        )
        TextField(value = noteState.value, onValueChange = {
                newVal -> noteState.value = newVal
        },
          label = { Text(text = " Enter the additional details for your order  ")}
        )
    }


}


@Composable
fun timeinfo(){
    Column( modifier = androidx.compose.ui.Modifier
        .padding(15.dp)){
        Text(
            text = "Time Slot Information",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            modifier = androidx.compose.ui.Modifier
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(13.dp))
        Card() {
            Text(text = "Time slot selected by you is : ",
                modifier = androidx.compose.ui.Modifier
                    .padding(10.dp, 15.dp)
                    ,
                fontSize = 15.sp,
                fontWeight = FontWeight.W600
                )
            Row {
                Box (
                    modifier = androidx.compose.ui.Modifier
                        .background(Color.Gray)
                        .padding(10.dp)
                ) {
                    Row {
                        Text(text = "12:00 PM",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.W700,
                            color = Color.White,
                            modifier = androidx.compose.ui.Modifier
//                            .padding(5.dp)
//                            .background(Color.Gray, RoundedCornerShape(10.dp))
                                .width(195.dp)
//                            .height(25.dp)
                            ,
                        )

                        Text(text = "EDIT TIME SLOT",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.W700,
                            color = Color.Black,
                            modifier = androidx.compose.ui.Modifier
//                            .padding(5.dp)
                                .background(Color.Yellow, RoundedCornerShape(10.dp))
                                .width(145.dp)
                                .height(18.dp)
                            ,
                        )
                    }

                }

            }
        }
    }

}


@Composable
fun CartItemCard() {
    Card(
        shape = RoundedCornerShape(8.dp),

        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = androidx.compose.ui.Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.paneer_65),
                contentDescription = "Item Image",
                modifier = androidx.compose.ui.Modifier
                    .size(110.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .padding(0.dp, 0.dp, 10.dp, 0.dp)
            )

            Column(
                modifier = androidx.compose.ui.Modifier
                    .weight(1f)
                    .padding(5.dp)
            ) {
                Text(
                    text = "Paneer 65",
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = androidx.compose.ui.Modifier.height(8.dp))
                Text(
                    text = "VIIT Canteen",
                    color = Color.Black,
                    style = MaterialTheme.typography.bodySmall,
                    fontSize = 15.sp
//                    modifier = androidx.compose.ui.Modifier.size(20.sp)
                )
                Spacer(modifier = androidx.compose.ui.Modifier.height(8.dp))
                Text(
                    text = "₹140.00",
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }
            Spacer(modifier = androidx.compose.ui.Modifier.width(8.dp))
            QuantitySelector()


        }

    }
}




@Composable
fun Checkout(){
    Column {
        Text(
            text = "My Cart",
            style  = MaterialTheme.typography.headlineLarge,
            modifier = androidx.compose.ui.Modifier.padding((16.dp)),
            textAlign = TextAlign.Center,
            color = Color.Black
        )
        CartItemCard()
        timeinfo()
        addnote()
        checkbtn()
    }

}
