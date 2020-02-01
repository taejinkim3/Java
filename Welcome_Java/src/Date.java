
public class Date {
	private int y;
	private String m;
	private int d;
	
	Date(){
		this(1900,"1¿ù",1);
	}
	Date(int y){
		this(y,"1¿ù",1);
	}
	Date(int y,String m,int d){
		this.y=y;
		this.m=m;
		this.d=d;
	}
	@Override
	public String toString() {
		return "Date [y=" + y + ", m=" + m + ", d=" + d + "]";
	}
}
