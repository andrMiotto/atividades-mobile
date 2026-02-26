package com.example.atividades

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atividades.ui.theme.AtividadesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AtividadesTheme {

                desafioFinal(modifier = Modifier.fillMaxSize())

            }
        }
    }
}


@Composable
fun desafioFinal(modifier: Modifier = Modifier) {

    var corFundo by remember {
        mutableStateOf(Color.Black)
    }

    var texto by remember {
        mutableStateOf(Color.Blue)
    }

    var textoBotao by remember {
        mutableStateOf(Color.Red)
    }


    Column(
        modifier = modifier
            .fillMaxSize()
            .background(corFundo),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "Tema Atual",
            color = texto
        )
        Button(onClick = {
            corFundo = if (corFundo == Color.Black) Color.Cyan else Color.Black
            texto = if (texto == Color.Blue) Color.Red else Color.Blue
            textoBotao = if (texto == Color.Red) Color.Cyan else Color.Red
        })
        {
            Text(
                text = "Alterar Tema",
                color = textoBotao
            )

        }

    }

}


/*
@Composable
fun login(modifier: Modifier = Modifier) {

    var user by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }

    var mensagem by remember {
        mutableStateOf("")
    }


    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(
            value = user,
            onValueChange = { user = it },
            label = { Text("User") },

            )

        OutlinedTextField(
            value = senha,
            onValueChange = { senha = it },
            label = { Text("Senha") },

            )

        Button(onClick = {
            if (user == "admin" && senha == "1234") {
                mensagem = "Login realizado com sucesso"
            } else {
                mensagem = "Usuário ou senha incorretos"
            }
        }
        ) {
            Text("Entrar")
        }
        Text(text = mensagem)
    }

}



@Composable
fun parImpar(modifier: Modifier = Modifier) {

    var numero by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(onClick = { numero = (0..100).random() }) {
            Text(text = "Gerar numero")
        }

        Text(text = "$numero")
        if (numero % 2 == 0 ){
            Text(text ="Par")
        }else{
            Text(text = "Impar")
        }
    }

}
*/

/*
@Composable
fun contador(modifier: Modifier = Modifier) {

    var numero by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Valor: $numero")

        Spacer(modifier = Modifier.height(20.dp))

        if (numero < 10) {
            Button(onClick = { numero++ }) {
                Text(text = "Acrescentar")
            }
        }else{
            Text(text = "Limite Atingido")
        }
    }

}*/


/*
@Composable
fun somarNumeros(modifier: Modifier = Modifier) {

    var primeiroNumeroT by remember {
        mutableStateOf("")
    }

    var segundoNumeroT by remember {
        mutableStateOf("")
    }

    var soma by remember {
        mutableStateOf(0)
    }


    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TextField(value = primeiroNumeroT, onValueChange = { novoNumero ->
            primeiroNumeroT = novoNumero
        }, label = { Text("Digite um numero: ") })

        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = segundoNumeroT, onValueChange = { novoNumero2 ->
            segundoNumeroT = novoNumero2
        }, label = { Text("Digite um numero: ") })


        Button(onClick = {
            val primeiroNumero = primeiroNumeroT.toIntOrNull()
            val segundoNumero = segundoNumeroT.toIntOrNull()
            if (primeiroNumero != null && segundoNumero != null) {
                soma = primeiroNumero + segundoNumero
            }
        }) {
            Text(text = "Somar")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text("Resultado: $soma")

    }

}*/


/*
@Composable
fun maiorIdade(modifier: Modifier = Modifier) {

    var idadeTexto by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        TextField(value = idadeTexto, onValueChange = { novaIdade ->
            idadeTexto = novaIdade
        }, label = { Text("Digite sua idade ") })

        val idade = idadeTexto.toIntOrNull()

        if(idade != null){
            if(idade >= 18){
                Text(text = "Maior de idade")
            }else{
                Text(text = "Menor de idade")
            }
        }

    }

}



@Composable
fun textFiel(modifier: Modifier = Modifier) {

    var texto by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Text(
            text = "Ola $texto",
        )
        TextField(value = texto, onValueChange = { novoTexto ->
            texto = novoTexto
        }, label = { Text("Digite seu nome") })


    }

}



@Composable
fun botaoCor(modifier: Modifier = Modifier) {

    var texto by remember {
        mutableStateOf("Andre")
    }
    var cor by remember {
        mutableStateOf(Color.Black)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Text(
            text = texto,
            color = cor
        )

        Button(onClick = { cor = if (cor == Color.Black) Color.Red else Color.Black }) {
            Text(text = "Trocar cor")
        }

    }

}



@Composable
fun textoDinamico(modifier: Modifier = Modifier) {

    var texto by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (texto) {
            Text("Andr_");
        }
        Button(onClick = { texto = !texto }) {
            Text(text = "MOSTRAR")
        }

    }

}


@Composable
fun textoDinamico(modifier: Modifier = Modifier) {

    var texto by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (texto) {
            Text("Andr_");
        }
        Button(onClick = { texto = !texto }) {
            Text(text = "MOSTRAR")
        }

    }

}



@Composable
fun incrementadorParte2(modifier: Modifier = Modifier) {

    var valor by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("$valor");

        Button(onClick = { valor++ }) {
            Text(text = "INCREMENTAR")
        }
        Button(onClick = {
            if (valor != 0) {
                valor--
            }
        }) {
            Text(text = "DECREMENTAR")

        }
        Button(onClick = { valor = 0 }) {
            Text(text = "RESETAR")

        }
    }

}



@Composable
fun incrementador(modifier: Modifier = Modifier) {

    var valor by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("$valor");
        
        Button(onClick = { valor++ }) {
            Text(text = "INCREMENTAR")
            
        }
    }

}*/

