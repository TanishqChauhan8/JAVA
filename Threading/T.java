class ABC {
    public synchronized void count() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread1 extends Thread {
    ABC ob;

    Thread1(ABC x) {
        ob = x;
		System.out.println(ob);
		
    }

    public void run() {
        ob.count();
    }
}

class Thread2 extends Thread {
    ABC ob;

    Thread2(ABC x) {
        ob = x;
		System.out.println(ob);
    }

    public void run() {
        ob.count();
    }
}

class Main {
    public static void main(String[] args) {
        ABC ob = new ABC();
        Thread1 t1 = new Thread1(ob);
        Thread2 t2 = new Thread2(ob);
        t1.start();
        t2.start();
    }
}
