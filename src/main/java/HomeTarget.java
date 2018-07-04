
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTarget {
    public static void main(String[] args) throws IOException {

        new File("RefFiles").mkdir();
        new File("Compiling").mkdir();

        File[] filesList;
        Faq.preview();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choise;

        while (true) {
            Faq.context();
            choise = reader.readLine();
            if (choise.equals("1")) {
                StartParse startParse = new StartParse();
                startParse.run();
            }
            else if (choise.equals("2")) {
                Settings settings = new Settings();
                System.out.println(Settings.nameSetings);
                while (true) {

                    settings.printAbout();
                    choise = reader.readLine();

                    if (choise.equals("1")) {
                        System.out.println(settings.getNameDirectory());
                    }
                     else if (choise.equals("2")) {
                        System.out.println("Введите новый путь до директории");
                        String editPath = reader.readLine();
                    }
                    else if (choise.equals("3")) {
                        break;
                    } else{
                        System.out.println("Ля, выбери что-то из меню, другого не дано");
                    }
                    System.out.println("--------------------------------------------------------------");
                }

            }
            else if (choise.equals("3")) {
                System.out.println("В разработке");
            }
            else if (choise.equals("4")) {
                System.out.println("Удачного дня!");
                break;
            }
             else{
                System.out.println("Ля, выбери что-то из меню, другого не дано");
            }
        }


    }
}
