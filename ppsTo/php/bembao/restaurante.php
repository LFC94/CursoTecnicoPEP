<html>
<head>
<title>Bem-Bão</title>
</head>
<body>
<center>
<h1>Restaurante Bem-Bão</h1>
<form action='restaurante.php' method='POST'>
PESO DO PRATO:<input type='text' name='peso'><br><br>
<input type='submit' value='Calcular'>
</form>
VALOR A PAGAR
<?php

function bem($peso){
echo 'R$'.($peso*12);
}
bem($_POST["peso"]);

?>
</center>
</body>
</html>