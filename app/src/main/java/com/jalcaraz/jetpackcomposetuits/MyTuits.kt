package com.jalcaraz.jetpackcomposetuits

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MyTuits() {

    Row(Modifier.padding(20.dp)) {
        LeftSide()
        RigthSide()
    }

}

@Composable
fun RigthSide() {
    Column(Modifier.padding(horizontal = 10.dp)) {
        Row (horizontalArrangement = Arrangement.SpaceBetween){
            Text(text = "Aris")
            Spacer(modifier = Modifier.padding(horizontal = 3.dp))
            Text(text = "@AristiDevs")
            Spacer(modifier = Modifier.padding(horizontal = 3.dp))
            Text(text = "4h")
            Icon(painter = painterResource(id = R.drawable.ic_dots), contentDescription = "menu", )
        }
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Text(text = "Text1Text1Text1Text1Text1Text1Text1Text1Text1Text1Text1Text1Text1Text1Text1Text1")
    }
}

@Composable
fun LeftSide() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "image profile",
        Modifier
            .size(50.dp)
            .clip(shape = CircleShape)
    )
}
