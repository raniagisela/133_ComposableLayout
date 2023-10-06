package com.example.latihan2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihan2.ui.theme.Latihan2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Latihan2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    TampilLayar(getString(R.string.greeting), getString(R.string.nama))
                }
            }
        }
    }
}

@Composable
fun TampilText(message:String, from:String, modifier: Modifier=Modifier) {
    Column(verticalArrangement = Arrangement.Center,
            modifier = modifier) {
        Text(
                color = Color.Blue,
                text = message,
                fontSize = 100.sp,
                lineHeight = 110.sp,
                textAlign = TextAlign.Center
            )
        Text(
                color = Color.Red,
                text = from,
                fontSize = 60.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun TampilLayar(pesan: String, dari: String){
    val image = painterResource(R.drawable.download)
    Box {
        Image(painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.fillMaxSize())

        TampilText(
            message = pesan,
            from = dari,
            modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Latihan2Theme {
        TampilLayar("Selamat Pagi","Dari UMY")
    }
}