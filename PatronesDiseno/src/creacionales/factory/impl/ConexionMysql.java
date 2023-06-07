package creacionales.factory.impl;

import creacionales.factory.interfaces.ConexionInterface;

public class ConexionMysql implements ConexionInterface{
	
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
