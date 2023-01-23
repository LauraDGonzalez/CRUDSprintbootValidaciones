# CRUD Basico con spring Boot

Ejercicio día tres
Poniendo en práctica los principios vistos el día de hoy, se le solicita construir una aplicación web la
cual debe tener la siguiente configuración:
1. Se debe de correr en el puerto 8087
2. La db de estar configura con el nombre de cada persona
3. La db de tener una clase asociada y un usuario diferente al de por defecto
Se requiere que se tengan tres clases, una clase Estudiante, una clase Profesor, una clase materia.
La clase de profesor debe estar compuesta por:
● Nombres
● Apellidos
● Cedula
● Edad
Cada profesor se identifica por la cédula, el nombre y apellido son campos requeridos, un profesor
puede dictar una o muchas materias, pero una materia solo puede tener un profesor.
Se debe generar un CRUD para esta entidad, y el path será /teacher
La clase de Alumno debe de tener:
● Nombres
● Apellidos
● Fecha de nacimiento
● Cedula
● Edad
● Materias
Un alumno solo puede tener una materia, la edad se debe calcular de acuerdo con la fecha de
nacimiento. Todos los campos del alumno son obligatorios.
generar un CRUD, aparte se debe de tener un servicio que enviándole el id me retorne el alumno.
La clase Materia debe tener:
● Alumnos
● Maestro
● Horario
● Tema
Una materia tiene uno o muchos alumnos, y un solo maestro. Una materia puede tener 0
estudiantes, pero siempre debe tener un maestro, los campos horario y tema son requeridos.
Generar un CRUD básico.
VALIDACIONES
1. Los campos nombre y apellido de alumno y profesor no pueden tener números ni
caracteres especionaes(@,#;$%, etc).
2. El campo tema de materia puede tener números pero no caracteres especiales (@,#;$%,
etc) y el campo tema no puede superar más de 200 caracteres, y no debe de permitir
inyectar código SQL como 1=1 #, or true ,o <script>.
3. El formato del campo fecha de nacimiento debe de ser YYYY-MM-DD, si no cumple este
formado debe responder con un error que indique el formato válido de fecha.
4. El formato válido de horario debe de ser HH:MM-HH:MM no puede ser menor a 11 ni
mayor a 14 caracteres, además, el valor de la hora de la clase no puede superar los 60
minutos.
Funciones de negocio
1. Se debe crear una función en con el path /listStudents en materia para listar todos los
alumnos inscritos en la materia, en el listado se debe mostrar la cédula, el nombre, el
apellido y la fecha de nacimiento en formato DD/MM/YYYY
2. Se debe de crear módulo de calificaciones, donde se le indique el estudiante, la materia y
la calificación que puede ser de 0 a 5 no debe permitir decimales, debe ser solo número.
3. se debe de crear una función en alumno donde se liste la materia, el profesor y la
calificación.
![image](https://user-images.githubusercontent.com/122939578/214135978-58afd6c0-4cdb-4c11-9aa4-b6b5311a66ce.png)
![image](https://user-images.githubusercontent.com/122939578/214136036-231a61eb-54c2-42d4-82a1-2c16a267bb16.png)
![image](https://user-images.githubusercontent.com/122939578/214136103-01ff642a-52ab-47b2-ae89-08b55d6528d5.png)
![image](https://user-images.githubusercontent.com/122939578/214136239-147c1279-6a68-4fc9-b9fc-8c930f5549ba.png)

