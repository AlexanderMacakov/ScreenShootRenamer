import java.io.File;
import java.io.FileNotFoundException;

public class StartParse {
    public void run() throws FileNotFoundException {

        File[] filesList;
        int count = 1;
        Settings settings = new Settings();
        File filesPath = new java.io.File("D:\\ScreenShootRenamer\\RefFiles"); // создаем объект на папку с файлами

        filesList = filesPath.listFiles(); // записываем файлы из папки в массив объектов типа File

        for (int i = 0; i < filesList.length; i++) {
            File file = filesList[i];
            String nameCount = String.valueOf(count);
            if(file.exists()){ // если файл существует, то переименовываем его
                file.renameTo( new File(settings.getDate() + String.valueOf(count) ));
                count++;
            }
            else{
                System.out.println("File not found!");
            }
        }
    }
}
