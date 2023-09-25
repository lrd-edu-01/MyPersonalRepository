package com.cibertec.business.impl;

import java.util.List;

import com.cibertec.business.EmpleadoService;
import com.cibertec.dao.EmpleadoDao;
import com.cibertec.dao.impl.EmpleadoDaoImpl;
import com.cibertec.model.Empleado;

public class EmpleadoServiceImpl implements EmpleadoService {

	private EmpleadoDao dao = new EmpleadoDaoImpl();
	
	@Override
	public int InsertaEmpleado(Empleado empleado) {
		return dao.InsertaEmpleado(empleado);
	}

	@Override
	public List<Empleado> ListarEmpleado() {
		return dao.ListarEmpleado();
	}
	
}
