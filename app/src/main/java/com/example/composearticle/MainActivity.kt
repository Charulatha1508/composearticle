package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(Modifier.padding(16.dp))
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column{
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = stringResource(id = R.string.heading),
            modifier = modifier,
            fontSize = 24.sp
        )
        Text(
            text = stringResource(id = R.string.paragraph_1),
            modifier = modifier,
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(id = R.string.paragraph_2),
            modifier = modifier,
            textAlign = TextAlign.Justify
        )
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Article(Modifier.padding(16.dp))
    }
}