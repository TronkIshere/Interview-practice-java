package basic_Java.Multithreading;

public class MultithreadingExtendsThread extends Thread{
    private int threadNumber;
    public MultithreadingExtendsThread(int threadNumber){
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
