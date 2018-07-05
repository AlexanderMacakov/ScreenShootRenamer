import java.io.File;
import java.io.FileNotFoundException;


public class StartParse {
    public void run() throws FileNotFoundException {
        Settings settings = new Settings();
        int countFiles = 1;
        File filesPath = new File("RefFiles");

        File[] filesList = filesPath.listFiles();


        for (File file: filesList) {
            File renameFile = new File("Compiling\\" + settings.getDate() + "-" + countFiles + ".png");
            if (file.renameTo(renameFile)) {
                System.out.println("Файл: " + renameFile.toString() + " обработан");
            }
            else
                System.out.println("Ошибка");
            countFiles++;
        }
    }
}


