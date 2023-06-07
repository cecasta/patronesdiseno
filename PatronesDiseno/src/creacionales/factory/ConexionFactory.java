package creacionales.factory;

import creacionales.factory.impl.ConexionMysql;
import creacionales.factory.impl.ConexionOracle;
import creacionales.factory.interfaces.ConexionInterface;

public class ConexionFactory {
	
	public ConexionInterface getConexion(String motor) {
		if(motor == null)
			return null;
		
		if(motor.equals("MYSQL"))
			return new ConexionMysql();
		
		if(motor.equals("ORACLE"))
			return new ConexionOracle();
		
		return null;
	}

}
