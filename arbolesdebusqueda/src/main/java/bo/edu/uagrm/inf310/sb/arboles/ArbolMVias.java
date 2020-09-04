package bo.edu.uagrm.inf310.sb.arboles;

import java.util.List;

public class ArbolMVias  <K extends Comparable<K>,V > implements IArbolBusqueda<K,V>{
	protected NodoMVias<K,V> raiz;
	protected int orden;

	public ArbolMVias(int orden) {
	
	}
	
	public ArbolMVias (int orden, K clave, V valor) {
	
	}
	@Override

	public void insertar(K clave, V valor) throws ExcepcionClaveYaExiste {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V eliminar(K clave) throws ExcepcionClaveNoExiste {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V buscar(K clave) {
	//	NodoMVias<K,V> nodoActual clave;
		return null;
	}

	@Override
	public boolean contiene(K clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<K> recorridoEnInOrden() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<K> recorridoEnPreOrden() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<K> recorridoEnPostOrden() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<K> recorridoPorNiveles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int altura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void vaciar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean esArbolVacio() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int nivel() {
		// TODO Auto-generated method stub
		return 0;
	}

}
