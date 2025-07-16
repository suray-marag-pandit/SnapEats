package com.example.snapeats.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.snapeats.R
import java.nio.file.WatchEvent

@Composable
fun DiningScreenContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        Text0fExploreImage()

        ExploreImage()

        TextAbove()

        Spacer(modifier = Modifier.height(8.dp))

//        CarnivalCard()

        Spacer(modifier = Modifier.height(8.dp))

//        TextBelow()

        Spacer(modifier = Modifier.height(8.dp))

//        MatchCard()
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun Text0fExploreImage() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 16.dp)
    ) {
        Box(

            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(Color.LightGray)

        )

        Text(
            text = "EXPLORE",
            style = TextStyle(
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.Light,
                letterSpacing = 2.sp,
            ),
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 8.dp),
            textAlign = TextAlign.Center
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(Color.LightGray)
        )
    }
}

@Composable
fun ExploreImage() {

    Image(
        painter = painterResource(id = R.drawable.exploree),
        contentDescription = "image",
        modifier = Modifier
            .fillMaxWidth()
            .size(300.dp),

        )
}
@Preview(showBackground = true)
@Composable
fun TextAbove() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 16.dp)
    ) {

        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .weight(1f)
                .height(1.dp)
        ) {
            Text(
                text = "OFFERS CURATED FOR YOU",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Light,
                    letterSpacing = 2.sp
                ),

                modifier = Modifier.padding(vertical = 8.dp, horizontal = 8.dp),
                textAlign = TextAlign.Center
            )
        }
        Box(
            modifier = Modifier
                .background(Color.LightGray).weight(1f)
                .height(1.dp)
        )
    }
}