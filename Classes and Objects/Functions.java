public class Functions {

    // myFunc is a method/function 
    static void myFunc(){
        System.out.println("Hello I am a Function Called");
    }

    public void myPublicFunc(){
        System.out.println("Hello I am a Public Function");
    }

    public static void main(String[] args) {
        myFunc(); // Here function is called. 

        /* Output : Hello I am a Function Called

        For public function creating a object named myObj
        */
        Functions myObj = new Functions();

        myObj.myPublicFunc();   // This is how public function is called
    }
}

/* 
Types of Methods (Static VS Public)

We created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects

*/