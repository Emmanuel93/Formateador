package classes;

import lombok.Data;
import org.Interfaces.Entity;

import java.util.ArrayList;
import java.util.List;

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


    @Override
    public List<String> getAtributes() {
        ArrayList<String> atributes = new ArrayList<>();
        atributes.add("numeroDeControl");
        atributes.add("nombre");
        atributes.add("apellidoPaterno");
        atributes.add("apellidoMaterno");
        atributes.add("edad");
        atributes.add("sexo");
        atributes.add("carrera");
        atributes.add("semestre");

        return atributes;
    }

    public String toString(){
        return  this.numeroDeControl +","+this.nombre+","+this.apellidoPaterno +","
                + this.apellidoMaterno +","+ this.edad+"," + this.sexo+","
                + this.carrera + "," +this.semestre;
    }
}
