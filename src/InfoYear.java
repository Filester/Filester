import java.io.File;
import java.time.LocalDate;

public class InfoYear implements InfoFileBehavior{
    public String getInfo(File file) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear()+"";
    }
}
