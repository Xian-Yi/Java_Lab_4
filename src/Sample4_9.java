public class Sample4_9 {
	
	public static void main(String[] args) {
		
		CarI cars[];
		cars = new CarI[2];
		
		cars[0] = new CarI();
		cars[1] = new RacingCarI();
		
		for(int i = 0; i < cars.length; i++) {
			Class cl = cars[i].getClass();
			System.out.println("第" + (i+1) + "個物件的類別是" +cl);
		}
	}
}

class CarI {
	protected int num;
	protected double gas;
	
	public CarI() {
		num= 0;
		gas= 0.0;
		System.out.println("生產了車子");
	}
}

class RacingCarI extends CarI {
	
	public RacingCarI() {
		System.out.println("生產了賽車");
	}
}