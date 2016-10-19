import java.util.*;

public class Ray {

   //private variables
   private Point pt;
   private Vector dir;

   //Default Constructor
   public Ray(Point pt, Vector dir) {
      this.pt = pt;
      this.dir = dir;
   }

   public void set_pt(Point val) {
      pt = val;
   }

   public void set_dir(Vector val) {
      dir = val;
   }

   public Point get_pt() {
      return pt;
   }

   public Vector get_dir() {
      return dir;
   }

}
