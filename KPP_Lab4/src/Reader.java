import java.io.FileNotFoundException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Reader implements Runnable {
    Data data;
    ReentrantReadWriteLock lock;

    private static int count = 0;

    public Reader(Data data, ReentrantReadWriteLock rwl) {
        this.data = data;
        this.lock = rwl;
    }

    @Override
    public void run() {

        if (count < 3) {
            count ++;
            try {
                lock.readLock().lock();
                System.out.println("Read strings: \n");
                System.out.print(data.getStrings());
                Thread.sleep(2000);
                System.out.println("\nEnd read.");
                lock.readLock().unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            count--;
        }
    }
}
