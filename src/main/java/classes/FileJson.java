package classes;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.Interfaces.Entity;

import java.io.IOException;
import java.util.List;

public class FileJson extends File {

    protected FileJson(String ruta) {
        super(ruta);
    }

    @Override
    public void write(List<? extends Entity> entities) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            String json = mapper.writeValueAsString(entities);;
            mapper.writeValue(new java.io.File(this.ruta+".json"),json);
            System.out.println("json creado");
        }catch (JsonProcessingException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
