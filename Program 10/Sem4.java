import java.util.*;
class Sem1{
int oops,maths,english,ece;
double avg;
Sem1(){
Scanner in=new Scanner(System.in);
System.out.println("Enter the marks of oops subject :");
this.oops = in.nextInt();
System.out.println("Enter the marks of maths subject :");
this.maths = in.nextInt();
System.out.println("Enter the marks of english subject :");
this.english = in.nextInt();
System.out.println("Enter the marks of ece subject :");
this.ece = in.nextInt();
avg=(oops+maths+english+ece)/(double)4;
}
}
class Sem2 extends Sem1{
int oops1,maths1,english1,ece1;
double avg1;
Sem2(){
Scanner in=new Scanner(System.in);
System.out.println("Enter the marks of oops1 subject :");
this.oops1 = in.nextInt();
System.out.println("Enter the marks of maths1 subject :");
this.maths1 = in.nextInt();
System.out.println("Enter the marks of english1 subject :");
this.english1 = in.nextInt();
System.out.println("Enter the marks of ece1 subject :");
this.ece1 = in.nextInt();
avg1=(oops1+maths1+english1+ece1)/(double)4;
}
}
class Sem3 extends Sem2{
int oops2,maths2,english2,ece2;
double avg2;
Sem3(){
Scanner in=new Scanner(System.in);
System.out.println("Enter the marks of oops2 subject :");
this.oops2 = in.nextInt();
System.out.println("Enter the marks of maths2 subject :");
this.maths2 = in.nextInt();
System.out.println("Enter the marks of english2 subject :");
this.english2 = in.nextInt();
System.out.println("Enter the marks of ece2 subject :");
this.ece2 = in.nextInt();
avg2=(oops2+maths2+english2+ece2)/(double)4;
}
}
class Sem4 extends Sem3{
int oops3,maths3,english3,ece3;
double avg3,totalavg;
public Sem4(){
Scanner in=new Scanner(System.in);
System.out.println("Enter the marks of oops3 subject :");
this.oops3 = in.nextInt();
System.out.println("Enter the marks of maths3 subject :");
this.maths3 = in.nextInt();
System.out.println("Enter the marks of english3 subject :");
this.english3 = in.nextInt();
System.out.println("Enter the marks of ece3 subject :");
this.ece3 = in.nextInt();
avg3=(oops3+maths3+english3+ece3)/(double)4;
totalavg=(avg+avg1+avg2+avg3)/(double)4;
}
public static void main(String[] args) {
Sem4 d = new Sem4();
System.out.println("Average of Sem1 : "+d.avg);
System.out.println("Average of Sem2 : "+d.avg1);
System.out.println("Average of Sem3 : "+d.avg2);
System.out.println("Average of Sem4 : "+d.avg3);
System.out.println("Total Average all Semesters : "+d.totalavg);
}
}