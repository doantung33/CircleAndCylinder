package CircleAndCylinder;

import java.awt.geom.Area;

public class Cylider extends Cricle {
    public double h;
    public Cylider(){

    }public Cylider(double h){
        this.h=h;
    }

    public Cylider(double radius, String coler, double h) {
        super(radius, coler);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double getArea1(){
        return getArea() * h;
    }
    public String toString (){
        return " Radius of circle : "+getRadius()+
                "\n Height of cylider : "+getH() +
                "\n and Coler is "+ getColer()+
                "\n and Area1 = "+getArea1();
    }
}
