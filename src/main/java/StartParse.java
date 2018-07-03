import java.io.File;
import java.io.FileNotFoundException;

public class StartParse {
    public void run() throws FileNotFoundException {

        File[] filesList;
        int count = 1;
        Settings settings = new Settings();
        File filesPath = new java.io.File("D:\\ScreenShootRenamer\\RefFiles");
        filesList = filesPath.listFiles();

        for (File file: filesList) {

        }
    }
}
