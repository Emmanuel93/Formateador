package classes;

import lombok.Data;
import org.Interfaces.Entity;

import java.util.List;

@Data
public abstract class File {

    private String ruta;

    protected File(String ruta){
        this.ruta = ruta;
    }

    public abstract void write(List<? extends Entity> entities);
}
