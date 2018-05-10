package classes;
import org.Interfaces.Entity;
import org.apache.commons.lang3.StringUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileCsv extends File {

    protected FileCsv(String ruta) {
        super(ruta);
    }

    @Override
    public void write(List<? extends Entity> entities) {
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(this.ruta+".csv");

            String csv ="";
            List<String> headers = entities.get(0).getAtributes();
            csv += StringUtils.join(headers, ',')+"\n";


            for (Entity entity: entities) {
                csv += entity.toString()+"\n";

            }

            fileWriter.write(csv);
            System.out.println("archivo creado");

        }catch(Exception e){
            System.out.println("archivo no creado");
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
