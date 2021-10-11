package  com.company;

import java.util.Scanner;

class Address{
    int st_num;
    String city, state, country;
    //Address(){}
    Address(int x, String cty, String st, String c){
        this.st_num = x;
        this.city = cty;
        this.state = st;
        this.country = c;
    }
    void Display (Address a){
        System.out.println("Address : #"+a.st_num+", "+a.city+", "+a.state+", "+a.country);
    }
}

class Student{
    String USN, Name;
    Address addr;
    Student(String usn, String name, Address ad){
        this.USN = usn;
        this.Name = name;
        this.addr = ad;
    }
    void Display (Student s){
        System.out.println("Name : "+s.Name);
        System.out.println("USN : "+s.USN);
        s.addr.Display(s.addr);
    }
}

class College{
    String Name;
    Address addr;
    College(String n, Address a){
        this.Name = n;
        this.addr = a;
    }
    void Display (College c){
        System.out.println("Name : "+c.Name);
        c.addr.Display(c.addr);
    }
}

class Employee{
    String Name, EmpID;
    Address addr;
    Employee(String eid, String name, Address a){
        this.Name = name;
        this.addr = a;
        this.EmpID = eid;
    }
    void Display (Employee e){
        System.out.println("Name : "+e.Name);
        System.out.println("Employee ID : "+e.EmpID);
        e.addr.Display(e.addr);
    }
}

public class Prog2 {

    public static void main(String[] args) {
        //Address add[] = new Address[100];
        Student std[] = new Student[100];
        College clg[] = new College[100];
        Employee emp[] = new Employee[100];
        int n1, n2, n3;
        //String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Students : ");
        n1 = sc.nextInt();
        for (int i = 0; i < n1; i++){
            System.out.println("\nEnter the Address Details of Student "+(i+1)+" :-");
            System.out.println("(Give Street No., City, State , Country)");
            Address add = new Address(sc.nextInt(), sc.next(), sc.next(), sc.next());
            System.out.println("\nEnter the Student "+(i+1)+" Details :-");
            System.out.println("(Give USN and Name)");
            std[i] = new Student(sc.next(),sc.next(),add);
        }
        System.out.print("\nEnter no. of Colleges : ");
        n2 = sc.nextInt();
        for (int i = 0; i < n2; i++){
            System.out.println("\nEnter the Address Details of College "+(i+1)+" :-");
            System.out.println("(Give Street No., City, State , Country)");
            Address add = new Address(sc.nextInt(), sc.next(), sc.next(), sc.next());
            System.out.println("\nEnter the College "+(i+1)+" Name :-");
            clg[i] = new College(sc.next(),add);
        }
        System.out.print("\nEnter no. of Employees : ");
        n3 = sc.nextInt();
        for (int i = 0; i < n3; i++){
            System.out.println("\nEnter the Address Details of Employee "+(i+1)+" :-");
            System.out.println("(Give Street No., City, State , Country)");
            Address add = new Address(sc.nextInt(), sc.next(), sc.next(), sc.next());
            System.out.println("\nEnter the Employee "+(i+1)+" Details :-");
            System.out.println("(Give Employee ID. and Name)");
            emp[i] = new Employee(sc.next(),sc.next(),add);
        }
        System.out.println("\n\n\n------------STUDENT DETAILS---------------\n");
        for (int i = 0; i < n1; i++)
        {
            System.out.println("\nDetails of Student "+(i+1)+" :-\n");
            std[i].Display(std[i]);
        }
        System.out.println("\n------------COLLEGE DETAILS---------------\n");
        for (int i = 0; i < n2; i++)
        {
            System.out.println("\nDetails of College "+(i+1)+" :-\n");
            clg[i].Display(clg[i]);
        }
        System.out.println("\n------------EMPLOYEE  DETAILS---------------\n");
        for (int i = 0; i < n3; i++)
        {
            System.out.println("\nDetails of Employee "+(i+1)+" :-\n");
            emp[i].Display(emp[i]);
        }
    }
}