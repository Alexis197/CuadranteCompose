package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CuadranteLibreta()
                }
            }
        }
    }
}

@Composable
fun CuadranteLibreta() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            InformacionCuadrante(
                titulo = stringResource(R.string.titulo_1),
                descripcion = stringResource(R.string.descripcion_1),
                colorFondo = androidx.compose.ui.graphics.Color.Blue,
                modifier = Modifier.weight(1f)
            )
            InformacionCuadrante(
                titulo = stringResource(R.string.titulo_2),
                descripcion = stringResource(R.string.descripcion_2),
                colorFondo = androidx.compose.ui.graphics.Color.DarkGray,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            InformacionCuadrante(
                titulo = stringResource(R.string.titulo_3),
                descripcion  = stringResource(R.string.descripcion_3),
                colorFondo = androidx.compose.ui.graphics.Color.Red,
                modifier = Modifier.weight(1f)
            )
            InformacionCuadrante(
                titulo = stringResource(R.string.titulo_4),
                descripcion = stringResource(R.string.descripcion_4),
                colorFondo = androidx.compose.ui.graphics.Color.Black,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun InformacionCuadrante(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CuadranteComposeTheme {
        CuadranteLibreta()
    }
}