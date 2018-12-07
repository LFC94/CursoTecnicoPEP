<html>
<head><title></title>
</head>
<body><?php
function confirm($login,$senha){
 if($login == "admin" && $senha =="admin"){
 echo "Acesso Permitido";
} else{
 echo"Acesso Negado";}
} 

confirm($_POST ["user"],$_POST ["password"])
?>
</body>
</html>