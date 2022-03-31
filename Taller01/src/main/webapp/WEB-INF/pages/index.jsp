<!DOCTYPE html>
<html lang ="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <!-- Google Fonts Muli -->
    <link href="https://fonts.googleapis.com/css2?family=Muli:wght@300;400;700&display=swap" rel="stylesheet"> 
    <link rel="stylesheet" type "text/css" href="CSS/style.css"/>
</head>
<body>
    <section class="wrapper">
        <div class="container">
            <div class="img__container">
            <img src="https://dei.uca.edu.sv/wp-content/uploads/bfi_thumb/logo-39ah6opyldetr0nr6t1jwg.jpg" alt="salad" class="img"> 
        	</div>
	        <form action="save-data" method="post">   
	            <div class="content">
	            
	                <h1 class="subtitle"> Ingresa tus datos</h1>
	                <h2 class="title">Departamento</h2>
	                <select name="Departaments" id="dep">
	                    <option>La Libertad</option>
	                    <option>San Salvador</option>
	                    <option>Santa Ana</option>
	                    <option>Sonsonate</option>
	                	<option>Ahuachapan</option>
	                    <option>San Miguel</option>
	                    <option>La Union</option>
	                    <option>Caba&ntildeas</option>
	                	<option>San Vicente</option>
	                    <option>Cuscatl&aacuten</option>
	                    <option>Morazan</option>
	                    <option>Chalatenango</option>
	                  </select>
	                  <h2 class="title">Nombre:</h2>
	                <input type="text" class="name"  name="firstName" required>
	                <h2 class="title">Apellido:</h2>
	                <input type="text" class="lastname"  name="lastName" required>
	                <h2 class="title">Carnet:</h2>
	                <input type="text" class="idNumber" name="idNumber" required>
	                <h2 class="title">Fecha de nacimiento:</h2>
	                <input type="text" class="birthdate" name="birthdate" required>
	                <input type="submit" value="Guardar" class="subscribe">
	                
	            </div>
	        </form>
        </div>
    </section>
</body>
</html>