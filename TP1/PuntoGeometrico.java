package Prog2;

public class PuntoGeometrico {
int X;
int Y;
int VD1=1;
int VD2=3;

public PuntoGeometrico() {
	this.X=0;
	this.Y=0;
}
public PuntoGeometrico(int x, int y) {
	this.X=x;
	this.Y=y;
}
public void desplazar(int x, int y) {
	this.X += X+VD1;
	this.Y+= Y+VD2;
}
public double distanciaEuclidea() {
	double distancia=Math.sqrt(X-X) + Math.sqrt(Y-Y);
return distancia;
}
public int getX() {
	return X;
}
public void setX(int x) {
	X = x;
}
public int getY() {
	return Y;
}
public void setY(int y) {
	Y = y;
}
}