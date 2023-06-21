package com.kirillmesh.firstcomposeapplication.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kirillmesh.firstcomposeapplication.R
import com.kirillmesh.firstcomposeapplication.ui.theme.FirstComposeApplicationTheme

@Composable
fun InstagramCard() {
    Card(
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp
        ),
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground),
        backgroundColor = MaterialTheme.colors.background,
        modifier = Modifier
            .padding(4.dp)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    imageVector =
                    ImageVector.vectorResource(id = R.drawable.instagram_icon),
                    contentDescription = "Instagram icon",
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(5.dp)
                )
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
            Text(
                text = "Instagram",
                fontSize = 32.sp,
                fontFamily = FontFamily.Cursive
            )
            Text(
                text = "#YoursToMake",
                fontSize = 14.sp
            )
            Text(
                text = "www.facebook.com/emotional_health",
                fontSize = 14.sp
            )
            Button(onClick = { }) {
                Text(text = "Follow")
            }
        }
    }
}

@Composable
private fun InstagramCardColumns(
    topText: String,
    bottomText: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
        Text(
            text = topText,
            fontSize = 32.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            bottomText,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewCardLight() {
    FirstComposeApplicationTheme(
        darkTheme = false
    ) {
        InstagramCardInBox()
    }
}

@Preview
@Composable
fun PreviewCardDark() {
    FirstComposeApplicationTheme(
        darkTheme = true
    ) {
        InstagramCardInBox()
    }
}

@Composable
private fun InstagramCardInBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
    ) {
        InstagramCard()
    }
}