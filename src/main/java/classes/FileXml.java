package classes;

import org.Interfaces.Entity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileXml extends File {

    protected FileXml(String ruta) {
        super(ruta);
    }

    @Override
    public void write(List<? extends Entity> entities) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(this.ruta+".xml");
            String xml= "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Alumnos>";

            for (Entity entity:entities) {
                xml += ((Alumno)entity).toXml();
            }
            xml +="</Alumnos>";

            fileWriter.write(xml);
            System.out.println("xml creado");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
