<html>
<head>
<title>DATA</title>
</head>
<body>
<center>
<h1>DIAS</h1>
<form action='dia.php' method='POST'>
DIA:<input type='text' name='dia'><br><br>
MES:<input type='text' name='mes'><br><br>
<input type='submit' value='Calcular'>
</form>
DIAS 
<?php
function dias($dias,$mes){
echo $dias+($mes*30);
}
dias($_POST["dia"],$_POST["mes"]);
?>
</center>
</body>
</html>