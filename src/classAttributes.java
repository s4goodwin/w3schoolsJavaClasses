public class classAttributes {
    //https://www.w3schools.com/java/java_class_attributes.asp
    //Create a class called "Main" with two attributes: x and y:
    int x = 5;
    int y = 3;
    int z;
    //declare the attribute as final if you don't want the ability to override existing values
    final int f = 10;
    //Another term for class attributes is fields.

    public static void main(String[] args) {
        //You can access attributes by creating an object of the class, and by using the dot syntax (.):

        //The following example will create an object of the classAttributes class, with the name myObj.
        //We use the x attribute on the object to print its value:

        //Create an object called "myObj" and print the value of x and y:
        classAttributes myObj = new classAttributes();
        System.out.println(myObj.x);
        System.out.println(myObj.y);

        //modify attribute values:
        //Set value of z to 40
        myObj.z = 40;
        System.out.println(myObj.z);

        //override existing values:
        //change value of x to 25
        myObj.x = 25;
        System.out.println(myObj.x);

        //If you create multiple objects of one class, you can change the attribute values in one object
        //without affecting the attribute values in the other:

        //Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:
        classAttributes myObj1 = new classAttributes();
        classAttributes myObj2 = new classAttributes();
        myObj2.x = 25;
        System.out.println("original object: "+ myObj1.x + " changed value of object: "+ myObj2.x);

    }
}
