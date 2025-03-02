package com.hfad.up01_glava5_shehovcov

import OrderNowBottomBar
import OrderNowTopBar
import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.hfad.up01_glava5_shehovcov.ui.theme.Up01_glava5_ShehovcovTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OrderNowScreen()
        }
    }
}

annotation class AndroidEntryPoint


@Composable
fun OrderNowScreen() {
    OrderNowTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Scaffold(
                topBar = { OrderNowTopBar() },
                bottomBar = { OrderNowBottomBar() }
            ) { contentPadding ->
                println(contentPadding)
            }
        }
    }
}

class MaterialTheme {

}

@Composable
fun OrderNowTheme(content: () -> Unit) {

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Up01_glava5_ShehovcovTheme {
        Greeting("Android")
    }
    @HiltAndroidApp
    class OrderNowApplication: Application()
}

annotation class HiltAndroidApp

annotation class HiltViewModel

annotation class Inject


@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
}

fun hiltViewModel(): Any {

}

private operator fun Any.invoke(value: () -> Unit): HomeViewModel {

}

@JvmOverloads
@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()(
{
}