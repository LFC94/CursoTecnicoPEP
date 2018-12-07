<html>
<head>
<title>Imobiliaria</title>
</head>
<body>
<center>
<h1>IMOBILIARIA</h1>
<form action='area.php' method='POST'>
    Largura:<input type='text' name='largura'>m<br><br>
Comprimento:<input type='text' name='altura'>m<br><br>
<input type='submit' value='Calcular'>
</form>
RESULTADO<br>
<?php
function area($largura,$altura){
echo $largura*$altura.' m²';
}
area($_POST["largura"],$_POST["altura"]);
?>
</center>
</body>
</html>