<html>
<head>
<title>HOTP�O</title>
</head>
<body>
<center>
<h1>HOTP�O</h1>
<form action='pao.php' method='POST'>
P�O:<input type='text' name='pao'><br><br>
BROA:<input type='text' name='broa'><br><br>
<input type='submit' value='Calcular'>
</form>
<?php
function padaria($pao,$broa){

$resultado=($pao*0.12)+($broa*1.50);
$poupanca=$resultado*0.10;
echo '<h3>FATURAMENTO TOTAL</h3> <br>R$'.$resultado.'<br><h3>POUPAN�A</h3><br>R$'.$poupanca;
}
padaria($_POST["pao"],$_POST["broa"])
?>
</center>
</body>
</html>