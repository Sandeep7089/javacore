
/*
program: to understand the input using scanner
@author: Sandeep rajput
@Date: 14 oct 2022
*/

// importing unit package for Scanner Class

import java.util.Scanner;

// declaring a class 
class ScannerDemo
{
// main method
public static void main(string args[])
{
// creating object of Scanner Class
Scanner sc=new Scanner(System.in);

// declaring and initiling local variables
System.out.println("Enter your name:");
String name=new sc.next(); // to take string input 

/////////////////////////////////////////////////////////////////

System.out.println ("Enter your age:");
int age=new sc.nextInt(); // to take integer input

/////////////////////////////////////////////////////////////////

System.out.println("Enter your marks:");
float marks=new sc.nextFloat(); // to take float input 

/////////////////////////////////////////////////////////////////

System.out.println("Enter your pass/fail:");
boolean pass=new sc.nextInt(); // to take boolean input

/////////////////////////////////////////////////////////////////

System.out.println("Enter your gender(M/F):");
char gender=new sc.next().charat(0); // to take integer input

// printing the values of all the variable
System.out.println("------------------------------------------------------":);
System.out.println("Your details are:");
System.out.println("Name: "+name);
System.out.println("Gender: "+gender);
System.out.println("Age: "+age);
System.out.println("Marks: "+marks);
System.out.println("Pass: "+pass);
 
 
}
// end of main
}
// end of class DataTypeDemo2

