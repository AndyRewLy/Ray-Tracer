import java.util.*;

public class Sphere {

   //private variables
   private Point center;
   private double radius;
   private Color color;
   private Finish finish;

   //Default Constructor
   public Sphere(Point center, double radius, Color color, Finish finish) {
      this.center = center;
      this.radius = radius;
      this.color = color;
      this.finish = finish;
   }

   public void set_center(Point val) {
      center = val;
   }

   public void set_radius(double val) {
      radius = val;
   }

   public void set_color(Color val) {
      color = val;
   }

   public void set_finish(Finish val) {
      finish = val;
   }

   public Point get_center() {
      return center;
   }

   public double get_radius() {
      return radius;
   }

   public Color get_color() {
      return color;
   }

   public Finish get_finish() {
      return finish;
   }

}
