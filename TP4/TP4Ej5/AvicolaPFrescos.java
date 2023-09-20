package TP4Ej5;

public class AvicolaPFrescos {
private String fechaV;
private int lote;
private String granja;
private String fechaE;
public AvicolaPFrescos(String fechaV, int lote, String granja, String fechaE) {

	this.fechaV = fechaV;
	this.lote = lote;
	this.granja = granja;
	this.fechaE = fechaE;
}
public String getFechaV() {
	return fechaV;
}
public void setFechaV(String fechaV) {
	this.fechaV = fechaV;
}
public int getLote() {
	return lote;
}
public void setLote(int lote) {
	this.lote = lote;
}
public String getGranja() {
	return granja;
}
public void setGranja(String granja) {
	this.granja = granja;
}
public String getFechaE() {
	return fechaE;
}
public void setFechaE(String fechaE) {
	this.fechaE = fechaE;
}

public String toString() {
	return "Etiquetas: " + " Fecha Venc: " + this.getFechaV() + " Lote: " + this.getLote() +
			" Granja: " + this.getGranja() + " Fecha Envasado: " + this.getFechaE();
}

public static void main(String [] args) {
	AvicolaPFrescos pf= new AvicolaPFrescos("7 de octubre del 2023", 658900, "Granjita", "6 de Enero 2023");
	AvicolaPFrescos pr=new ProductoRef("14 de diciembre del 2023", 765432, "La granja", "1 de enero de 2022", 5678896, 12);
	AvicolaPFrescos pca=new CongAire("24 de octubre del 2023", 5655632, "La granjas el sol", "7 de sept de 2023", 432236, 2, 8, 7, 6, 5);
	AvicolaPFrescos pcag=new CongAgua("11 de junio del 2023",455672, "La granjas el sol", "14 de feb de 2023", 12378, 1,7);
	AvicolaPFrescos pcn=new CongeladoNit("31 de marzo del 2023",24562, "La granjas el sol", "16 de feb de 2022", 362788, 0,"Congelamiento ext", 20);
System.out.println(pf);
System.out.println(pr);
System.out.println(pca);
System.out.println(pcag);
System.out.println(pcn);
}
}
