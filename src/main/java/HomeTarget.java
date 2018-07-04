
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTarget {
    public static void main(String[] args) throws IOException {
        File[] filesList;
        new File("D:\\ScreenShootRenamer").mkdir();
        Faq.context();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String choise = reader.readLine();
            if (choise.equals("1")) {
                StartParse startParse = new StartParse();
                startParse.run();
            }
        }


    }
}
