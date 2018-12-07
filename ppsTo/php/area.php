<html>
<head><title>Calculo das Area</title></head>
<body>
<?php
$base=10;
$altura=5;
$baseMaior=15;
echo('Area do Retangulo, Quadrado e Paralelograma<br>base=10<br>altura=5<br>area do retangulo='.$base*$altura);
echo('<br><br>Area do Trapézio<br>Base Menor=10<br>Altura=5<br>Base Maior=15<br>Area do Trapézio='.($base+$baseMaior)*$altura/2);
$diagonalMaior=20;
$diagonalMenor=10;
echo('<br><br>Area do Losango<br>diagonal Maior=20<br>diagonal Menor=10<br>Area do Losango='.($diagonalMaior*$diagonalMenor)/2)
?>
</body>
</html>