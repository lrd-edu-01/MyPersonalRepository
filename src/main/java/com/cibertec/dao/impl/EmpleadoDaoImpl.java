package com.cibertec.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cibertec.config.Conectar;
import com.cibertec.dao.EmpleadoDao;
import com.cibertec.model.Empleado;

public class EmpleadoDaoImpl  implements EmpleadoDao{

    private Conectar conectar;
	
	public EmpleadoDaoImpl() {
		conectar = new Conectar();
	}

	@Override
	public int InsertaEmpleado(Empleado empleado) {
    int valor = 0;
		
		Connection cn = null; 
		PreparedStatement ps = null; 	
		
		try {
			cn = conectar.ConectarMYQL();
			String sql = "INSERT INTO empleado VALUES (null,?,?,?,?,?)";
			ps = cn.prepareStatement(sql);			
			ps.setString(1, empleado.getApellido());
			ps.setString(2, empleado.getNombre());
			ps.setInt(3, empleado.getEdad());
			ps.setString(4, empleado.getSexo());
			ps.setDouble(5, empleado.getSalario());
			valor = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) ps.close();
				if (cn != null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		return valor;
	}

	@Override
	public List<Empleado> ListarEmpleado() {
		List<Empleado> lista = new ArrayList<Empleado>();
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			cn = conectar.ConectarMYQL();
			String sql = "SELECT * from empleado";
			ps = cn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Empleado empleado = new Empleado();
				empleado.setId(rs.getInt("idempleado"));
				empleado.setApellido(rs.getString("apellidos"));
				empleado.setNombre(rs.getString("nombres"));
				empleado.setEdad(rs.getInt("edad"));
				empleado.setSexo(rs.getString("sexo"));
				empleado.setSalario(rs.getDouble("salario"));			
				lista.add(empleado);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (cn != null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}

}
