public class Robot {

    public static String robotName;

    public static void robot(String putnamehere){
        robotName = putnamehere;
    }

    public static void main(String[] args) {
        Robot.robot("BOB3Y");
        System.out.println(Robot.robotName);
    }


}
