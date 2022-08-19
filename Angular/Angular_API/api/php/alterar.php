<?php

//Incluir a conexão com o banco de dados
include("conexao.php"); //arquivo criado previamente

//Obter os dados via JSON
$obterDados = file_get_contents ("php://input") //Vai obter os dados do JSON do input do php

//Extrair os dados do JSON
$extair = json_decode($obterDados); //Vai extrair os dados do JSON e transformar em um array

//Separar os dados do JSON
$idCurso = $extair->cursos->idCurso;// 
$nomeCurso = $extair->cursos->nomeCursos;// 
$valorCurso = $extair->cursos->valorCursos;

//SQL (cadastrar no banco de dados)
$sql = "UPDATE cursos SET nomeCurso = '$nomeCurso', valorCurso = $valorCurso WHERE idCurso = $idCurso";
mysqli_query($conexao, $sql);

//Exportar os dados cadastrados (retornar um json)
$curso = [
    'idCurso' => $idCurso,
    'nomeCurso' => $nomeCurso,
    'valorCurso' => $valorCurso
];
json_encode(['curso'] =>$curso)
?>