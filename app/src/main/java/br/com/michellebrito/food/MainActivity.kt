package br.com.michellebrito.food

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.michellebrito.food.ui.theme.FoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodTheme {
                Surface {
                    MyComposable()
                }
            }
        }
    }
}

@Composable
fun MyComposable() {
    Text("Compose study")
}

@Preview(showBackground = true, showSystemUi = true )
@Composable
fun DefaultPreview() {
    FoodTheme {
        MyComposable()
    }
}