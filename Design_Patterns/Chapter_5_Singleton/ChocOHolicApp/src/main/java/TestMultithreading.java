import java.lang.Thread;

public class TestMultithreading {
    public static void main(String[] args) {
    {
        int n = 10; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                    = new MultithreadingDemo();
            object.start();
        }
    }
    }
}

class MultithreadingDemo extends Thread {
    @Override
    public void run() {
        try {
            // Displaying the thread that is running
            ChocolateBoiler cb = ChocolateBoiler.getInstance();
            System.out.println(
                    "Thread " + Thread.currentThread().getId() + ": " + cb);
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
