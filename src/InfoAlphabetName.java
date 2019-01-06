import java.io.File;

public class InfoAlphabetName implements InfoFileBehavior {
    public String getInfo(File file) {
        return file.getName().charAt(0)+"";
    }
}
