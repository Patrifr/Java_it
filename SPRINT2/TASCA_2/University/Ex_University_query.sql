SELECT apellido1, apellido2, nombre FROM persona  WHERE tipo = "alumno" ORDER BY apellido1, apellido2, nombre;
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo = "alumno" AND telefono IS NULL ORDER BY nombre;
SELECT * FROM persona WHERE tipo = "alumno" AND YEAR(fecha_nacimiento) = "1999";
SELECT * FROM persona WHERE tipo = "profesor" AND telefono IS NULL AND nif LIKE '%K';
SELECT * FROM asignatura WHERE cuatrimestre = 1 AND curso = 3 AND id_grado = 7;
SELECT apellido1, apellido2, persona.nombre AS "Professor name", departamento.nombre AS "Departments" FROM persona INNER JOIN profesor ON persona.id = profesor.id_profesor INNER JOIN departamento ON profesor.id_departamento = departamento.id ORDER BY apellido1, apellido2, persona.nombre;
SELECT asignatura.nombre AS "Subject's name", curso_escolar.anyo_inicio AS "First year", curso_escolar.anyo_fin AS "Final year" FROM persona INNER JOIN alumno_se_matricula_asignatura ON persona.id = alumno_se_matricula_asignatura.id_alumno INNER JOIN asignatura ON asignatura.id = alumno_se_matricula_asignatura.id_asignatura INNER JOIN curso_escolar ON curso_escolar.id = alumno_se_matricula_asignatura.id_curso_escolar WHERE persona.nif = "26902806M";
SELECT departamento.nombre AS "Departments" FROM departamento INNER JOIN profesor ON profesor.id_departamento = departamento.id INNER JOIN asignatura ON profesor.id_profesor = asignatura.id_profesor INNER JOIN grado ON asignatura.id_grado = grado.id WHERE grado.nombre = "Grado en Ingeniería Informática (Plan 2015)";
SELECT DISTINCT apellido1, apellido2, nombre FROM persona INNER JOIN alumno_se_matricula_asignatura ON persona.id = alumno_se_matricula_asignatura.id_alumno INNER JOIN curso_escolar ON alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id WHERE curso_escolar.anyo_inicio = "2018" AND curso_escolar.anyo_fin = "2019";
SELECT departamento.nombre AS "Departments", apellido1, apellido2, persona.nombre AS "Professor name" FROM persona LEFT JOIN profesor ON profesor.id_profesor = persona.id LEFT JOIN departamento ON profesor.id_departamento = departamento.id ORDER BY departamento.nombre, persona.apellido1, persona.apellido2, persona.nombre;
SELECT persona.apellido1, persona.apellido2, persona.nombre FROM persona LEFT JOIN profesor ON persona.id = profesor.id_profesor WHERE profesor.id_departamento IS NULL ORDER BY nombre;
SELECT departamento.nombre FROM departamento LEFT JOIN profesor ON profesor.id_departamento = departamento.id WHERE profesor.id_departamento IS NULL ORDER BY nombre;
SELECT persona.apellido1, persona.apellido2, persona.nombre, asignatura.nombre FROM persona LEFT JOIN profesor ON persona.id = profesor.id_profesor LEFT JOIN asignatura ON profesor.id_profesor = asignatura.id_profesor WHERE asignatura.id_profesor IS NULL AND persona.tipo = "profesor" ORDER BY persona.apellido1;
SELECT asignatura.nombre FROM asignatura LEFT JOIN profesor ON asignatura.id_profesor = profesor.id_profesor WHERE asignatura.id_profesor IS NULL ORDER BY asignatura.nombre;
SELECT DISTINCT departamento.nombre FROM departamento LEFT JOIN profesor ON profesor.id_departamento = departamento.id LEFT JOIN asignatura ON asignatura.id_profesor = profesor.id_profesor LEFT JOIN alumno_se_matricula_asignatura ON asignatura.id = alumno_se_matricula_asignatura.id_curso_escolar WHERE alumno_se_matricula_asignatura.id_curso_escolar IS NULL;
SELECT COUNT(id) AS "Total students" FROM persona WHERE tipo = "alumno";
SELECT COUNT(id) AS "Total students born in 1999" FROM persona WHERE tipo = "alumno" AND YEAR(fecha_nacimiento) = "1999";
SELECT COUNT(profesor.id_profesor) AS "Number of Teachers", departamento.nombre AS "Departments" FROM departamento JOIN profesor ON profesor.id_departamento = departamento.id GROUP BY departamento.id ORDER BY COUNT(profesor.id_profesor) DESC;
SELECT departamento.nombre AS "Departments", COUNT(profesor.id_profesor) AS "Number of Teachers" FROM departamento LEFT JOIN profesor ON profesor.id_departamento = departamento.id GROUP BY departamento.id ORDER BY COUNT(profesor.id_profesor) DESC;
SELECT grado.nombre AS "Grade name", COUNT(asignatura.id) AS "Number of subjects" FROM grado LEFT JOIN asignatura ON asignatura.id_grado = grado.id GROUP BY grado.id ORDER BY COUNT(asignatura.id) DESC;
SELECT grado.nombre AS "Grade name", COUNT(asignatura.id) AS "Number of subjects" FROM grado LEFT JOIN asignatura ON asignatura.id_grado = grado.id GROUP BY grado.id HAVING COUNT(asignatura.id) > 40 ORDER BY COUNT(asignatura.id) DESC;
SELECT grado.nombre AS "Grade name", asignatura.tipo AS "Subject type", SUM(asignatura.creditos) AS "Total credits" FROM grado JOIN asignatura ON asignatura.id_grado = grado.id GROUP BY grado.nombre, asignatura.tipo;
SELECT curso_escolar.anyo_inicio AS "Start Year", COUNT(alumno_se_matricula_asignatura.id_alumno) AS "Total Students" FROM curso_escolar LEFT JOIN alumno_se_matricula_asignatura ON curso_escolar.id = alumno_se_matricula_asignatura.id_curso_escolar GROUP BY curso_escolar.anyo_inicio;
SELECT persona.id, persona.nombre, persona.apellido1, persona.apellido2, COUNT(asignatura.id_profesor) AS "Total Subjects by teacher" FROM persona LEFT JOIN profesor ON persona.id = profesor.id_profesor LEFT JOIN asignatura ON asignatura.id_profesor = profesor.id_profesor WHERE persona.tipo = "profesor" GROUP BY persona.id ORDER BY COUNT(asignatura.id_profesor) DESC;
SELECT * FROM persona WHERE tipo = "alumno" ORDER BY fecha_nacimiento DESC LIMIT 1;
SELECT persona.nombre, persona.apellido1, persona.apellido2, departamento.id AS "Department_id", asignatura.id AS "Subject_id" FROM persona INNER JOIN profesor ON persona.id = profesor.id_profesor INNER JOIN departamento ON departamento.id = profesor.id_departamento LEFT JOIN asignatura ON asignatura.id_profesor = profesor.id_profesor WHERE profesor.id_departamento IS NOT NULL AND asignatura.id_profesor IS NULL ORDER BY persona.nombre;