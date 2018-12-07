<html>
<head>
<title>POSTO</title>
</head>
<body>
<center>
<h1>POSTO de GASOLINA</h1>
<form action='posto.php' method='POST'>
PREÇO Gasolina:<input type='text' name='preco'><br><br>
Quantidade em dinheiro:<input type='text' name='quat'><br><br>
<input type='submit' value='Calcular'>
</form>
QUANTIDADE EM LITROS
<?php
function posto($preco,$quat){
echo $quat/$preco.' litro';
}
posto($_POST["preco"],$_POST["quat"]);
?>
</center>
</body>
</html>