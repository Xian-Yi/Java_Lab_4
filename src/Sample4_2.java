public class Sample4_2 {

	public static void main(String[] args) {
		RacingCarB rccar1 = new RacingCarB(1234,20.5,5);
	}
}

class CarB {
    private int num;
    private double gas;
    
    public CarB() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    
    public CarB(int n, double g){
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
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

class RacingCarB extends CarB {
	private int course;
	
	public RacingCarB() {
		course  = 0;
		System.out.println("生產了賽車");
	}
	
	public RacingCarB(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("生產了編號為" + course + "的賽車");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車號號碼設為" + course);
	}
}

