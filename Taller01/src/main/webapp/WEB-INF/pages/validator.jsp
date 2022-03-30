<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <!-- Google Fonts Muli -->
    <link href="https://fonts.googleapis.com/css2?family=Muli:wght@300;400;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="CSS/style.css" />
</head>

<body>
    <h1 class="title">Devolviendo información</h1>
    <p>
        Departamento:
        <span>
            ${dep}
        </span>
    </p>
    <p>
        Nombre:
        <span>
            ${name}
        </span>
    </p>
    <p>
        Apellido:
        <span>
            ${lastname}
        </span>
    </p>
    <p>
        Carnet:
        <span>
            ${idNumber}
        </span>
    </p>
    <p>
        Cumpleaños:
        <span>
            calculateAge(${age})
        </span>
    </p>
</body>

</html>