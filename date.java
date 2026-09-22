public class date{
	static void printAmerican(String day, String month, int date, int year){
		System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
	}
	static void printEuropean(String day, String month, int date, int year){
		System.out.println("European format: " + day + " " + date + " " + month + " " + year);
	}
	public static void main(String[] args){
		printAmerican("Tuesday", "September", 22, 2026);
		printEuropean("Tuesday", "September", 22, 2026);

	}
}
