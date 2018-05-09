package classes;

import lombok.Data;
import org.Interfaces.Entity;

@Data
public class Alumno implements Entity{

    public static final String fileName = "Alumnos.txt";

    private String numeroDeControl;

    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private Integer edad;

    private String sexo;

    private String carrera;

    private Integer semestre;

    public Alumno(String numeroDeControl, String nombre, String apellidoPaterno, String apellidoMaterno, Integer edad,
                  String sexo, String carrera, Integer semestre){

        this.numeroDeControl = numeroDeControl;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.sexo = sexo;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Alumno(){
        this.nombre = "Emmanuel";
    }

    public String toString(){
        return this.numeroDeControl+"->"+this.nombre;
    }
}
