<?php

//Váriaveis de acesso

$url = "localhost"; //Onde está o banco de dados
$usuario = "root"; //Usuário padrão do banco de dados
$senha = ""; //Senha padrão do banco de dados
$base = "api"; //Nome do banco de dados criado

//Conexão com o banco de dados + parametros
$conexao = mysqli_connect($url, $usuario, $senha, $base);

//Arrumar caracteres especiais
mysqli_set_charset($conexao, "utf8");

?>