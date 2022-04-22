
package za.ac.wsu.driver.s220652864;

import za.ac.wsu.s220652864.Circle;

//Yonela Khupa
public class CircleMain {
public static void main(String[] args) {
                // create 3 Circle objects
                Circle objectc1 = new Circle();
                Circle objectc2 = new Circle();
                Circle objectc3 = new Circle();
                
                // set values 
                objectc1.setRadius(11);
                objectc1.setX(4);
                objectc1.setY(7);
                
                objectc2.setRadius(3);
                objectc2.setX(6);
                objectc2.setY(9);
                
                objectc3.setRadius(9);
                objectc3.setX(12);
                objectc3.setY(15);
                
                // displays the information of these circles
                System.out.println("\nCircle objectc1 Information");
                displayInformation(objectc1);
                System.out.println("\nCircle objectc2 Information");
                displayInformation(objectc2);
                System.out.println("\nCircle object3 Information");
                displayInformation(objectc3);
        }
        
        //displaying 
        public static void displayInformation(Circle c) {
                System.out.println("Radius: "+c.getRadius() +", Center: (" +c.getX() + ", " + c.getY() +")");
                System.out.printf("Area: %.2f",c.calculateArea());
                System.out.printf("\nCircumference: %.2f",c.calculateCircumference());
                System.out.printf("\nDiameter: %.2f",c.calculateDiameter());
                System.out.println();
        }    
}
