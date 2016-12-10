package Neighborhood;

/**
 * Created by salma on 12/9/2016.
 */
public class TestCase_Neighborhood {

    public static void main(String[] args) {
        Apartments apt = new Apartments();


        apt.setStName("Dream Street");
        apt.setMyStreetNumber(43);

        System.out.println("My Street name is: " + apt.getStName() + "\n" + "My Street Number is: " + apt.getMyStNumber());

        apt.buildings();


        PrivateHomes ph = new PrivateHomes();
        ph.multiFamilyHOMES(100);
        ph.privateHomes(75);
        System.out.println("The Uploaded file is the following :" + "\n");
        ph.readData();






    }


}
