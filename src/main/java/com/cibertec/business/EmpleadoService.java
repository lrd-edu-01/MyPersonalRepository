package com.cibertec.business;

import java.util.List;

import com.cibertec.model.Empleado;

public interface EmpleadoService {
	
	public int InsertaEmpleado(Empleado empleado);
	
	public List<Empleado> ListarEmpleado();
}
