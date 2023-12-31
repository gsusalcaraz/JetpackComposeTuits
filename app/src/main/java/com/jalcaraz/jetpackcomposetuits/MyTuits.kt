package com.jalcaraz.jetpackcomposetuits

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyTuits() {

    Row(
        Modifier
            .fillMaxWidth()
            .background(Color(0xFF161D26))
            .padding(16.dp)
    ) {
        LeftSide()
        RigthSide()
    }

}

@Composable
fun RigthSide() {
    var chat by remember {
        mutableStateOf(false)
    }

    var rt by remember {
        mutableStateOf(false)
    }
    var like by remember {
        mutableStateOf(false)
    }

    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            TextTitle("Aris", Modifier.padding(end = 8.dp))
            DefaultText("@AristiDevs", Modifier.padding(end = 8.dp))
            DefaultText("4h")
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.ic_dots),
                contentDescription = "menu",
                tint = Color.White
            )
        }
        TextBody(
            "Text1Text1Text1Text1T  xt1Text1Text1Text1Text1Text1Text1Tex" +
                    "Text1Text1Text1Text1T  xt1Text1Text1Text1Text1Text1Text1Tex" +
                    "Text1Text1Text1Text1T  xt1Text1Text1Text1Text1Text1Text1Tex" +
                    "Text1Text1Text1Text1T  xt1Text1Text1Text1Text1Text1Text1Tex" +
                    "Text1Text1Text1Text1T  xt1Text1Text1Text1Text1Text1Text1Tex",
            modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Imagen Tuit",
            Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip((RoundedCornerShape(10))),
            contentScale = ContentScale.Crop
        )
        Row(Modifier.padding(top = 16.dp)) {
            MyIcons(
                modifier = Modifier.weight(1f),
                unselectedIcon = {
                    Icon(
                        painterResource(id = R.drawable.ic_chat),
                        "",
                        tint = Color(0xFF7E8B98)
                    )
                },
                selectedIcon = {
                    Icon(
                        painterResource(id = R.drawable.ic_chat_filled),
                        "",
                        tint = Color(0xFF7E8B98)
                    )
                },
                isSelected = chat
            ) {
                chat = !chat
            }

            MyIcons(
                modifier = Modifier.weight(1f),
                unselectedIcon = {
                    Icon(
                        painterResource(id = R.drawable.ic_rt),
                        "",
                        tint = Color(0xFF7E8B98)
                    )
                },
                selectedIcon = {
                    Icon(
                        painterResource(id = R.drawable.ic_rt),
                        "",
                        tint = Color(0xFF8BC34A)
                    )
                },
                isSelected = rt
            ) {
                rt = !rt
            }

            MyIcons(
                modifier = Modifier.weight(1f),
                unselectedIcon = {
                    Icon(
                        painterResource(id = R.drawable.ic_like),
                        "",
                        tint = Color(0xFF7E8B98)
                    )
                },
                selectedIcon = {
                    Icon(
                        painterResource(id = R.drawable.ic_like_filled),
                        "",
                        tint = Color(0xFFF44336)
                    )
                },
                isSelected = like
            ) {
                like = !like
            }
        }
    }
}

@Composable
fun TextTitle(title: String, modifier: Modifier = Modifier) {
    Text(text = title, color = Color.White, fontWeight = FontWeight.ExtraBold, modifier = modifier)
}

@Composable
fun DefaultText(title: String, modifier: Modifier = Modifier) {
    Text(text = title, color = Color.LightGray, fontWeight = FontWeight.Bold, modifier = modifier)
}

@Composable
fun TextBody(title: String, modifier: Modifier = Modifier) {
    Text(text = title, color = Color.White, modifier = modifier)
}

@Composable
fun MyIcons(
    modifier: Modifier,
    unselectedIcon: @Composable () -> Unit,
    selectedIcon: @Composable () -> Unit,
    isSelected: Boolean,
    onItemSelected: () -> Unit
) {
    val defaultValue = 1

    Row(
        modifier = modifier.clickable { onItemSelected() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (isSelected) {
            selectedIcon()
        } else {
            unselectedIcon()
        }
        Text(
            text = if (isSelected) (defaultValue + 1).toString() else defaultValue.toString(),
            color = Color(0xFF7E8B98),
            fontSize = 12.sp, modifier = Modifier.padding(start = 4.dp)
        )
    }

}

@Composable
fun LeftSide() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "image profile",
        Modifier
            .size(55.dp)
            .clip(shape = CircleShape)
    )
}

@Composable
fun TuitDivider() {
    Divider(
        Modifier
            .padding(top = 4.dp)
            .height(1.dp)
            .fillMaxWidth(),
        color = Color(0xFF7E8B98)
    )
}
