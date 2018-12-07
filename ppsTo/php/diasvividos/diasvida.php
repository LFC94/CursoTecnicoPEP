<html>
	<head>
	</head>
	<body>
		<center>
			<h1>Anos Vivdos</h1>
			<?php
				function diasvida($ano,$mes,$dia){
					$diasvividos=($ano*365)+($mes*30)+($dia);
					return $diasvividos;
				}
				$diasvividos=diasvida($_POST["anos"],$_POST["meses"],$_POST["dias"]);
				echo $diasvividos;
			?>
		</center>
	</body>
</html>