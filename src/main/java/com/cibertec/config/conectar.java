package com.cibertec.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
	private static  String driver  = "com.mysql.jdbc.Driver";
	private static String database  = "minimarket";
	private static String host = "localhost";
	private static String  port = "3306";
	private static String url = "jdbc:mysql://"+host+":"+port+"/" +database +"?characterEncoding=latin1";
	private static String username="cibertec";
	private static String password = "70371569_Edu";
	//url = jdbc:mysql://localhost:3306/bd_4ciclo?characterEncoding=latin1";
	public Connection ConectarMYQL() {
		Connection conn = null; 
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			if (conn!=null) {
				System.out.println("COnexion Satisfactoria");
			}else {
				System.out.println("Conexion no Satisfactoria");
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return conn;
	}
}
