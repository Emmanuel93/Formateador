package org.Interfaces;

import java.util.List;

public interface Reader<T extends Entity> {

    public List<T> getFile();

}
