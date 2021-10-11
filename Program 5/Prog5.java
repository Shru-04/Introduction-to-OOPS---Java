package  com.company;
import static java.lang.System.*;

interface Animal{
    void eat();
    void sound();
}

interface TiredAnimal extends Animal{
    void sleep();
    default void tired(){out.println("Animal is sleeping");}
}

class Lion implements TiredAnimal{
    public void eat(){
        out.println("Lion is eating !!");
    }
    public void sound(){
        out.println("Lion ROARS !!!");
    }
    public void sleep(){
        out.println("Lion is Sleeping!!! zzzzz");
    }
    public void tired(){
        out.println("Lion is tired!! Oof");
    }
}
class Snake implements TiredAnimal{
    public void eat(){
        out.println("Snake is eating !!");
    }
    public void sound(){
        out.println("Snake RATTLES !!!");
    }
    public void sleep(){
        out.println("Snake is Sleeping!!! zzzzz");
    }
    /*public void tired(){
        out.println("Snake is tired!! Oof");
    }*/
}

public class Prog5 {
    public static void main(String[] args){
        Lion l = new Lion();
        Snake s = new Snake();
        l.eat();
        l.sound();
        l.sleep();
        l.tired();
        s.eat();
        s.sound();
        s.sleep();
        s.tired();
    }
}