package com.example.composearcticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearcticle.ui.theme.ComposeArcticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArcticleTheme() {

            }
        }
    }
}

@Composable
fun ComposeArcticle(title:String, abstrsct:String, content:String, modifier: Modifier){
    Column() {

        Text(
            text=title,
            fontSize = 24.sp,
            modifier= Modifier.padding(16.dp)
        )
        Text(
            text=abstrsct,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end=16.dp),
        )
        Text(
            text=content,
            textAlign = TextAlign.Justify,
            modifier= Modifier.padding(16.dp)
        )


    }
}

@Composable
fun Image(){

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArcticleTheme() {
        ComposeArcticle(
            title= stringResource(R.string.compose_arcticle_title),
            abstrsct = stringResource(R.string.compose_arcticle_abstract),
            content = stringResource(R.string.compose_arcticle_content),
            modifier = Modifier,
        )
    }
}