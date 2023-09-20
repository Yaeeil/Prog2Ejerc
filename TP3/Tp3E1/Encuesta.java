package Tp3E1;

public class Encuesta {
    private String nombreEncuesta;
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
    private String pregunta4;
    private Empleado empleado;
    private PersonaEncuestada personaEncuestada;

    public Encuesta(String nombre, String p1, String p2, String p3, String p4, Empleado empleado, PersonaEncuestada personaEncuestada) {
        nombreEncuesta = nombre;
        pregunta1 = p1;
        pregunta2 = p2;
        pregunta3 = p3;
        pregunta4 = p4;
        this.empleado = empleado;
        this.personaEncuestada = personaEncuestada;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public PersonaEncuestada getPersonaEncuestada() {
        return personaEncuestada;
    }


    public String getNombreEncuesta() {
		return nombreEncuesta;
	}

	public void setNombreEncuesta(String nombreEncuesta) {
		this.nombreEncuesta = nombreEncuesta;
	}


	public String getPregunta1() {
		return pregunta1;
	}

	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public String getPregunta2() {
		return pregunta2;
	}

	public void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}

	public String getPregunta3() {
		return pregunta3;
	}

	public void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}

	public String getPregunta4() {
		return pregunta4;
	}

	public void setPregunta4(String pregunta4) {
		this.pregunta4 = pregunta4;
	}


  
    
}