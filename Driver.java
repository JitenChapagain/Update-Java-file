public class Driver
{
    public static void main (String args[])
    {
        MotorBike mb= new MotorBike("Red","Tata",14);
        System.out.println("Color of the motor bike is:"+mb.getcolor());

        System.out.println(" length of the stand is:"+mb.getStands());

    }
}
class Vehicle
{
    String color;
    String model;      
    Vehicle (String c,String m)
    {
        color =c;
        model=m;
    }
    String getcolor()
    {return color;}
}
class MotorBike extends Vehicle
{
    int stands;
    MotorBike(String c,String m, int s)
    {
        super(c,m);
        stands =s;
    }
    int getStands()
    {return stands;}
}

class Car extends Vehicle
{
    int door;

    Car(String c, String m, int d)
    {
        super(c,m);
        door=d;
    }
}




