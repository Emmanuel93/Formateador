package classes;

public class FileFactory extends FileWritter {
    @Override
    protected File createFile(String tipo,String fileName) {

        File file = null;
        switch (tipo){
            case "JSON":
                file = new FileJson(fileName);
                break;
            case "XML":
                file = new FileXml(fileName);
                break;
            case "CSV":
                file = new FileCsv(fileName);
                break;
            default:
                file = null;
                break;


        }

        return file;
    }
}
