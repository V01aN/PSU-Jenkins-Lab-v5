import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date = new Date();
        String[] months = new String[] {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
        "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String currentMonth = months[date.getMonth()];
        System.out.println("Гайсёнок Владимир" + "\nМесяц\\Дата\\Время: "+ currentMonth + "\\" + date.getDay()
                + "\\" + date.getHours() + ":" + date.getMinutes());
    }
}
