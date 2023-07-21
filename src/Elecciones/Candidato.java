
package Elecciones;


public class Candidato {
    
    private String nombre;
    private int edad;
    private String partido;
    private int costoCam;
    private int votos;
    
    
    
    public Candidato(String nombre , int edad, String partido,int costocam, int votos){
    
    this. nombre = nombre;
    this. edad = edad;
    this. partido = partido;
    this. costoCam = costoCam;
    this. votos = votos;
    
    
    
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getCostoCam() {
        return costoCam;
    }

    public void setCostoCam(int costoCam) {
        this.costoCam = costoCam;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}
