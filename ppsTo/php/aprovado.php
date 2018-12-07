<html>
<head><title>Verificar de aprovação </title></head>
<body>
<?php
$nota1=7;
$nota2=5;
$medianota;
$aulasassistidas=29;
$aulasdadas=30;
$frequencia;

$frequencia=($aulasassistidas*100)/$aulasdadas;
$medianota=($nota1+$nota2)/2;

if($frequencia>=75 && $medianota>=6){
echo "O aluno esta aprovado";
}else{
echo "O aluno esta reprovado";
}
?>
</body>

</html>