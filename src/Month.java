import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Month extends Classifier {

    @Override
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

    @Override
    public String toString() {
        return "Month";
    }
}
