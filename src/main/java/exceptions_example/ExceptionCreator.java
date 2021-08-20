package exceptions_example;

import lombok.SneakyThrows;

import java.io.*;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ExceptionCreator implements Comparable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                while (true) {
                    System.out.println("another thread still working...");
                    Thread.sleep(5000);
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        new ExceptionCreator().a();
        System.out.println("finished succefully");
    }


    public void a() {
        System.out.println("a is working");
        try {
            b();
        } catch (RuntimeException exception) {
            System.out.println("А на всё равно");
        }
        System.out.println("А продолжает");
    }

    private void b() {
        System.out.println("b is working");
        c();
        System.out.println("Б продолжает");
    }

    private void c() {
        System.out.println("c is working");
        throw new RuntimeException("problem...");
    }

    public String readLine(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }


    @SneakyThrows(FileNotFoundException.class)
    @Override
    public int compareTo(Object o) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




        FileOutputStream fos = new FileOutputStream(new File(""));
        return 0;
    }
    /*@Override
    public int compareTo(Object o) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        try {
            FileOutputStream fos = new FileOutputStream(new File(""));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }

        return 0;
    }*/
}

