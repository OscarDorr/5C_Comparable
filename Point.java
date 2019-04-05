/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public double size(){
      return(Math.sqrt(xcor * xcor + ycor * ycor));
    }
    public int compareTo( Point otherPoint){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
           // temp: all Points are One
           if(this.size() > otherPoint.size()){
             return 1;
           }
           else if(this.size() < otherPoint.size()){
             return -1;
           }
           else return 0;
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
