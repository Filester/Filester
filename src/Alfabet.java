import java.io.File;

public class Alfabet extends Classifier {

    @Override
    public String getInfo(File file) {
        return file.getName().charAt(0)+"";
    }

    @Override
    public String toString() {
        return "Alfabet";
    }
}



