<?php

//Incluir a conexão com o banco de dados
include("conexao.php"); //arquivo criado previamente

//Obter os dados via JSON
$obterDados = file_get_contents ("php://input") //Vai obter os dados do JSON do input do php

//Extrair os dados do JSON
$extair = json_decode($obterDados); //Vai extrair os dados do JSON e transformar em um array

//Separar os dados do JSON
$nomeCurso = $extair->cursos->nomeCursos;// 
//Extrair vai abrir o JSON
//O 'cursos" foi criado no encode do arquivo "listar.php"
//'nomeCurso' é uma característica do JSON (banco de dados)

$valorCurso = $extair->cursos->valorCursos;

//SQL (cadastrar no banco de dados)
$sql = "INSERT INTO cursos (nomeCurso, valorCurso) VALUES ('$nomeCurso', $valorCurso)";
mysqli_query($conexao, $sql);

//Exportar os dados cadastrados (retornar um json)
$curso = [
    'nomeCurso' => $nomeCurso,
    'valorCurso' => $valorCurso
];
json_encode(['curso'] =>$curso)
?>