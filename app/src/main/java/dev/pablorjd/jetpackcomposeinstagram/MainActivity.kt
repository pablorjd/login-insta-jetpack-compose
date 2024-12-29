package dev.pablorjd.jetpackcomposeinstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.pablorjd.jetpackcomposeinstagram.login.ui.LoginScreen
import dev.pablorjd.jetpackcomposeinstagram.login.ui.LoginViewModel
import dev.pablorjd.jetpackcomposeinstagram.ui.theme.JetpackComposeInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeInstagramTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        LoginScreen(LoginViewModel()) // le paso el viewmodel que estoy usando
                    }

                }
            }
        }
    }
}



@Preview(showBackground = true, device = "id:pixel_5")
@Composable
fun GreetingPreview() {
    JetpackComposeInstagramTheme {

    }
}