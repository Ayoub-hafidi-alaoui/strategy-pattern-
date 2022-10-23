import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Context context = new Context();
        Scanner in = new Scanner("please type the strategy");
        String strategy = in.nextLine();
        context.setStrategie(new IStrategieImpl2());
        context.process();

    }
}