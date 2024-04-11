package FileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

    public void readOps(){

        try{

            // FileInputStream fin = new FileInputStream("./rand.txt");
            FileInputStream fin = new FileInputStream("H:\\My Drive\\JAVA\\FileIo\\rand.txt");
            
            
            byte [] b = fin.readAllBytes();

            for(byte bt : b){
                // System.out.print(bt + " ");
                System.out.print((char) bt);
            }

            // System.out.println("B : " + b[0]);
            
            fin.close(); 
        
        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }

    public void writeOps() throws IOException{

        FileOutputStream fout = new FileOutputStream("H:\\My Drive\\JAVA\\FileIo\\rand.txt",true);


        String para = "\n New String He He ...";

        byte [] b =  para.getBytes();

        fout.write(b);

        fout.close();


    }

}
