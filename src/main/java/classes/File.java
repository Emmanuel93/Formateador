package classes;

import lombok.Data;
import org.Interfaces.Entity;

import javax.xml.bind.JAXBException;
import java.util.List;

@Data
public abstract class File {

    protected String ruta;

    protected File(String ruta){
        this.ruta = ruta;
    }

    public abstract void write(List<? extends Entity> entities);
}
