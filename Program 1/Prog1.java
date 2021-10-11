package com.company;

import java.util.Scanner;

class Complex {
    // Declaring variables
    int real, imaginary;
    // Empty Constructor
    Complex()
    {
    }
    // Constructor to accept
// real and imaginary part
    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }
    // Defining add() method
// for adding two complex number
    Complex add(Complex C1, Complex C2)
    {
// creating temporary variable
        Complex temp = new Complex();
// adding real part of complex numbers
        temp.real
                = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
// returning the sum
        return temp;
    }
    // Defining subtract() method
// for adding two complex number
    Complex subtract(Complex C1, Complex C2)
    {
// creating temporary variable
        Complex temp = new Complex();
// subtracting real part of complex numbers
        temp.real
                = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
// returning the difference
        return temp;
    }
    void Display(Complex C)
    {
        System.out.println(C.real + " + i(" + C.imaginary + ")");
    }
}

public class Prog1 {

    public static void main(String[] args) {
        // write your code here
        // First Complex number
        int r, c;
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter real and imaginary part of Complex no. 1 :");
        r = inn.nextInt();
        c = inn.nextInt();
        Complex C1 = new Complex(r, c);
        System.out.println("Enter real and imaginary part of Complex no. 2 :");
        r = inn.nextInt();
        c = inn.nextInt();
        Complex C2 = new Complex(r, c);
// printing complex number
        System.out.println("Complex number 1 : "
                + C1.real + " + i("
                + C1.imaginary + ")");

        System.out.println("Complex number 2 : "
                + C2.real + " + i("
                + C2.imaginary + ")");
// for Storing the sum and diff
        Complex C_add = new Complex();
        C_add = C_add.add(C1, C2);
        System.out.print("Sum = ");
        C_add.Display(C_add);
        Complex C_sub = new Complex();
        C_sub = C_sub.subtract(C1, C2);
        System.out.print("Difference = ");
        C_sub.Display(C_sub);
    }
}
