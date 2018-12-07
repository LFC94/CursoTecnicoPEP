<html><head></head>
<body><?php
function nota($nota){
if($nota>=0&& $nota<5){
return "d";
}
if($nota>=5&& $nota<7){
return"c";
}
if($nota>=7&& $nota<9){
return"b";
}
if($nota>=9&& $nota<=10){
return"a";
}
}
$nota=nota(4.95);
echo $nota;
?>
</body>
</html>