public class constructors {
    //https://www.w3schools.com/java/java_constructors.asp
    //constructor in Java is a special method that is used to initialize objects. The constructor is called when
    //an object of a class is created. It can be used to set initial values for object attributes:

    int x;
    int modelYear;
    String modelName;

    public constructors(int y){
        x = y;
    }
    public constructors(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        //Constructors can also take parameters, which is used to initialize attributes.
        //
        //The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y).
        //When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:
        constructors myObj = new constructors(5);
        System.out.println(myObj.x);

        //multiple parameters
        constructors myCar = new constructors(1999, "Jeep");
        System.out.println("Year: "+ myCar.modelYear +" and make: "+ myCar.modelName);
    }
}
