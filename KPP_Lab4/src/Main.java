import javax.swing.*;
import java.awt.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    Data data = new Data();
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public Main() {
        initComponents();
    }

    void initComponents() {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout();
        JButton addWriter = new JButton("Add writer");
        addWriter.addActionListener(e -> {
            createWriter();
        });
        JButton addReader = new JButton("Add reader");
        addReader.addActionListener(e -> {
            createReader();
        });
        flowLayout.setVgap(40);
        jFrame.setLayout(flowLayout);
        jFrame.add(addReader);
        jFrame.add(addWriter);
        jFrame.setSize(300, 150);
        jFrame.setVisible(true);
    }

    void createReader() {
        Thread thread = new Thread(new Reader(data, lock));
        thread.start();
    }

    void createWriter() {
        Thread thread = new Thread(new Writer(data, lock));
        thread.start();
    }

    public static void main(String[] args) {
        new Main();
    }
}
