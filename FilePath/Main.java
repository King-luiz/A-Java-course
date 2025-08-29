import java.io.File;
public class Main{
    public static void main(String[]args){

        //file = an abstraction represantation of file and directory pathnames

        File file = new File("c:\\Users\\Digi\\Documents\\king_luiz.mesage.txt");



        if(file.exists()){
            System.out.println("that file exist");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();

        }
        else{
            System.out.println("that file doesn`t exist");
        }


    } 
}