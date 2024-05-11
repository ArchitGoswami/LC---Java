# LC-Java
LC solutions in java and notes of learnings

## Notes

1. all functions need to be in a class, even the main function
2. public static void main(String[] args)
    a. public: Access modifier - who can access it.
    b. main(): JVM does not need instantiation to execute (you don't need to call it)
    c. static: also means you don't need an instance in another class to access it, is available if you just do class.funct, kinda like in python.
         **********************************************************************
         **********************************************************************
         public class Foo {
            public static void doStuff(){
                // does stuff
            }
         }
         **********************************************************************
         So, instead of creating an instance of Foo and then calling doStuff like this:
         **********************************************************************
         
         Foo f = new Foo();
         f.doStuff();
         
         **********************************************************************
         You just call the method directly against the class, like so:
         **********************************************************************

         Foo.doStuff();
         
         **********************************************************************
         **********************************************************************
    d. static also can be used in front of variables to prevent their values from changing
    e. Can't call non static methods from a static method.
    f. void means no values are being returned. Whichever value you return, that data type would go in the place of void.
3. constructors
    a. constructor in java is same is init in python. 
    b. You can also call methods from constructors.
    c. constructor has same name as class.
    d. constructors also tell us what arguments need to be provided.
    e. 
4. null is same as None data type in python. Kind of.
5. 