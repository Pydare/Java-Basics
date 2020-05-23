import java.io.*;
public class FIlesPractice {
    public static void main(String[] args){
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("test.txt");
            out  = new FileOutputStream("output.txt");

            int c;
            while  ( (c = in.read()) != -1){
                out.write(c);
            }
        }finally{
            if (in != null){in.close();}
            if (out != null){ out.close();}
        }
    }
}