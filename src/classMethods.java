public class classMethods {
    //https://www.w3schools.com/java/java_class_methods.asp
    //static method, which means that it can be accessed without creating an object of the class,
    //unlike public, which can only be accessed by objects:
    public static void main(String[] args) {
        //example to demonstrate the differences between static and public methods:
        //static
        myStaticMethod();
        //public
        classMethods pubObj = new classMethods();
        pubObj.myPublicMethod();

        //Create a Car object named myCar. Call the fullThrottle() and speed() methods
        //on the myCar object, and run the program:
        classMethods myCar = new classMethods();
        myCar.fullThrottle();
        myCar.speed(25);
        //The dot (.) is used to access the object's attributes and methods.
        //
        //To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
        //
        //A class must have a matching filename (Main and Main.java).

    }
    static void myStaticMethod(){
        System.out.println("static methods can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("public methods must be called with creating objects");
    }
    public void fullThrottle(){
        System.out.println("full speed");
    }
    public void speed(int speed){
        System.out.println("the current speed is: "+ speed);
    }

}
