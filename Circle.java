
package za.ac.wsu.s220652864;
//Yonela Khupa
public class Circle {
        // attributes
        private double radius;
        private int x;
        private int y;

        //returning area of a circle
        public double calculateArea() {
                return Math.PI * radius * radius;
        }

       //returning circumference of a circle
        public double calculateCircumference() {
                return 2 * Math.PI * radius;
        }

        //returning diameter of a cicrcle
        public double calculateDiameter() {
                return 2 * radius;
        }
        
        //set and take radius
        public void setRadius(double radius) {
                // check if radius cannot be less than zero
                if (radius < 0) {
                        this.radius = 0;
                } else {
                        this.radius = radius;
                }
        }
        
        //set and take coordinate x
        public void setX(int x) {
                this.x = x;
        }
        
        //set and take coordinate y
        public void setY(int y) {
                this.y = y;
        }
        
        //get and return radius
        public double getRadius() {
                return radius;
        }

        //get x and return x
        public int getX() {
                return x;
        }
        //get y and returning y
        public int getY() {
                return y;
        }
}
