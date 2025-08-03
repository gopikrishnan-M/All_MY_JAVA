package FileHandling;

import java.io.*;
/*
//there are two kinds of stream byte stream and character stream
BYTE STREAM:
            the constructor containing stream mostly are said to be byte stream readers and stream writers
CHARACTER STREAM:
            they do not contain stream they only contail reader or writer

character readers read character by character
by reading it returns an integer but not character that is why we have written int letter below

*/

public class FileHandling {
    public static void main(String[] args) {
        completeFile();

    }
    public static void completeFile(){
        //creating a file
        String path="C:/Java_Code/Concepts/FileHandling/new_file.txt";
        try {
            File fileObject=new File(path);
            fileObject.createNewFile();
            if (fileObject.delete()) {
                System.out.println("file is deleted");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        //writing a file
        //coding in below way wont close file writer automatically and it will hold some resources
        try{
            FileWriter fw=new FileWriter(path);
            fw.write("done doing that completely");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        /*
        //this one will automatically close buffer writer coz this is a special syntax in
        //try block where we write try( .........object creation .....)
            try (FileWriter fw = new FileWriter(path)) {
            fw.write("done doing that completely");
            // no need to call fw.close() here
            } catch (IOException e) {
            System.out.println(e.getMessage());
            }

         */

        //reading a file
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void fread(){
        String path = "C:/Java_Code/Concepts/FileHandling/kris.txt";
        System.out.println("Path: " + path);
        File file = new File(path);
        System.out.println("Exists? " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());

        try(FileReader fr=new FileReader("C:/Java_Code/Concepts/FileHandling/kris.txt")){
            int letter;
            while ((letter = fr.read()) != -1) {
                System.out.println((char)letter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void streamRead(){
        //system.in is a byte stream convert it into character stream by inputStreamreader
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);//this also takes input but we cannot write system .in
        //so we convert it in to "Reader in" by stream reader
        try {
            System.out.println("typed :"+ br.readLine() );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void StreamWrite(){
        try{
           OutputStreamWriter osw=new OutputStreamWriter(System.out);
           osw.write("hello world");
           osw.write(234);
           char[] carray="hello boys".toCharArray();
           osw.write(carray);

        }catch (IOException e){
            throw new RuntimeException();
        }
    }

    public static void fWriter(){
        String path = "C:/Java_Code/Concepts/FileHandling/note.txt";
            // the syntax is new FileWriter(path,boolean); tis boolean says weather we need to append this string to existing file or not
        try (FileWriter fw = new FileWriter("C:/Java_Code/Concepts/FileHandling/kris.txt",true)) {  // By default, overwrites the file
            fw.write("file overridden\n");
            fw.write("Writing to the file  was successfully!\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void bufferWriter(){
        String path = "C:/Java_Code/Concepts/FileHandling/note.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("file overridden\n");
            System.out.println("file overridden successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
