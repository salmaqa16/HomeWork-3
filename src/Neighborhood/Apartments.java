package Neighborhood;

import java.util.Scanner;

/**
 * Created by salma on 12/9/2016.
 */
public class Apartments {

    protected final int numOfApts = 20;
    public int myAptNo = 23;
    private String StreetName;
    private int mYStreetNumber;


    public String getStName() {
        return StreetName;
    }

    public void setStName(String StreetNam) {
        this.StreetName = StreetNam;

    }

    public int getMyStNumber() {
        return mYStreetNumber;
    }

    public void setMyStreetNumber(int StNumber) {
        this.mYStreetNumber = StNumber;
    }


    public void myapartment() {

        if (numOfApts > myAptNo)
            System.out.println("Total number of Apartment buildings are: " + numOfApts);
        else
            System.out.println("My Apartment number is: " + myAptNo);
    }


    public void buildings() {

        int buildings[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the house numbers: ..." + "\n");
        for (int i = 0; i < buildings.length; i++)
            buildings[i] = sc.nextInt();

        System.out.println("Lets Retrieve the house numbers");
        for (int i = 0; i < buildings.length; i++)
            System.out.println(buildings[i]);


        try {
            if (sc != null)
                sc = null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sc != null)
                sc = null;
        }


    }
}