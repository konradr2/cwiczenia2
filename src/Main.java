import java.util.Scanner;
import java.time.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        System.out.println("Podaj miasto: ");
        String city = scanner.next();
        //System.out.println("Podaj dzień tygodnia");
        //String day = scanner.next();
        String day = LocalDate.now().getDayOfWeek().name();

        System.out.println(day);
        int price = 40;
        int discount = 0;


       if(age<10){
            price = 0;
        } else if (age>10 && age<18) {
            discount = 50;
            price = 40*(1/2);
        } else if (city == "Warsaw") {
            price = (1/10)*price;
        } else if (day == "THURSDAY") {
            price = 0;
            discount = 100;
        }else {
            price = 40;
        }



        System.out.println("Data: " + city + ", " + age +" years old, weekday Ticket price: " +
                                           price + " PLN " + " Discount : " +discount+"%");

    }
}