import java.util.StringTokenizer;
public class Sa {
	
	
	public static int xyz(Shape sh) {
		return sh.Area(5,6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mylamb Lam = () -> System.out.println("satish");
		Lam.sa();
		System.out.println(xyz((int length , int breath) ->  length*breath ));
		System.out.println(xyz((int length , int breath) ->  length+breath ));
		//System.out.println(circle.Area(2, 3));
		//System.out.println(Triangle.Area(2, 3));	
	}
}
interface Mylamb{
	void sa();
}
interface Shape{
	int Area( int length , int breath );
} 	 	 	 	