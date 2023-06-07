package creacionales.factory;

import creacionales.factory.interfaces.ConexionInterface;

public class Main {
	public static void main(String[] args) {
		ConexionFactory factory = new ConexionFactory();
		
		ConexionInterface cx1 = factory.getConexion("MYSQL");
		cx1.conectar();
		cx1.desconectar();
		
		ConexionInterface cx2 = factory.getConexion("ORACLE");
		cx2.conectar();
		cx2.desconectar();
	}
}
