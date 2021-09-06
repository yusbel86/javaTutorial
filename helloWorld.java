public class helloWorld{

	public static void main (String args[]){

		int time = 21;

		if(time > 20){
			System.out.println("Good evening");
		}else{
			System.out.println("Good day");
		}


		int day = 6;

		switch (day){
			case 1: 
			   System.out.println("Monday");
			   break;
			case 2:
			   System.out.println("Tuesday");
			   break;
			case 3:
			   System.out.println("Wednesday");
			   break;
			case 4:
			   System.out.println("Thursday");
			   break;
            case 5:
			   System.out.println("Fraiday");
			   break;
			default:
			   System.out.println("Weekend");


		}
		System.out.println("Ciclo While");

		int i = 0;
		while (i < 5){
			System.out.println(i);
			i++;
		}

		System.out.println("Ciclo For");

		for (int x=0; x < 5; x++){
			System.out.println(x);
		}

		String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		for (int y = 0; y < cars.length; y++) {
			System.out.println(cars[y]);
		}

	}
}