import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Settings {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String nameSetings = "Настройки";
    static String defaultPath = "D:\\ScreenShootRenamer\\Settings";
    static String userPath;

    public Settings() throws FileNotFoundException {
        printAbout();
    }

    public void getNameDirectory() {
        if(userPath == null) {
            System.out.println(defaultPath);
        }
        else System.out.println(userPath);
    }

    public void editDetictory() {
        System.out.println("Введите путь к новой директории");
        try {
            userPath = reader.readLine();
        } catch (IOException e) {
            System.out.println("Введен некорректный путь");
        }
    }

    public String getDate() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");
        return formatForDateNow.format(dateNow);
    }



    private void printAbout() {
        System.out.println(nameSetings);
        System.out.println("1) путь директории");
        System.out.println("2) изменить путь");
        System.out.println("3) Вернуться назад");
    }
}
