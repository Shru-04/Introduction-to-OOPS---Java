package com.company;

import java.util.Scanner;
import static java.lang.System.*;

interface PerformOperation {
    boolean check(int n);
}

public class Prog8{
    static public void main(String args[]){
        int x,op;
        PerformOperation p;
        Scanner sc = new Scanner(System.in);
        do {
            out.println("Enter the number : ");
            x = sc.nextInt();
            out.println("\nEnter your Choice :-\n1. Check for Even/Odd\n2. Check for Prime/Composite\n3. Check for Palindrome\n4. EXIT");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    p = (n) -> {
                        if (n % 2 != 0) return true;
                        return false;
                    };
                    if (p.check(x))
                        out.println(x + " is ODD number !!");
                    else
                        out.println(x + " is EVEN number !!");
                    break;
                case 2 :
                    p = (n) -> {
                        int k = 0;
                        for (int i = 2; i * i <= n; i++)
                            if (n % i == 0) {
                                k = 1;
                                break;
                            }
                        if (k==0)   return false;
                        return true;
                    };
                    if (p.check(x))
                        out.println(x +" is COMPOSITE number !!");
                    else
                        out.println(x +" is PRIME number !!");
                    break;
                case 3 :
                    p = (n) -> {
                        int z = n, comp = 0, a = 1;
                        while (z != 0)
                        {
                            comp += ((z%10)*a);
                            a = a*10;
                            z = z / 10;
                        }
                        if (comp == n)  return true;
                        return false;
                    };
                    if (p.check(x))
                        out.println(x +" is a Palindrome !!");
                    else
                        out.println(x +" is not a Palindrome !!");
                    break;
                case 4 : System.exit(0);
                    break;
            }
            out.println("\n");
        }
        while(true);
    }
}