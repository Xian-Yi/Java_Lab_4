public class Sample4_4 {

	public static void main(String[] args) {
		RacingCarD rccar1;
		rccar1 = new RacingCarD();
		
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
		
		rccar1.show();
	}
}

class CarD {
	protected int num;
	protected double gas;
	
	public CarD() {
		num= 0;
		gas= 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	public void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}

class RacingCarD extends CarD {
	private int course;
	
	public RacingCarD() {
		course  = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車號號碼設為" + course);
	}
	
	public void show() {
		System.out.println("賽車的車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("賽車編號是" + course);
	}
}
