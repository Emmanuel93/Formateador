package classes;

public class FileFactory extends FileWritter {
    @Override
    protected File createFile(String tipo) {

        File file = null;
        switch (tipo){
            case "JSON":
                file = new FileJson("json");
                break;
            default:
                file = null;
                break;


        }

        return file;
    }
}
