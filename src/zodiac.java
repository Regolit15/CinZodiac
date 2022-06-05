import java.util.Scanner;

public class zodiac {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Dogum Yilinizi Giriniz : ");
        year = input.nextInt();

        if (year % 12 == 0) {
            System.out.print("Maymun Yilinda Dogdunuz");
        } else if (year % 12 == 1) {
            System.out.print("Horoz Yilinda Dogdunuz");


        } else if (year % 12 == 2) {
            System.out.print("Kopek Yilinda Dogdunuz");


        } else if (year % 12 == 3) {
            System.out.print("Domuz Yilinda Dogdunuz");


        } else if (year % 12 == 4) {
            System.out.print("Fare Yilinda Dogdunuz");


        } else if (year % 12 == 5) {
            System.out.print("Okuz Yilinda Dogdunuz");


        } else if (year % 12 == 6) {
            System.out.print("Kaplan Yilinda Dogdunuz");


        } else if (year % 12 == 7) {
            System.out.print("Tavsan Yilinda Dogdunuz");


        } else if (year % 12 == 8) {
            System.out.print("Ejderha Yilinda Dogdunuz");


        } else if (year % 12 == 9) {
            System.out.print("Yilan Yilinda Dogdunuz");


        } else if (year % 12 == 10) {
            System.out.print("At Yilinda Dogdunuz");


        } else if (year % 12 == 11) {
            System.out.print("Koyun Yilinda Dogdunuz");


        } else {
            System.out.print("Hatali Veri Girdiniz!");
        }


    }
}
