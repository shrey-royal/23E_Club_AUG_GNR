public class TypeCasting {
    public static void main(String[] args) {
        // int a = 0;
        // float f = 2.35f;

        // System.out.println("a = " + a + "\tf = " + f);
        // f = a;  // Implicit type casting
        // a = (int)f; // Explicit Type Casting
        // System.out.println("a = " + a + "\tf = " + f);

        // converting string to any specific data type
        String s = "34";
        float f = 0;
        
        System.out.println(f);
        f = Float.parseFloat(s);
        System.out.println(f);

        System.out.println(Integer.parseInt(s));

        double d = 34534.4;
        System.out.println(d);

        // converting any datatype to string
        String s1 = String.valueOf(d);
        System.out.println(s1);

        System.out.println(((Double)d).getClass().getName());
        System.out.println(s1.getClass().getName());
    }
}

/*
Data-types:

int     - Integer
float   - Float
double  - Double
char    - Character
str     - String

Wrapper Classes

int a;  // variable (primitive datatype)
Integer a;  // int object (declared using the wrapper class)

use of wrapper classes:
Any Data type to string
string to Any data type

*/