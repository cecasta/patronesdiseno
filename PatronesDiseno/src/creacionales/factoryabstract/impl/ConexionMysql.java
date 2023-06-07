package creacionales.factoryabstract.impl;

import creacionales.factoryabstract.interfaces.ConexionBDInterface;

public class ConexionMysql implements ConexionBDInterface{
	
	private String host;
	private String port;
	private String dbName;

	@Override
	public void conectar() {
		System.out.println("Se conecto a Mysql");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		
	}

}
