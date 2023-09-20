package Tp6Ej2;

public abstract class colaDeEspera {
	String nombre;
	
	public colaDeEspera(String nombre) {
	this.nombre=nombre;	
	}
    
    public abstract void agregar(Object o); 
    //lo hice con cola de espera tambien pero hay algo rari,
    //en algo le erro casi seguro :'b

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    

}