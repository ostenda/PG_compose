package com.example.pg_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pg_compose.ui.theme.PG_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                   // .requiredWidth(600.dp)

                    .border(5.dp,Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp,Color.Blue)
                    .padding(5.dp)
                    .border(10.dp,Color.Red)
                    .padding(10.dp)
            )
            {
                Text("Hello", modifier = Modifier
                    .clickable {  }
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text("World")
            }
            }
        }
    }


