import java.util.*;
import java.lang.*;

public class VectorMath {

   //private variables

   //Default Constructor
   public VectorMath() {
   }

   public static Vector scale_vector(Vector v, double s) {
      Vector ret;

      ret = v;
  
      ret.set_x(ret.get_x() * s);
      ret.set_y(ret.get_y() * s);
      ret.set_z(ret.get_z() * s);

      return ret;
   }

   public static double dot_vector(Vector v1, Vector v2) {
      return (v1.get_x() * v2.get_x()) +
             (v1.get_y() * v2.get_y()) +
             (v1.get_z() * v2.get_z()); 
   }

   public static double length_vector(Vector v1) {
      return Math.sqrt(v1.get_x() * v1.get_x() +
                       v1.get_y() * v1.get_y() + 
                       v1.get_z() * v1.get_z());
   }

   public static Vector normalize_vector(Vector v1) {
      return new Vector(v1.get_x()/length_vector(v1),
                        v1.get_y()/length_vector(v1),
                        v1.get_z()/length_vector(v1));
     
   }

   public static Vector difference_point(Point p1, Point p2) {
      return new Vector(p1.get_x() - p2.get_x(),
                        p1.get_y() - p2.get_y(),
                        p1.get_z() - p2.get_z());
   }

   public static Vector difference_vector(Vector v1, Vector v2) {
      return new Vector(v1.get_x() - v2.get_x(),
                        v1.get_y() - v2.get_y(),
                        v1.get_z() - v2.get_z());
   }

   public static Point translate_point(Point p, Vector v) {
      return new Point(p.get_x() + v.get_x(),
                       p.get_y() + v.get_y(),
                       p.get_z() + v.get_z());
   }

   public static Vector vector_from_to(Point pFrom, Point pTo) {
      return new Vector(pTo.get_x() + pFrom.get_x(),
                        pTo.get_y() + pFrom.get_y(),
                        pTo.get_z() + pFrom.get_z());
   }
   

}
