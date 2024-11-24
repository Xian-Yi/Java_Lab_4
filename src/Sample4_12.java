public class Sample4_12 {

    public static void main(String[] args) {
        VehicleL[] vc = {
            new CarL(1234, 20.5),
            new PlaneL(232)
        };

        for (VehicleL vehicle : vc) {
            vehicle.show();
        }
    }
}

interface VehicleL {
    int weight = 1000; // 可保留未使用的常數（若有未來需求）
    void show();
}

class CarL implements VehicleL {
    private final int num;
    private final double gas;

    public CarL(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    @Override
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class PlaneL implements VehicleL {
    private final int flight;

    public PlaneL(int f) {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    @Override
    public void show() {
        System.out.println("飛機的班次是" + flight);
    }
}
