import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Settings {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String nameSetings = "Настройки";
    static String path = "D:\\ScreenShootRenamer\\Settings";


    public Settings() throws FileNotFoundException {
    }

    public String getNameDirectory() {
            return path;
    }

    public void editDetictory(String newPath) {
        path = newPath;
        System.out.println("Директория изменена.");
    }

    public String getDate() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");
        return formatForDateNow.format(dateNow);
    }



    public void printAbout() {
        System.out.println("1) путь директории");
        System.out.println("2) изменить путь");
        System.out.println("3) Вернуться назад");
    }
}
