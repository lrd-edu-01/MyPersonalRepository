<%@page import="com.cibertec.model.Empleado"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crud Empleados</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<h3>Listado de Empleados </h3>
	<p>
		<a class="btn btn-primary" href="RegistrarEmpleado.jsp">Nuevo Empleado</a>
	</p>
	<table class="table table-sm" >
		<thead >
			<tr>
				<th>idEmpleado</th>
				<th>Apellidos</th>
				<th>Nombre</th>
				<th>Edad</th>
				<th>Sexo</th>
				<th>Salario</th>
			</tr>
		</thead>
		<tbody>
			<% 
			List<Empleado> lista = (List<Empleado>)request.getAttribute("data");
			if (!lista.isEmpty()){
				for(Empleado item:lista){			
			%>
			<tr>
			    <td><%= item.getId()%></td>
			    <td><%= item.getApellido()%></td>
			    <td><%= item.getNombre()%></td>
			    <td><%= item.getEdad()%></td>	
			    <td><%= item.getSexo()%></td>	
			    <td><%= item.getSalario() %></td>	
				<td colspan="2">						
					<a class="btn btn-secondary btn-sm" title="Actualizar" href="#">Actualizar</a>
		            <a class="btn btn-secondary btn-sm" title="Eliminar" href="#">Eliminar</a>		            
			   </td>
			</tr>
				<% 
			   }
			}
			%>
		</tbody>
	</table>
</body>
</html>