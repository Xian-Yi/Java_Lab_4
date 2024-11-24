public class Sample4_11 {

    public static void main(String[] args) {
        VehicleK[] vc = {
            new CarK(1234, 20.5),
            new PlaneK(232)
        };

        for (int i = 0; i < vc.length; i++) {
            System.out.println("第" + (i + 1) + "個物件" + 
                (vc[i] instanceof CarK ? "是Car類別" : "不是Car類別"));
        }
    }
}

abstract class VehicleK {
    protected int speed;

    public void setSpeed(int s) {
        speed = s;
        System.out.println("將速度設為" + speed + "了");
    }

    abstract void show();
}

class CarK extends VehicleK {
    private final int num;
    private final double gas;

    public CarK(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

class PlaneK extends VehicleK {
    private final int flight;

    public PlaneK(int f) {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    public void show() {
        System.out.println("飛機的班次是" + flight);
        System.out.println("速度是" + speed);
    }
}
