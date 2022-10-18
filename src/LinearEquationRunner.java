import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args ){
        //create object:
        Scanner scan = new Scanner(System.in);

        //welcome user and get inputs

        //test coordinate : (5,6) and (9,13)
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1,2));
        System.out.println(x1);
        int y1 = Integer.parseInt(coord1.substring(3,4));
        System.out.println(y1);
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        LinearEquation testRun = new LinearEquation(x1,y1,9,13);

        System.out.println("The distance between the two points is: " + testRun.distance());

        scan.close();

    }
}
