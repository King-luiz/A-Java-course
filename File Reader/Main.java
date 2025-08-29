import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[]args){


        //FileReader = read the content on the file as a stram of character.one by one


        try{
            FileReader reader =new FileReader("luiz_poem.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch(IOException e){
            //TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}