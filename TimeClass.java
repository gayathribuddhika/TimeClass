
package timeclass;


public class TimeClass {

    
    public static void main(String[] args) {
        SubTime time = new SubTime();
        System.out.println(time.display());
        time.setTime(15, 46, 33);
        System.out.println(time.display());
    }
    
}
