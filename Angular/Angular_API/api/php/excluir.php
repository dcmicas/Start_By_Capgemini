<?php

//Incluir a conexão com o banco de dados
include("conexao.php"); //arquivo criado previamente

//Obter os dados via JSON
$obterDados = file_get_contents ("php://input") //Vai obter os dados do JSON do input do php

//Extrair os dados do JSON
$extair = json_decode($obterDados); //Vai extrair os dados do JSON e transformar em um array

//Separar os dados do JSON
$idCurso = $extair->cursos->idCurso;// 

//SQL (cadastrar no banco de dados)
$sql = "DELETE FROM cursos WHERE idCurso = '$idCurso'"; //Vai deletar o curso com o idCurso
mysqli_query($conexao, $sql);

?>