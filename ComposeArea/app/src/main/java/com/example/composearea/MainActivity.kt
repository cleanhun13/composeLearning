package com.example.composearea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearea.ui.theme.ComposeAreaTheme
import kotlin.io.encoding.Base64
import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeAreaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    CoposeArea()
                }
            }
        }
    }
}

@Composable
fun CoposeArea(){
    Column(
        Modifier.fillMaxWidth()
    ) {
        Row(Modifier.weight(1f)) {
            TextComponent(
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
                )
            TextComponent(
                title = "Image composable",
                content = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            TextComponent(
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            TextComponent(
                title = "Image composable",
                content = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun TextComponent(
    title:String,
    content:String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text=title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAreaTheme {
        CoposeArea()
    }
}