import java.util.*;

public class Finish {

   //private variables
   private double ambient;
   private double diffuse;
   private double specular;
   private double roughness;

   //Default Constructor
   public Finish(double ambient, double diffuse, double specular, double roughness) {
      this.ambient = ambient;
      this.diffuse = diffuse;
      this.specular = specular;
      this.roughness = roughness;
   }

   public void set_ambient(double val) {
      ambient = val;
   }

   public void set_diffuse(double val) {
      diffuse = val;
   }

   public void set_specular(double val) {
      specular = val;
   }

   public void set_roughness(double val) {
      roughness = val;
   }

   public double get_ambient() {
      return ambient;
   }

   public double get_diffuse() {
      return diffuse;
   }

   public double get_specular() {
      return specular;
   }

   public double get_roughness() {
      return roughness;
   }

}
