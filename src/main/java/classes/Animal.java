package classes;

import lombok.Data;
import org.Interfaces.Entity;

@Data
public class Animal implements Entity {

    public static final String fileName = "Animales.txt";

    private Integer id;

    private String nombre;

    public Animal(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String toString(){
        return this.id + " " +this.nombre;
    }

}
