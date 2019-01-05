import java.io.File;

public class Extension extends Classifier
{
    @Override
    public String getInfo(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

    @Override
    public String toString() {
        return "Extension";
    }
}
