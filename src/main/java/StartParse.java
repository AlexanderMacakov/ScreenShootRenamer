import java.io.File;
import java.io.FileNotFoundException;


public class StartParse {
    public void run() throws FileNotFoundException {

        Settings settings = new Settings();
        int countFiles = 1;
        String pathName = "Compiling\\" + settings.getDate() + "-" + countFiles + ".png";

        File filesPath = new File("RefFiles");
        File[] filesList = filesPath.listFiles();


        for (File file: filesList) {

            File renameFile = new File(pathName);

            if (file.renameTo(renameFile)) {
                System.out.println("Файл: " + renameFile.toString() + " обработан");
            }
            else
                System.out.println("Ошибка");

            countFiles++;
        }
    }
}


