package Prog2;


	import java.time.LocalDate;
	import java.time.Period;
	import java.time.format.DateTimeFormatter;

	public class Persona {
	    public static void main(String[] args) {

	        // Crear una instancia de Persona utilizando diferentes constructores
	        Persona persona = new Persona(12345678, "John", "Doe", 28, "15-05-1995","masculino", 70.5, 1.75);
	        
	        // Imprimir información de la persona
	        System.out.println("Información de la persona:");
	        System.out.println(persona.getInformacion());
	        System.out.println("Es mayor de edad: " + persona.esMayorDeEdad());
	        System.out.println("Puede votar: " + persona.esMayorDe16());
	        System.out.println("IMC: " + persona.calcularIMC() + " esta en forma? " + persona.estaEnForma());
	        System.out.println("Edad coincide con su fecha de nac: " + persona.coincideEdadFecha());
	        System.out.println("Cumpleaños hoy: " + persona.esCumpleaniosHoy());
	    }


	    

	    // Atributos
	    private String nombre;
	    private String apellido;
	    private int edad;
	    private String fecha;
	    private int DNI;
	    private String sexo;
	    private double peso;
	    private double altura;

	    // Constructor por defecto con DNI, inicializa valores por defecto
	    public Persona(int DNI) {
	        this.DNI = DNI;
	        this.fecha = "1 de enero de 2000";
	        this.sexo = "Femenino";
	        this.nombre = "N";
	        this.peso = 1.0;
	        this.altura = 1.0;
	    }

	    // Constructor con DNI, nombre y apellido
	    public Persona(int DNI, String nuevoNombre, String nuevoApellido) {
	        this(DNI);
	        nombre = nuevoNombre;
	        apellido = nuevoApellido;
	    }

	    // Constructor con DNI, nombre, apellido y fecha de nacimiento
	    public Persona(int DNI, String nuevoNombre, String nuevoApellido, String fechaNacimiento) {
	        this(DNI, nuevoNombre, nuevoApellido);
	        fecha = fechaNacimiento;
	    }

	    // Constructor con DNI y apellido
	    public Persona(int DNI, String nuevoApellido) {
	        this(DNI);
	        apellido = nuevoApellido;
	    }
	//
	    // Constructor con todos los atributos
	    public Persona(int DNI, String nuevoNombre, String nuevoApellido, int edad, String fechaNacimiento,
	            String sexo, double peso, double altura) {
	        this.DNI=DNI;
	        nombre=nuevoNombre;
	        apellido=nuevoApellido;
	        fecha=fechaNacimiento;
	        this.peso= peso; 
	        this.altura=altura;
	        this.edad=edad;
	        this.sexo=sexo;

	    }

	    // Constructor con Nombre, DNI, apellido, fecha, peso, altura
	    public Persona(int DNI, String nuevoNombre, String nuevoApellido, String fechaNacimiento,
	            double peso, double altura) {
	        this(DNI, nuevoNombre, nuevoApellido, fechaNacimiento);
	        this.peso = peso;
	        this.altura = altura;
	    }

	    // Constructor con DNI, nombre, apellido, fecha de nacimiento, peso y sexo
	    public Persona(int DNI, String nuevoNombre, String nuevoApellido, String fechaNacimiento,
	            double peso, String sexo) {
	        this(DNI, nuevoNombre, nuevoApellido, fechaNacimiento);
	        this.peso = peso;
	        this.sexo = sexo;
	    }

	 

	    // Método para calcular el índice de masa corporal
	    public double calcularIMC() {
	        return getPeso()/ (getAltura() * getAltura());
	    }

	    // Método para verificar si la persona está en forma según el IMC
	    public boolean estaEnForma() {
	        double imc = calcularIMC();
	        return imc >= 18.5 && imc <= 25;
	    }

	    //Metodo edad coincide con fecha nacimientp 
	    public boolean coincideEdadFecha(){
	        return getEdad()==calcularEdad();
	    }
	    // Método para calcular la edad
	    public int calcularEdad() {
	        LocalDate fechaNacimientoDate = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	        LocalDate fechaActual = LocalDate.now();
	        Period periodo = Period.between(fechaNacimientoDate, fechaActual);
	        return periodo.getYears();
	    }

	    // Método para verificar si es mayor de edad
	    public boolean esMayorDeEdad() {
	        int edad = calcularEdad();
	        return edad >= 18;
	    }
	     //Metodo puede Votar
	    public boolean esMayorDe16() {
	        int edad = calcularEdad();
	        return edad >= 16;
	    }

	    // Método para verificar si hoy es el cumpleaños
	    public boolean esCumpleaniosHoy() {
	        LocalDate fechaNacimientoDate = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	        LocalDate fechaActual = LocalDate.now();
	        return fechaNacimientoDate.getDayOfMonth() == fechaActual.getDayOfMonth() &&
	               fechaNacimientoDate.getMonthValue() == fechaActual.getMonthValue();
	    }


	    // Método para obtener información completa de la persona en formato de String
	    public String getInformacion() {
	        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + calcularEdad()+ "\nFecha de Nacimiento: " + fecha
	                + "\nDNI: " + DNI + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
	    }

	    // Métodos set para modificar atributos
	    public void setSexo(String sex) {
	        sexo = sex;
	    }

	    public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }

	    public void setAltura(int altura) {
	        this.altura = altura;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }
	    
	    // Métodos get para obtener valores de atributos
	    public int getDni() {
	        return DNI;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String ape) {
	        apellido = ape;
	    }

	    public void setNombre(String nom) {
	        nombre = nom;
	    }
	    
	    public void setEdad(int edad) {
	        this.edad=edad;
	    }
	    public int getEdad() {
	        return edad;
	    }
	    public double getPeso() {
	    	 return peso;
	     }
	    public double getAltura() {
	    	return altura;
	    }


	}

