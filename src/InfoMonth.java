import java.io.File;
import java.time.LocalDate;

public class InfoMonth implements InfoFileBehavior{
    public String getInfo(File file) {
        LocalDate currentDate = LocalDate.now();
        StringBuilder converted = new StringBuilder();
        String month = currentDate.getMonth().toString();
        boolean convertNext = true;
        for (char ch : month.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            converted.append(ch);
        }
        return converted.toString();
    }
}
