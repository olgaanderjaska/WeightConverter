package WeightConverter;

import java.util.Scanner;

public class WeightConverter {

	public static void main(String[] args) {
Scanner WeightConverter = new Scanner(System.in);
		
		double myWeight;
		double Moon = 0.17;
	
		System.out.println("Enter your weight on Earth in lbs: ");
		myWeight = WeightConverter.nextDouble();
		
	
		System.out.println(myWeight + " lbs on Earth is " + myWeight * Moon + " lbs on Moon." );

		
		}


	}


