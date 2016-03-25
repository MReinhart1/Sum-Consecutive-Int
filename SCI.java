import java.util.*;
/**
 * Write a description of class SCI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SCI
{
    private static int startInt, many;
    private static int y;
    static Scanner read = new Scanner(System.in);
    
    public static void main (String args []){
        //calling the methods to get the ints the user enters in the paramaters of each one
        System.out.println(calc(getVar1(),getVar2()));  
        
        System.out.println(recursive(getVar1(),getVar2()));        
    }
    
    public static int getVar1(){
        int x;
        System.out.println("Enter the first number");
        x = read.nextInt();
        startInt = x;
        return startInt;
    }

    public static  int getVar2(){
        int y;
        System.out.println("Enter the second number");
        y = read.nextInt();
        many = y;
        return many;
    }

    public static int recursive(int startInt,int many){
        if(many > 0){
            y += startInt;
            startInt++;
            recursive(startInt,many-1);
        }
        return y;
    }

    public static int calc(int startInt,int many){
        int y = 0;
        for(int x = many; x > 0; x--){
            y += startInt;
            startInt++;
        }
        return y;
    }
}
