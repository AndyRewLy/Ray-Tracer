import java.util.*;

public class Collisions {

   public Collisions() {

   }

   public static double distance(Point pt1, Point pt2) {
      return Math.sqrt(Math.pow(pt1.x - pt2.x, 2) +
                       Math.pow(pt1.y - pt2.y, 2) + 
                       Math.pow(pt1.z - pt2.z, 2);
   }

   public static Point sphereIntersectionPoint(Ray r, Sphere s) {
      double a = VectorMath.dot_vector(r.dir, r.dir);
      double b = 2 * VectorMath.dot_vector(VectorMath.difference_point(r.pt, s.center),
                                           ray.dir);
      double c = VectorMath.dot_vector(VectorMath.difference_point(r.pt, s.center),
                                       VectorMath.difference_point(r.pt, s.center)) - 
                                       Math.pow(s.radius, 2);

      if (((b * b) - (4 * a * c)) < 0) {
         return null;
      }
      else if (Math.pow(b, 2) - 
   }
}
