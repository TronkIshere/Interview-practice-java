package basic_Java.Multithreading;

public class MultithreadingImplementsRunnable implements Runnable{
    private int threadNumber;
    public MultithreadingImplementsRunnable(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " From Thread number: " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
