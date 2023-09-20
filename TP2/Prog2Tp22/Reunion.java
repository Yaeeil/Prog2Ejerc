package Prog2Tp22;

public class Reunion {
    Participante[] participantes;
    private int duracion;
    private String tema;
    private String lugar;
    private String horaInicio;

    public Reunion(String horaInicio, int duracion, String tema, String lugar, Participante[] participantes) {
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.tema = tema;
        this.lugar = lugar;
        this.participantes = participantes;
    }


public String getHoraInicio() {
		return horaInicio;
	}


	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}


public Participante[] getParticipantes() {
	return participantes;
}


public void setParticipantes(Participante[] participantes) {
	this.participantes = participantes;
}


public int getDuracion() {
	return duracion;
}


public void setDuracion(int duracion) {
	this.duracion = duracion;
}


public String getTema() {
	return tema;
}


public void setTema(String tema) {
	this.tema = tema;
}


public String getLugar() {
	return lugar;
}


public void setLugar(String lugar) {
	this.lugar = lugar;
}
}