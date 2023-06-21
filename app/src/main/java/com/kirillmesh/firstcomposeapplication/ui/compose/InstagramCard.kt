package com.kirillmesh.firstcomposeapplication.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kirillmesh.firstcomposeapplication.R

@Preview(showBackground = true)
@Composable
fun InstagramCard() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier
            .size(50.dp)){
            Image(
                imageVector =
                ImageVector.vectorResource(id = R.drawable.instagram_icon),
                contentDescription = "Instagram icon",
                alignment = Alignment.Center,
                modifier = Modifier
                    .padding(5.dp)
            )
        }

        InstagramCardColumns(
            topText = "6,950",
            bottomText = "Posts",
            modifier = Modifier
        )
        InstagramCardColumns(
            topText = "436M",
            bottomText = "Followers",
            modifier = Modifier
        )
        InstagramCardColumns(
            topText = "76",
            bottomText = "Following",
            modifier = Modifier
        )
    }
}

@Composable
private fun InstagramCardColumns(
    topText: String,
    bottomText: String,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly

    ){
        Box(contentAlignment = Alignment.Center){
            Text(
                text = topText,
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic
            )
        }
        Box(contentAlignment = Alignment.Center){
            Text(bottomText)
        }

    }
}
