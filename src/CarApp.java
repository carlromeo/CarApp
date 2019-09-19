import java.util.Scanner;

public class CarApp {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        String make="";
        String model="";
        int year = 0;


        Car carPage = new Car();
        System.out.println("Please enter Make: ");
        make =key.nextLine();
        carPage.setMake(make);

        System.out.println("Please enter Model: ");
        model =key.nextLine();
        carPage.setModel(model);

        System.out.println("Please enter Year: ");
        year = key.nextInt();
        carPage.setYear(year);

        String displayText = carPage.getDisplayText();

        System.out.println(displayText);
    }
}
