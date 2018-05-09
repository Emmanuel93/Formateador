package classes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.Interfaces.Entity;
import org.codehaus.jackson.annotate.JsonMethod;

import java.io.IOException;
import java.util.List;

public class FileJson extends File {

    protected FileJson(String ruta) {
        super(ruta);
    }

    @Override
    public void write(List<? extends Entity> entities) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = "[";
            for (Entity entity:entities) {
                 json += json + mapper.writeValueAsString(entity);
            }
            json += "]";
            System.out.println("json = " + json);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
