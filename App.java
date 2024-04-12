import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date = new Date();
        String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"};
        String currentMonth = months[date.getMonth()];
        System.out.println("Vladimir Gaysenok" + "\nMonth\\Day\\Time: "+ currentMonth + "\\" + date.getDay()
                + "\\" + date.getHours() + ":" + date.getMinutes());
    }
}
