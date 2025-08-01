package com.example.myappdemo1

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myappdemo1.ui.theme.MyAppDemo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppDemo1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeText(title = stringResource(R.string.compose_arcticle_title),
                        abstract = stringResource(R.string.compose_arcticle_abstract),
                        content = stringResource(R.string.compose_arcticle_content),
                        modifier = Modifier)

                }
                }
            }
        }
    }

@Composable
fun ComposeText(title: String, abstract: String, content:String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier.fillMaxSize(),
    ) {
        val image = painterResource(R.drawable.composetop)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth(),
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = abstract,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start=16.dp, end=16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    MyAppDemo1Theme {
        ComposeText(title = stringResource(R.string.compose_arcticle_title),
            abstract = stringResource(R.string.compose_arcticle_abstract),
            content = stringResource(R.string.compose_arcticle_content),
            modifier = Modifier)
    }
}