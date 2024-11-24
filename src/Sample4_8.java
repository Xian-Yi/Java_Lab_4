public class Sample4_8 {

	public static void main(String[] args) {
		CarH car1 = new CarH();
		CarH car2 = new CarH();
		
		CarH car3;
		car3 = car1;
		
		System.out.println("car1與car2相同 " + car1.equals(car2));
		System.out.println("car1與car3相同 " + car1.equals(car3));

	}

}

class CarH {
	protected int num;
	protected double gas;
	
	public CarH() {
		num= 0;
		gas= 0.0;
		System.out.println("生產了車子");
	}
}