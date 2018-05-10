import classes.*;

import java.util.List;

public class app {

    public static void main(String ... args){

        ReaderFile<Alumno> read = new ReaderFile<Alumno>(Alumno.class,Alumno.fileName);
        List<Alumno> alumnos = read.getFile();

        System.out.println("Alumnos!");
        System.out.println();
        FileWritter obj = new FileFactory();

        File json = obj.giveMeAfile("JSON", alumnos,"Alumnos");
        //File xml = obj.giveMeAfile("XML", alumnos,"Alumnos");
        File csv = obj.giveMeAfile("CSV", alumnos,"Alumnos");

        System.out.println();

    }

}
