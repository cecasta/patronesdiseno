package creacionales.factoryabstract;

import creacionales.factoryabstract.impl.ConexionMysql;
import creacionales.factoryabstract.impl.ConexionOracle;
import creacionales.factoryabstract.interfaces.ConexionBDInterface;
import creacionales.factoryabstract.interfaces.ConexionRESTInterface;
import creacionales.factoryabstract.interfaces.FactoryAbstract;

public class ConexionBDFactory implements FactoryAbstract {
	


	@Override
	public ConexionBDInterface getBD(String motor) {
		if(motor == null)
			return null;
		
		if(motor.equals("MYSQL"))
			return new ConexionMysql();
		
		if(motor.equals("ORACLE"))
			return new ConexionOracle();
		
		return null;
	}

	@Override
	public ConexionRESTInterface getREST(String area) {
		// TODO Auto-generated method stub
		return null;
	}

}
