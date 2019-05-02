/**
 *
 * @author jj1002687
 */
public class simpleFan {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        Fan fan1 = new Fan();
        fan1.setSpood(Fan.FAST);
        fan1.setColor("Yellow");
        fan1.setRadius(10.0);
        fan1.setOn(true);
        System.out.println(fan1.toString());
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        Fan fan2 = new Fan();
        fan2.setColor("Blue");
        fan2.setRadius(5.0);
        System.out.println(fan2.toString());
        System.out.println("----------------------------------------------------");
    }
}
