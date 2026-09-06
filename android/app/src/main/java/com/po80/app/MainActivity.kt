package com.po80.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PO80App()
        }
    }
}

@Composable
fun PO80App() {

    var status by remember {
        mutableStateOf("PO80 READY")
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "PO80",
                style = MaterialTheme.typography.displayLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Personal Connectivity System",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = status,
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    status = "RECARGANDO..."
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("RECARGAR")
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {
                    status = "SISTEMA ACTIVADO"
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("USAR / ACTIVAR")
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {
                    status = "SISTEMA APAGADO"
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("APAGAR")
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {
                    status = "SISTEMA PRENDIDO"
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("PRENDER")
            }
        }
    }
}
