<html>
<head><title>Verificar se o numero e par ou impar e negativo ou positivo </title></head>
<body>
<?php
$numero=1-5;
if($numero%2==0&&$numero<0){
echo "o numero $numero � par e negativo";
}
if($numero%2==0&&$numero>0){
echo "o numero $numero � par e positivo";
}
if($numero%2!=0&&$numero<0){
echo "o numero $numero � impar e negativo";
}
if($numero%2!=0&&$numero>0){
echo "o numero $numero � impar e positivo";
}
?>
</body>
</html>