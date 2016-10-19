import java.util.*;

public class Point {

   //private variables
   private double x;
   private double y;
   private double z;

   //Default Constructor
   public Point(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public void set_x(double val) {
      x = val;
   }

   public void set_y(double val) {
      y = val;
   }

   public void set_z(double val) {
      z = val;
   }

   public double get_x() {
      return x;
   }

   public double get_y() {
      return y;
   }

   public double get_z() {
      return z;
   }

}
