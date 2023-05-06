package echoserver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filecreator {

    public void createFile(String fileName, boolean isUser){
        try {
            File myFile;

            if (isUser){
                String fileNameUser = "src\\users\\" + fileName;
                myFile = new File(fileNameUser + ".txt");
            }else {
                myFile = new File(fileName + ".txt");
            }

            if (myFile.createNewFile()) {
                System.out.println("Create new file: " + myFile.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("Error");
        }


    } 

    public void initializedUserFile(int index){
        try{
            int saldo = 1000;
            String name = "Piotr";
            String surname = "Nowak";
            String pesel = "11223244555";
            int numerkonta = 4321;
            FileWriter myWriter = new FileWriter("src\\users\\" + index + ".txt");
            myWriter.write("saldo = " + saldo + "\n");
            myWriter.write("imie = " + name + "\n");
            myWriter.write("nazwisko = " + surname + "\n");
            myWriter.write("pesel = " + pesel + "\n");
            myWriter.write("numerkonta = " + numerkonta + "\n");
            myWriter.write("index = " + index + "\n");
            myWriter.close();

        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
