package Neighborhood;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by salma on 12/9/2016.
 */
public class PrivateHomes extends Apartments {

    public static int numberOfPrivateHomes  ;
    public int  numberOfMultiFamilyHomes;

    public void multiFamilyHOMES(int numberOfMultiFamilyHomes){
        System.out.println("Number of Multi Family Homes in my neighborhood are: " + numberOfMultiFamilyHomes);
    }


    public void privateHomes(int numberOfPrivateHomes){

        System.out.println("Number of Private Homes in my neighborhood are: "+ numberOfPrivateHomes);

        if(numberOfPrivateHomes>numOfApts)
            System.out.println("Private Homes are more than Apartments in my neighborhood");
        else if(numberOfPrivateHomes<numberOfMultiFamilyHomes)
            System.out.println("Private Homes are less than Multi Family Homes");
        else
            System.out.println("Apartment Buildings are more in this neighborhood");

    }


    public  void readData(){

        FileReader fr = null;
        BufferedReader br = null;
        String path1 = "C:/Users/salma/Desktop/HW#3.txt";


        try {
            fr = new FileReader(path1);
        }catch(FileNotFoundException e){
            e.printStackTrace();

        }

        try{
            br = new BufferedReader(fr);
            String text = "";
            while((text = br.readLine())!=null){
                System.out.println(text);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(br != null){
                    br = null;
                }if(fr != null){
                    fr = null;
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }

    }

}
