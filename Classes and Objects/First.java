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

    int x = 40;
    int y = 38;
    public static void main(String args[]){
        First firstObj = new First();  // firstObj is the Object of the class First. In JAVA Everything is done using classes.
        System.out.println(firstObj.a);
        
        // Lets try Multiple Objects -> 
        
        First secondObj = new First();
        First thirdObj = new First();

        System.out.println(secondObj.x );  // 40
        System.out.println(thirdObj.y );    // 38

        System.out.println(secondObj.y + thirdObj.y ); // 76
        System.out.println(secondObj.x - thirdObj.y ); // 2




    }
}

