public class InstanceLoop {
    int number = 10;

    public static void climb(int speed) {
        for (int i = 0; i < 5; i++){
            System.out.println(speed = speed += 1);
        }
    }

    public static void angleMethod(double angle1, double angle2) {
        if (angle1 + angle2 > 360){
        System.out.println(angle1 + angle2);
        return;
        }
        
    }

    public static void unclimb(int speed){
        for (int i = 0; i < 5; i++) {
            System.out.println(speed = speed -= 1);
        }
    }
    public static void main(String[]args){
        climb(10);
        angleMethod(20,5);
        unclimb(20);
    }
}
