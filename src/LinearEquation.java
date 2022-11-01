public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    /* Creates a LinearEquation object */
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
   this precondition is not violated)
 */

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }


    /* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
       the nearest hundredth */
    //distance formula: d=√((x2 – x1)² + (y2 – y1)²)
    public double distance(){
        double coord1Distance = Math.pow(x2 - x1 , 2);
        double coord2Distance = Math.pow(y2-y1,2);
        double combineDistance = Math.sqrt(coord1Distance + coord2Distance);
        return roundedToHundredth(combineDistance);
    }


    /* Calculates and returns the y-intercept of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double yIntercept(){
        double ySubstitute = y1;
        double xSubstitute = slope()*x1;
        double yIntercept = ySubstitute - xSubstitute;
        return roundedToHundredth(yIntercept);
    }


    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        double rise = y2 - y1;
        double run = x2 -x1;
        return roundedToHundredth(rise/ run);
    }

    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".
        When generating the m value (slope), here are examples of "printable" slopes:
           5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7
        Here are non-examples of "printable" slopes:
     1/-2 (should be -1/2), -4/-3 (should be 4/3), 8/4 (should be reduced to 2),
           -12/3 (should be -4), 3/3 (should be 1), -6/6 (should be -1)
        HINT: Be sure to check if the line is horizontal and return an appropriate string,
        e.g. y = 6
        HINT: Absolute value might be helpful for ensuring proper placement of negative sign!
        When generating the b value, here are some examples of "printable" y-intercepts:
           + 1.0 	- 2.35	      + 12.5		- 8.0		+ 17.19
        Here are non-examples of "printable" y-intercepts:
           - -1.0 	+ -2.35	- -12.5	+ -8.0	     - -17.19	+ 0	- 0
        HINT: Absolute value might be helpful for printing negative y-intercepts as
               subtraction!
     */
    public String equation(){
        String returnSlope = "";
        if(slope() != (int) slope()){ //convert slope decimal into fraction
            int rise = y2 -y1;
            int run = x2-x1;
            returnSlope = rise + "/" + run + "x";

            if(run < 0 ){ // slope is negative
                returnSlope = "-" + rise + "/" + run*-1 + "x";
            }
            if(rise < 0 && run < 0){ // in the case of double negatives, return positive slope
                returnSlope = rise*-1 + "/" + run*-1 + "x";
            }
        } else { // slope is a whole number
            returnSlope += (int)slope() + "x";
        }

        if(slope() == 1){ // omit number "1" when slope is 1
            returnSlope = "x";
        } else if(slope() == -1){ //omit number "1" when slope is -1
            returnSlope = "-x";
        }

        String returnYIntercept = "";
        if(yIntercept() == 0){ // omit b when y intercept is 0
            returnYIntercept = "";
        } else if(yIntercept() < 0) { // use "-" sign when y intercept is negative
            returnYIntercept = " - "  + yIntercept()*-1;
        } else{
            returnYIntercept = " + " + yIntercept();
        }
        if(slope() == 0){ // when slope creates a horizontal line
            returnSlope = "";
            returnYIntercept = "";
            returnYIntercept += (int)yIntercept();
        }
        return "y = " + returnSlope + returnYIntercept;
    }

    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue) {



    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth
        HINT:  the Math.round method can help with this!
     */
        return "";
    }
    public double roundedToHundredth(double toRound) {
        return (double)Math.round(toRound*100) / 100;
    }

    /* Returns a string that includes all information about the linear equation, each on
   separate lines:
     - The original points: (x1, y1) and (x2, y2)
     - The equation of the line in y = mx + b format (using equation() method)
     - The slope of the line, as a decimal (using slope() method)
     - The y-intercept of the line (using yIntercept() method)
     - The distance between the two points (using distance() method)
  This method should call all other appropriate methods to get the info it needs:
  equation(), slope(), yIntercept(), distance().
  */
    public String lineInfo(){
        String lineInfo = "The two points are: (" + x1 + ", " + y1 + ") and ";
        lineInfo += "(" + x2 + ", " + y2 + ")" + "\n";
        lineInfo += "The equation of the line between these point is: " + equation() + "\n";
        lineInfo += "The slope of this line is: " + slope() + "\n";
        lineInfo += "The y-intercept of the line is: " + yIntercept() + "\n";
        lineInfo += "The distance between the two points is: " + distance() + "\n";
        return lineInfo;
    }
}