/* Basic Java Program 

public class First {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


 What is Classes - It is bascally a blueprint for creating objects


 Syntax : 
 public class First{
    
}

Object : An object is created from a class. We have already created the class named First, so now we can use this to create objects
*/

public class First{
    int a = 10;
    public static void main(String args[]){
        First firstObj = new First();  // firstObj is the Object of the class First. In JAVA Everything is done using classes.
        System.out.println(firstObj.a);

    }
}