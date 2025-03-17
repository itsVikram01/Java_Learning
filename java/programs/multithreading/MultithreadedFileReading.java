package programs.multithreading;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MultithreadedFileReading extends Thread {
    InputStream in;

    MultithreadedFileReading(String fName) throws Exception {
        in = new FileInputStream(fName);
        this.start();
    }

    public void run() {
        int i = 0;
        while (i != -1) {
            try {
                i = in.read();
                System.out.print((char) i);
            } catch (Exception ignored) {
            }
        }
        try {
            in.close();
        } catch (Exception ignored) {
        }
    }

    public static void main(String[] a) throws Exception {
        int n = 2;
        System.out.print("Enter the number of files : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(br.readLine());
        } catch (Exception ignored) {
        }
        MultithreadedFileReading fr[] = new MultithreadedFileReading[n];
        long tim;
        tim = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            fr[i] = new MultithreadedFileReading(a[i]);
        for (int i = 0; i < n; i++) {
            try {
                fr[i].join();
            } catch (Exception ignored) {
            }
        }
        System.out.println("Time Required : " + (System.currentTimeMillis() - tim) + " milliseconds.");
    }
}