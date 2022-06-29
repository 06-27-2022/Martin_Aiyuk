
public class GradingCalculatorActivity {
	
	public static void main(String[] args) {
	
		int [] arr = {95, 85, 62, 40, 79};
		
		int Math = 95;
		int English = 85;
		int Science = 79;
		int History = 40;
		char Art = 62;
		
		if(Math >= 90 && Math <=100) {
			System.out.println( "Math: A");	
		}
		
		if(English >= 80 && English <= 89) {
			System.out.println("English: B");
		}
		
		if(Science >= 70 && Science <= 79) {
			System.out.println("Science: C");
		}
		
		if(History <= 59) {
			System.out.println("History: F");
		}
		
		if(Art >= 60 && Art <= 69) {
			System.out.println("Art: D");
		}
		
	}
	

}
