<html>
<head>
</head>
<body>
<center>
	<h1>Transformar segundos em (hh:mm:ss)</h1>
	<?php
function tempo($segundos){
$seg=$segundos%60;
$minutos=0;
$horas=0;
if($segundos>=3600){
while($segundos>=3600){
$horas++;
$segundos-=3600;}
}
if($segundos<3600&&$segundos>=60){
while($segundos>=60){
$minutos++;
$segundos-=60;}
}

return $horas.":".$minutos.":".$seg;
}
$resultado=tempo($_POST["segundos"]);
echo $resultado;
?>
</center>
</body>
</html>