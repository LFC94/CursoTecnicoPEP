<html><head></head>
<body><?php
function diasvida($ano,$mes,$dia){
$diasvividos=($ano*365)+($mes*30)+($dia);
return $diasvividos;
}
$diasvividos=diasvida(18,10,17);
echo $diasvividos;
?>
</body>
</html>