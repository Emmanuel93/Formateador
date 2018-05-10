package classes;

import org.Interfaces.Entity;
import java.util.List;

public class FileXml extends File {

    protected FileXml(String ruta) {
        super(ruta);
    }

    @Override
    public void write(List<? extends Entity> entities) {
    }
}
