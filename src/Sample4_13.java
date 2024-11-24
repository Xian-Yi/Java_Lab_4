public class Sample4_13 {

    public static void main(String[] args) {
        CarM car1 = new CarM(1234, 20.5);
        car1.vshow();
        car1.mshow();
    }
}

interface VehicleM {
    void vshow();
}

interface MaterialM {
    void mshow();
}

class CarM implements VehicleM, MaterialM {
    private final int num;
    private final double gas;

    public CarM(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    @Override
    public void vshow() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }

    @Override
    public void mshow() {
        System.out.println("車子的材質是鐵");
    }
}
