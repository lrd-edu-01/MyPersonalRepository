<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registro de empleados</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<h3>Registro de Empleados</h3>
		
	<form action="EmpleadoServlet" method="post">
	
	<table class="table"  border="1">	   
		<tr>
			<td>Apellidos: </td>
			<td><input name="txtApellidos" type="text" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required placeholder="Apellidos"  /></td>
		</tr> 
		<tr>
			<td>Nombres </td>
			<td><input name="txtNombre" type="text" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required placeholder="Nombres" /></td>
		</tr>
		<tr>
			<td>Edad </td>
			<td><input type="number" name="txtEdad" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required  placeholder="No menor de 18" /></td>
		</tr>
		<tr>
			<td>Sexo </td>
			<td><input  type="text" name="txtSexo"  class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required placeholder="F o M" /></td>
		</tr>
		<tr>
			<td>Salario </td>
			<td><input type="number" name="txtSalario" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required placeholder="Salario" /></td>
		</tr>
		
		<tr>
			<td colspan="2">
			<input type="hidden" value="registrar" name="action"/> 
			<input class="btn btn-primary" type="submit" value="Registrar Empleado"/>
			 <a class="btn btn-primary" aria-current="page" href="http://localhost:8080/Minimarket/ClienteServlet?action=listar">Regresar al Listado</a>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>