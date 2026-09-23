public class Multiadd{
	public static void main(String[] args){
		System.out.println(multadd(1.0, 2.0, 3.0));
		System.out.println(multadd(1.0, Math.cos(Math.PI/4), Math.sin(Math.PI/4)));
		System.out.println(multadd(0.5, Math.log(10), Math.log(20)));
		System.out.println(expSum(5.0));
	}
	public static double multadd(double a, double b, double c){
		double result = a * b + c;
		return result;
	}
	public static double expSum(double d){
		double result = multadd(d, Math.exp(-d), Math.sqrt(1-Math.exp(-d)));
		return result;
	}
}
