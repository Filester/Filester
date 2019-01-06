import java.io.File;

public class Alfabet extends Classifier {

    public Alfabet(){

    }
    public Alfabet(String pathSrc,String pathDst){
        this.pathSrc=pathSrc;
        this.pathDst=pathDst;
    }

    @Override
    public String getInfo(File file) {
        return file.getName().charAt(0)+"";
    }

    @Override
    public String toString() {
        return "Alfabet";
    }
}



