package classes;

import org.Interfaces.Entity;

import java.util.List;

public abstract class FileWritter {

    public File giveMeAfile(String tipo, List< ? extends Entity> entities){
        File file = null;

        file = createFile(tipo);
        file.write(entities);

        return file;
    }

    protected abstract File createFile(String tipo);
}
