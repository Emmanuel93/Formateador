package classes;

import org.Interfaces.Entity;
import org.Interfaces.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class ReaderFile<T extends Entity> implements Reader<T> {

    private Class<T> typeArgumentClass;

    private String fileName;

    public ReaderFile(Class<T> typeArgumentClass, String fileName){
        this.fileName = fileName;
        this.typeArgumentClass = typeArgumentClass;
    }

    @Override
    public List<T> getFile() {
        ArrayList<T> result = new ArrayList<>();
        BufferedReader br = null;
        FileReader fr = null;

        try {

            Integer count = 0;

            List<Class> paramsTypes = new ArrayList<>();

            for(Field field : this.typeArgumentClass.getDeclaredFields()) {
                if(!Modifier.isFinal(field.getModifiers())){
                    paramsTypes.add(field.getType());
                }

            }

            Class[] paramsTypesArray = new Class[paramsTypes.size()];

            paramsTypesArray = paramsTypes.toArray(paramsTypesArray);

            fr = new FileReader(this.fileName);
            br = new BufferedReader(fr);

            String sCurrentLine;


            while ((sCurrentLine = br.readLine()) != null) {
                Object [] paramsValues= new Object[paramsTypes.size()];
                if(count != 0){

                   String[] values = sCurrentLine.split("\\|");

                   for (int i = 0;i<paramsValues.length;i++){
                       if(paramsTypesArray[i] == Integer.class){
                           paramsValues[i] = Integer.valueOf(values[i]);
                       }
                       else{
                           paramsValues[i] = values[i];
                       }
                   }

                    result.add(getInstanceOfT(this.typeArgumentClass,paramsTypesArray,paramsValues));

                }

                count++;
            }

        } catch (IOException e) {

            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return result;
    }

    public T getInstanceOfT(Class<T> aClass, Class[] paramsTypes, Object[] paramsValues )
            throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        return aClass.getConstructor(paramsTypes).newInstance(paramsValues);

    }
}
