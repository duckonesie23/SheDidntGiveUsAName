public class MoonCoding{
    public static void main(String[]args){
        //Units in km
        double moonDistance = 380000;
        double topSpeed = 10;
        double eta = (moonDistance/topSpeed)/60;
        System.out.println("ETA is "+eta);
        double horizontalSpeed = 2;
        double verticalSpeed = 3;
        double totalSpeed = Math.sqrt((horizontalSpeed*horizontalSpeed)+(verticalSpeed*verticalSpeed));
        System.out.println("Total speed "+totalSpeed);
        //Units in m
        double moonRadius = 1731000;
        double area  = 4 * 3.14 *(moonRadius*moonRadius);
        double volume = area*0.001;
        System.out.println("Surface volume "+volume);
        double density = volume * 3000 / 1000;
        System.out.println("Regolith desnity "+density);
        double water = (density/4);
    }
}