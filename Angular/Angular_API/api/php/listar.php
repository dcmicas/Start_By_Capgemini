<?php

//Incluir a conexão com o banco de dados
include("conexao.php"); //arquivo criado previamente

//SQL
$sql = "SELECT * FROM cursos";

//Executar a query (o select no banco de dados e joga na variavel executar)
$executar = mysqli_query($conexao, $sql);

//Vetor (ID, curso e valor do curso que vai ser lido no JSON)
$cursos = [];

//Indice (posição do Json que vai adicionar o conteudo)
$indice = 0;

//Laço de repetição para ler os dados do banco de dados
while($linha = mysqli_fetch_assoc($executar)){ //executar linha a linha a seleção
    $cursos[$indice]['idCurso'] = $linha['idCurso'];
    $cursos[$indice]['nomeCurso'] = $linha['nomeCurso'];  
    $cursos[$indice]['valorCurso'] = $linha['valorCurso'];
    $indice++;
}

//Encapsular o vetor em um JSON
json_encode(['cursos'=>$cursos]);
?>