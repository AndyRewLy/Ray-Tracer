import java.util.*;

public class Color {

   //private variables
   private int r;
   private int g;
   private int b;

   //Default Constructor
   public Color(int r, int g, int b) {
      this.r = r;
      this.g = g;
      this.b = b;
   }

   public void set_r(int val) {
      r = val;
   }

   public void set_g(int val) {
      g = val;
   }

   public void set_b(int val) {
      b = val;
   }

   public int get_r() {
      return r;
   }

   public int get_g() {
      return g;
   }

   public int get_b() {
      return b;
   }

}
