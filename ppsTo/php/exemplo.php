<html>
<head></head>
<body>
<?php
$funcionarios=array(1=>"Jos�",2=>"Jo�o",3=>"Pedro");
$funcionarias=array(1=>"Maria",2=>"Carla");
echo "<h5>FUNCION�RIOS</h5>";
echo"<br><li>".$funcionarios[1]."</li><br><li>".$funcionarios[2]."</li><br><li>".$funcionarios[3]."</li>";
echo "<h5>FUNCION�RIAS</h5>";
echo"<br><li>".$funcionarias[1]."</li><br><li>".$funcionarias[2]."</li><br>";
echo "<h1><center>Todos os Funcionarios</h1></center>";
echo"<br><li>".$funcionarias[1]."</li><br><li>".$funcionarias[2]."</li><br><li>".$funcionarios[1]."</li><br><li>"
.$funcionarios[2]."</li><br><li>".$funcionarios[3]."</li>";
?>
</body>
</html>