package com.kirillmesh.firstcomposeapplication.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
            ) {
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
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            bottomText,
            fontSize = 12.sp,
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