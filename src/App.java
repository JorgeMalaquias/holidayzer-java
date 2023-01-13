import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Scanner inputVar = new Scanner(System.in);
        List<Holiday> holidays = Seed.generate();
        // String date = inputVar.nextLine();
        //System.out.println(exist("08/06/2023", holidays));
        System.out.println(listingAll(holidays));
    }

    public static String exist(String date, List<Holiday> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getDate()==date){
                return "A data se refere ao feriado de " + list.get(i).getName();
            }
        }

        return "Não existe feriado com a data passada";
    }

    public static List<String> listingAll (List<Holiday> list){
        List<String> holidays = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            holidays.add(list.get(i).getName());    
        }
        return holidays;
    }
}