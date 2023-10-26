package com.example.articulo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulo.ui.theme.ArticuloTheme

//SEGUNDA SOLUCION --> ESTA ES MEJOR, SIGUE MEJOR LAS BUENAS PRACTICAS HACIENDO QUE SEA MAS ESCALABLE, ETC
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FinalArticle()
                }
            }
        }
    }
}

@Composable
fun FinalArticle() {
    Article (
        title = stringResource(R.string.title),
        secondText = stringResource(R.string.second),
        thirdText = stringResource(R.string.third),
    )
}



@Composable
fun Article(title: String, secondText: String, thirdText: String, modifier: Modifier = Modifier) {
    //Si quisiera parametrizar la img, seria --> image: Painter en cabecera. Este param seria el valor q se pasaria a Image()
    //A la hora de llamar a la funcion con valores, seria: image = painterResource(R.drawable.bg_compose_background)
    val image = painterResource(id = R.drawable.bg_compose_background )

    Column (modifier = modifier) {

        Image(
            painter = image,
            contentDescription = null
        )

        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = secondText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)


        )

        Text(
            text = thirdText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArticuloTheme {
        FinalArticle()
    }
}








//PRIMERA SOLUCION
/*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleImage()
                }
            }
        }
    }
}




@Composable
fun Title(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)
    )
}

@Composable
fun SecondText(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)


    )
}

@Composable
fun ThirdText(name:String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)
    )

}


@Composable
fun ArticleImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)

    Column (modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null
        )

        Title(
            name = stringResource(R.string.title),
        )

        SecondText(
            name = stringResource(R.string.second)
        )

        ThirdText(
            name = stringResource(R.string.third)
        )
    }

}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArticuloTheme {
        ArticleImage()
    }
}
 */