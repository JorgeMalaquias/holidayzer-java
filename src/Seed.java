import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Seed {
    public static List<Holiday> generate (){

        List<Holiday> holidays = new ArrayList<>();
        holidays.add(new Holiday("Confraternização mundial", "01/01/2023"));
        holidays.add(new Holiday("Carnaval", "21/02/2023"));
        holidays.add(new Holiday("Páscoa", "17/04/2023"));
        holidays.add(new Holiday("Tiradentes", "21/04/2023"));
        holidays.add(new Holiday("Dia do trabalho", "01/05/2023"));
        holidays.add(new Holiday("Corpus Christi", "08/06/2023"));
        holidays.add(new Holiday("Independência do Brasil", "07/09/2023"));
        holidays.add(new Holiday("Nossa Senhora Aparecida", "12/10/2023"));
        holidays.add(new Holiday("Finados", "02/11/2023"));
        holidays.add(new Holiday("Proclamação da República", "15/11/2023"));
        holidays.add(new Holiday("Natal", "25/12/2023"));

        

        return holidays;
    }
}
