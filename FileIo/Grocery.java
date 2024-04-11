package FileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Grocery {
    public void readWrite() {

        Scanner scanner = new Scanner(System.in);

        try {
            FileInputStream fileInput = new FileInputStream("H:\\My Drive\\JAVA\\FileIo\\Grocrey.txt");

            // Convert to String
            String bytostr = new String(fileInput.readAllBytes());

            // Get Input From User
            System.out.println("Grocery List\n Add Items:\n");
            String newText = scanner.nextLine();
            scanner.close();

            // Combine Old and New String
            bytostr = bytostr + "\n" + newText;

            // WRITE
            FileOutputStream fileOutput = new FileOutputStream("H:\\My Drive\\JAVA\\FileIo\\Grocrey.txt");

            fileOutput.write(bytostr.getBytes());

            fileInput.close();
            fileOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
