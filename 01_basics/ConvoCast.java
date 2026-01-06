public class ConvoCast {
    public static void main(String[] args) {
        
       // int a = 25;
      //  long b = a;
        //System.out.println(b);

       // long a = 25;
      // int b = a;
       // System.out.println(b);

//  **** byte>short>int>float>long>double ****

// ***** Type casting ******

// float a =25.33f;
// int b = (int) a;
// System.out.println(b);

// **Type Promotion in Expressions**
//java automatically promotes each byte,short,or char operand to int when evaluating the expressio

// if one operand is long,float or double the whole expression is promoted to long,float,or double respectively.


char a = 'a';
char b ='b';
System.out.println((int)b);
System.out.println((int)a);
System.out.println(b-a);


    }
}
