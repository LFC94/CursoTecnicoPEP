<html>
<head>
<title></title>
</head>
<body>
<center>
	<h1>Indice de Massa Corporal (IMC)</h1>
	<?php
function imc($peso,$altura){
$r=$peso/($altura*$altura);
return $r;
}
$r=imc($_POST["peso"],$_POST["altura"]);
echo $r;
?>
</center>
</body>
</html>