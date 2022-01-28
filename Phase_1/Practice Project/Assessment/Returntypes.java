package Assessment;

public class Returntypes {
	
	public int add(){
		int a=3;
		int b=3;
		int add;
		add=a+b;
		return add;
	
	}
	public int area(int r){
		int cir;
		int pi=(int) 3.14;
		cir=pi*r*r;
		return cir;
	}
	public int area(long h,double b){
		int rec;
		rec=(int) (h*b);
		return rec;
	}

	public static void main(String[] args) {
		
		Returntypes m=new Returntypes();
		int s1 =m.add();
		int s2 =m.area(7);
		int s3 =m.area(12L,11.5);
		System.out.println("Addition: "+s1);
		System.out.println("Area of circle: "+s2);
		System.out.println("Area of rectangle: "+s3);

	}

}
