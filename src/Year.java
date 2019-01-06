import java.io.File;
import java.time.LocalDate;

public class Year extends Classifier {

    public Year(){

    }
    public Year(String pathSrc,String pathDst){
        this.pathSrc=pathSrc;
        this.pathDst=pathDst;
    }
    @Override
    public String getInfo(File file) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear()+"";
    }

    @Override
    public String toString() {
        return "Year";
    }
}
