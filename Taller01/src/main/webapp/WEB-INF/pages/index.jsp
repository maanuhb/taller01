<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <!-- Google Fonts Muli -->
    <link href="https://fonts.googleapis.com/css2?family=Muli:wght@300;400;700&display=swap" rel="stylesheet"> 
    <link rel="stylesheet" href="src/main/styles.css">
</head>
<body>
    <section class="wrapper">
        <div class="container">
            <div class="img__container">
            <img src="https://images.unsplash.com/photo-1546793665-c74683f339c1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80" alt="salad" class="img"> 
        </div>   
            <div class="content">
                <h1 class="subtitle"> Ingresa tus datos</h1>
                <h2 class="title">Departamento</h2>
                <select name="Departaments" id="dep">
                    <option value="La Libertad">Lib</option>
                    <option value="San Salvador">Sslv</option>
                    <option value="Santa Ana">Sta</option>
                    <option value="Sonsonate">Son</option>
                <option value="Ahuachapan">Ahc</option>
                    <option value="San Miguel">Snm</option>
                    <option value="La Union">Lun</option>
                    <option value="Cabañas">Cbñ</option>
                <option value="San Vicente">Savt</option>
                    <option value="Cuscatlán">Csct</option>
                    <option value="Morazan">Mrz</option>
                    <option value="Chalatenango">Cltn</option>
                  </select>
                  <h2 class="title">Nombre:</h2>
                <input type="text" class="name"  name="name" required>
                <h2 class="title">Apellido:</h2>
                <input type="text" class="lastname"  name="lastname" required>
                <h2 class="title">Carnet:</h2>
                <input type="text" class="idNumber" name="idNumber" required>
                <h2 class="title">Fecha de nacimiento:</h2>
                <input type="date" class="birthdate" name="birthdate" required>
                <input type="submit" value="Guardar" class="subscribe">
                
            </div>
        </div>
    </section>
</body>