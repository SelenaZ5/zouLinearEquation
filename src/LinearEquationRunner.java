import java.util.Scanner;
class LinearEquationRunner {
    public static void main(String[] args) {
        //create object:
        Scanner scan = new Scanner(System.in);

        //welcome user and get inputs
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: "); // get first coordinate, x1 and y1 value
        String coord1 = scan.nextLine();
        int comma1 = coord1.indexOf(","); // common symbol --> ( , )
        int endParenthesis1 = coord1.indexOf(")");
        int x1 = Integer.parseInt(coord1.substring(1,comma1));
        int y1 = Integer.parseInt(coord1.substring(comma1+2,endParenthesis1));

        System.out.print("Enter coordinate 2: "); // get second coordinate, x2 and y2 value
        String coord2 = scan.nextLine();
        int comma2 = coord2.indexOf(",");
        int endParenthesis2 = coord2.indexOf(")");
        int x2 = Integer.parseInt(coord2.substring(1,comma2));
        int y2 = Integer.parseInt(coord2.substring(comma2+2,endParenthesis2));
        //slope is undefined, exit program without entering value into LinearEquation class
        if(x1 == x2){
            System.out.println("These points are on a vertical line: x = " + x1 );
            scan.close();
        }else {
            //create object
            LinearEquation testRun = new LinearEquation(x1, y1, x2, y2);
            System.out.println();
            System.out.println(testRun.lineInfo()); // print LinearEquation Info

            System.out.println("Enter a value for x: ");
            int userNum = scan.nextInt();


            scan.close();
        }
    }
}