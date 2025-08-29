import java.io.FileWriter;
import java.io.IOException;


public class Main{
    public static void main(String[]args){

    
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("\nRoses are red🎈   \n violets are blue❣💞 \n And you are blooming😉 \n everywhere in my dream😘");
            writer.append("\n(A poem by Luiz)");
            writer.close();

        }
        catch(IOException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}