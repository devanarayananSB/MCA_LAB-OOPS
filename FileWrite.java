import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            System.out.println("\nEnter File Name: ");
            String fname = s.nextLine();

            FileWriter obw = new FileWriter(fname, true);

            System.out.println("\nEnter number of entries in file: ");
            int n = s.nextInt();
            s.nextLine(); // consume leftover newline

            System.out.println("\nEnter " + n + " entries into file:");

            String data;
            for (int i = 0; i < n; i++) {
                data = s.nextLine();
                obw.write(data + "\n");
            }

            obw.close();

            FileReader onR = new FileReader(fname);
            BufferedReader br = new BufferedReader(onR);

            String line;
            System.out.println("\nData read from " + fname + " file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            s.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}