package creacionales.factoryabstract.interfaces;

public interface FactoryAbstract {
	ConexionBDInterface getBD(String motor);
	ConexionRESTInterface getREST(String area);

}
