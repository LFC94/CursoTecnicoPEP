<html>
<head><title>Verificação de orden crecente</title></head>
<body> 
<?php
$num1=6;
$num2=3;
$num3=4;
if($num1<$num2&&$num1<$num3&&$num2<$num3){
echo "$num1<br>$num2<br>$num3";
}
if($num1<$num2&&$num1<$num3&&$num3<$num2){
echo "$num1<br>$num3<br>$num2";
}
if($num2<$num1&&$num2<$num3&&$num1<$num3){
echo "$num2<br>$num1<br>$num3";
}
if($num2<$num1&&$num2<$num3&&$num3<$num1){
echo "$num2<br>$num3<br>$num1";
}
if($num3<$num1&&$num3<$num2&&$num2<$num1){
echo "$num3<br>$num2<br>$num1";
}
if($num3<$num1&&$num3<$num1&&$num1<$num2){
echo "$num3<br>$num1<br>$num2";
}
?>
</body>
</html>