import java.util.Scanner;
class LinearEquationRunner {
    public static void main(String[] args) {
        //create object:
        Scanner scan = new Scanner(System.in);

        //welcome user and get inputs

        //test coordinate : (5,6) and (9,13)
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        int comma1 = coord1.indexOf(",");
        int endParenthesis1 = coord1.indexOf(")");
        int x1 = Integer.parseInt(coord1.substring(1,comma1));
        int y1 = Integer.parseInt(coord1.substring(comma1+2,endParenthesis1));

        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int comma2 = coord2.indexOf(",");
        int endParenthesis2 = coord2.indexOf(")");
        int x2 = Integer.parseInt(coord2.substring(1,comma2));
        int y2 = Integer.parseInt(coord2.substring(comma2+2,endParenthesis2));

        if(x1 == x2){
            System.out.println("These points are on a vertical line: x = " + x1 );
            scan.close();
        }else {

            LinearEquation testRun = new LinearEquation(x1, y1, x2, y2);
            System.out.println();
            System.out.println(testRun.lineInfo());

            scan.close();
        }
    }
}