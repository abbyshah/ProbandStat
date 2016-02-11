
/**
 * Write a description of class scuba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class scuba
{
   public static void main(String[] args) throws IOException
   {
        File solutionFile = new File("scubaoutput.txt");
        FileOutputStream stream = new FileOutputStream(solutionFile);
        PrintStream writeOut = new PrintStream(stream);
        System.setOut(writeOut);

        double NG; 
        double power;
        for(int i = 1; i<=100; i++){ //i is number of divers
            power = Math.pow(.08,i);
            NG = 60000 - (60000*power) - (600*i); 
            System.out.println(i + "divers: " + NG);
          } 
      }
   }


