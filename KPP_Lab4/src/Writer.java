
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Writer implements Runnable {

    private Data data;
    private ReentrantReadWriteLock lock;

    public Writer(final Data newData, final ReentrantReadWriteLock newLock) {
        this.data = newData;
        this.lock = newLock;
    }

    @Override
    public void run() {
        try {
            lock.writeLock().lock();
            lock.readLock().lock();
            data.writeString();
            Thread.sleep(2000);
            System.out.println("End write.");
            lock.readLock().unlock();
            lock.writeLock().unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
