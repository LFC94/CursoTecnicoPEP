<html><head></head>
<body><?php
function imc($peso,$altura){
$r=$peso/($altura*$altura);
return $r;
}
$r=imc(60,1.50);
echo $r;
?>
</body>
</html>