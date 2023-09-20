package Tp7Ej1;

import java.util.ArrayList;

public class EmpresaA {
	private String nombre;
	ArrayList<Producto> agroquimicos;
	//ArrayList<Cultivo>cultivos;
	ArrayList<Enfermedad> enfermedades;
	
	public EmpresaA (String nombre){
		this.nombre = nombre;
		this.agroquimicos = new ArrayList<>();
		//this.cultivos = new ArrayList<>();
		this.enfermedades = new ArrayList<>();
	}
	
	public ArrayList<Producto> buscarAgroquímicos(Filtro f){
		ArrayList <Producto> resultado = new ArrayList<>();
		for(Producto p: agroquimicos)
				if (f.cumple(p)){
				resultado.add(p);
				}
		return resultado;
	}

	
	
public static void main(String[] args) {
    // Crear cultivos
    Cultivo c1 = new Cultivo("Maiz");
    Cultivo c2=new Cultivo("girasol");
    
    Enfermedad enf1 = new Enfermedad("enf1");
    Enfermedad enf2=new Enfermedad("enf2");
    
    //añadir enfermedades
    enf1.addEstados("estado1");
    enf1.addEstados("estado2");
    c1.addEnfermedad(enf1);;
    enf2.addEstados("estado3");
    enf2.addEstados("estado4");
    c2.addEnfermedad(enf2);
    
    Producto pp=new Producto("El producto1");
    pp.addEstadoPat("estado1");
    enf1.addEstados("estado2");
    pp.addCultivoDes(c2);
    System.out.println(enf1.trataEnfermedad(pp));
    System.out.println(enf2.trataEnfermedad(pp));
    System.out.println(pp.contieneCultivoDesaconsejado(c1));
    System.out.println(pp.contieneCultivoDesaconsejado(c2));
    System.out.println(c1.productoQuimicoEsUtil(pp));
    System.out.println(c2.productoQuimicoEsUtil(pp));
    



}
}
