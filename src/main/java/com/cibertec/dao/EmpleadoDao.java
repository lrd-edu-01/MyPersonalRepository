package com.cibertec.dao;
import com.cibertec.model.Empleado;
import java.util.List;

public interface EmpleadoDao {

	public int InsertaEmpleado(Empleado empleado);
	
	public List<Empleado> ListarEmpleado();
}
