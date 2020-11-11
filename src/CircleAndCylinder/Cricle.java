package CircleAndCylinder;

public class Cricle {
    public double Radius;
    public String Coler;
    public Cricle (){

    }public Cricle(double radius, String coler) {
        this.Radius = radius;
        this.Coler = coler;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public String getColer() {
        return Coler;
    }

    public void setColer(String coler) {
        Coler = coler;
    }
    public double getArea(){
        return Radius*Radius*Math.PI;
    }
    public String toString(){
        return " Radius of circle : "+getRadius() +
                "\n and Coler is "+ getColer()+
                "\n and Area = "+getArea();
    }
}
