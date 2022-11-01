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
        }else { // run coordinate through LinearEquation class
            //create object
            LinearEquation obj = new LinearEquation(x1, y1, x2, y2);
            System.out.println();
            System.out.println(obj.lineInfo()); // print LinearEquation Info

            System.out.print("Enter a value for x: ");
            double userNum = scan.nextDouble();
            System.out.println(obj.coordinateForX(userNum));

            scan.close();

            //testcode:
//            x1 = -1;
//            y1 = 5;
//            x2 = 3;
//            y2 = 10;
//            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
//            System.out.println("Equation: " + equation.equation());
//            System.out.println("Slope: " + equation.slope());
//            System.out.println("y-intercept: " + equation.yIntercept());
//            System.out.println("Distance: " + equation.distance());
//            System.out.println();
//            System.out.println("----- Line info -----");
//            System.out.println(equation.lineInfo());
//            System.out.println();
//            double testX = 4;
//            System.out.println("Coordinate for x: " + equation.coordinateForX(testX));

        }
    }
}