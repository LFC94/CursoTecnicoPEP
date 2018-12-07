<html><head></head>
<body><?php
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
$resultado=tempo(1000);
echo $resultado;
?>
</body>
</html>