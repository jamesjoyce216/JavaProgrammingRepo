
/**
 * @author James Joyce
 */
public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int spood;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {

        this.spood = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";

    }

    public int getSpood() {
        return spood;
    }

    public void setSpood(int speed) {
        this.spood = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() 
    {
        if (isOn()) 
        {
            return "Fan speed:" + getSpood()
                    + "\nFan color:" + getColor()
                    + "\nFan radius:" + getRadius();
        } 
        else 
        {
            return "Fan color:" + getColor()
                    + "\nFan radius:" + getRadius()
                    + "\nFan is off.";
        }
    }
}