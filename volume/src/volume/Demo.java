package volume;

import java.util.*;
interface Demo1 {	
          double Volume(double r, double h);
}
class Cone implements Demo1{	
         public double Volume(double r, double h) {		
                   return (Math.PI*r*r*h*(double)1/3);
           }
}
class Cylinder implements Demo1{	
         public double Volume(double r,double h) {		
                  return (Math.PI*r*r*h);	
         }
}
class Hemisphere implements Demo1{	
           public double Volume(double r,double h) {		
                     return (Math.PI*r*r*r*(double )2/3);	
          }
}
class Demo{
        public static void main(String[] agrs) {
                   Scanner s= new Scanner(System.in);
                   System.out.println("Enter the radius and height of shapes");
                   double r= s.nextDouble();
                   double h= s.nextDouble();	
                  Cone c= new Cone();		
                  System.out.println("Volume of cone is:"+ c.Volume(r, h));		
                  Cylinder cy=new Cylinder();		
                  System.out.println("Volume of cylinder is:"+cy.Volume(r, h));	
                  Hemisphere hem= new Hemisphere();		
                System.out.println("Volume of hemisphere is:"+hem.Volume(r, h));
         }
}

