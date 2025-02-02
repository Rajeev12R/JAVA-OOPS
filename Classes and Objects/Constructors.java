/*A constructor in Java is a special method that is used to initialize objects. Eyerytime when a object is created in a class, The constructor is called. */

// We can pass values also by setting parametes in the constructor 

public class Constructors {
    int a = 10;

    public Constructors(int b){  // Parameter b 
        a = b;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors(20); // value of parameter b passed = 20

        System.err.println(myObj.a);
    }
}
