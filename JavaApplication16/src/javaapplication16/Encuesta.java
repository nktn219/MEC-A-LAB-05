package javaapplication16;

public class Encuesta {
    private String mes;
    private int año;
    private int visitas;
    private String nacionalidad;

    public Encuesta(String nombre, int edad, String genero, String pais) {
        this.mes = mes;
        this.año = año;
        this.visitas = visitas;
        this.nacionalidad = nacionalidad;
    }
    public Encuesta(){
        
    }

    public String getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public int getVisitas() {
        return visitas;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}