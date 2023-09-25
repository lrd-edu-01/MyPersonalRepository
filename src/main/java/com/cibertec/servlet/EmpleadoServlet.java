package com.cibertec.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cibertec.business.EmpleadoService;
import com.cibertec.business.impl.EmpleadoServiceImpl;
import com.cibertec.constant.Constant;
import com.cibertec.model.Empleado;

/**
 * Servlet implementation class EmpleadoServlet
 */
public class EmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmpleadoService service = new EmpleadoServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		switch (action) {
		case Constant.REGISTRAR:
			
			String nombre = request.getParameter("txtNombre");
			String apellidos = request.getParameter("txtApellidos");
			String direccion = request.getParameter("txtDireccion");
			String telefono = request.getParameter("txtTelefono");
			String email = request.getParameter("txtEmail");
			
			Cliente cliente = new Cliente();
			
			cliente.setNomCliente(nombre);
			cliente.setApCliente(apellidos);		
			cliente.setDireccion(direccion);
			cliente.setTelefono(telefono);
			cliente.setEmail(email);
			
			int valor = service.guardaCliente(cliente);
			if(valor == 1) {
				ListadoEmpleados(request, response);
				request.setAttribute("Mensaje de confirmacion", "Empleado registrado correctamente");
			} else {
				request.setAttribute("mensajeError", "Ocurrió un problema al registrar");
				request.getRequestDispatcher("ListadoEmpleado.jsp").forward(request, response);
			}
			break;
					
		case Constant.LISTAR: ListadoEmpleados(request, response);
		break;		
		}
	}
	
	private void ListadoEmpleados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Empleado>  lista = service.ListarEmpleado();
		request.setAttribute("data", lista);
		request.getRequestDispatcher("ListadoEmpleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
