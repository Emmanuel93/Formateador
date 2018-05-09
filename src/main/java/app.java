import classes.*;

import java.util.List;

public class app {

    public static void main(String ... args){

        ReaderFile<Alumno> read = new ReaderFile<Alumno>(Alumno.class,Alumno.fileName);
        List<Alumno> alumnos = read.getFile();
        alumnos.stream()
                .forEach(x ->{
                    System.out.println(x);
                });

        ReaderFile<Animal> read2 = new ReaderFile<Animal>(Animal.class,Animal.fileName);
        List<Animal> animales = read2.getFile();
        animales.stream()
                .forEach(x ->{
                    System.out.println(x);
                });

        //FileWritter obj = new FileFactory();
        //File json = obj.giveMeAfile("JSON", alumnos);
    }

}
