package com.company;
class Market {
    int n1 = 0, n2 = 0;
    int apple = 0, orange = 0, grape = 0, watermelon = 0;
    boolean valueSet = false;
    synchronized void get(int op) {
//        while(!valueSet)
//            try {
//                wait();
//            } catch(InterruptedException e) {
//                System.out.println("InterruptedException caught");
//            }
//       System.out.println("Got: " + n);
        switch (op){
            case 1 : while(!valueSet && this.apple <= 0)
                     try {
                        wait();
                     } catch(InterruptedException e) {
                        System.out.println("InterruptedException caught");
                     }
                     this.apple--;  System.out.println("Apple brought by Consumer " + n1++); break;
            case 2 : while(!valueSet && this.orange <= 0)
                    try {
                        wait();
                    } catch(InterruptedException e) {
                        System.out.println("InterruptedException caught");
                    }
                    this.orange --; System.out.println("Orange brought by Consumer " + n1++); break;
            case 3 : while(!valueSet && this.grape <= 0)
                     try {
                        wait();
                     } catch(InterruptedException e) {
                        System.out.println("InterruptedException caught");
                     }
                     this.grape --; System.out.println("Grape brought by Consumer " + n1++); break;
            case 4 : while(!valueSet && this.watermelon <= 0)
                     try {
                        wait();
                     } catch(InterruptedException e) {
                        System.out.println("InterruptedException caught");
                     }
                     this.watermelon --; System.out.println("Watermelon brought by Consumer " + n1++); break;
        }
        valueSet = false;
        notifyAll();
        //return ;
    }
    synchronized void put(int k, int n, int op) {
//        while(valueSet)
//            try {
//                wait();
//            } catch(InterruptedException e) {
//                System.out.println("InterruptedException caught");
//            }
        switch (op){
            case 1 : while(valueSet && (this.apple + n) > 10)
                     try {
                         wait();
                     } catch(InterruptedException e) {
                         System.out.println("InterruptedException caught");
                     }
                     this.apple += n;  System.out.println("Farmer " + k + " sells " + n + " apples"); break;
            case 2 : while(valueSet && (this.orange+n) > 10)
                     try {
                        wait();
                     } catch(InterruptedException e) {
                        System.out.println("InterruptedException caught");
                     }
                     this.orange += n; System.out.println("Farmer " + k + " sells " + n + " oranges"); break;
            case 3 : while(valueSet && (this.grape+n) > 10)
                     try {
                        wait();
                     } catch(InterruptedException e) {
                        System.out.println("InterruptedException caught");
                     }
                     this.grape += n; System.out.println("Farmer " + k + " sells " + n + " grapes"); break;
            case 4 : while(valueSet && (this.watermelon+n) > 10)
                     try {
                        wait();
                     } catch(InterruptedException e) {
                        System.out.println("InterruptedException caught");
                     }
                     this.watermelon += n; System.out.println("Farmer " + k + " sells " + n + " watermelons"); break;
        }
        this.n2 = k;
        valueSet = true;
//        System.out.println("Put: " + n);
        notifyAll();
    }
}

class Producer implements Runnable {
    Market q;
    Producer(Market q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        try {
            int i = 0;
            while (true) {
                q.put(i++, 1, 1);
                Thread.sleep(1000);
                q.put(i++, 1, 2);
                q.put(i++, 1, 3);
                q.put(i++, 1, 4);
            }
        }catch (InterruptedException e){System.out.println(e);}
    }
}
class Consumer implements Runnable {
    Market q;
    Consumer(Market q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        try {
            while (true) {
                q.get(1);
                Thread.sleep(1000);
                q.get(2);
                Thread.sleep(1000);
                q.get(3);
                Thread.sleep(1000);
                q.get(4);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
class Prog7 {
    public static void main(String args[]) {
        Market q = new Market();
        new Producer(q);
        new Consumer(q);
        //System.out.println("Press Control-C to stop.");
    }
}