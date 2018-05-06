package com.javaCore.BasicJavaExercise;

public class Exercise4 {

	public Boolean isInteger(String str){
		boolean isValidInteger=false;
		try {
			Integer.parseInt(str);
			isValidInteger=true;
		} catch (NumberFormatException e) {
			System.out.println("String is not an Integer.");
		}
		return isValidInteger;
	}

	public  Boolean isOddNumber(String str){
		if(isInteger(str)){
			int number=Integer.parseInt(str);
			if(number%2!=0){
				return true;
			}
		}
		return false;
	}
	public Boolean isEvenNumber(String str){
		if(isInteger(str)){
			int number=Integer.parseInt(str);
			if(number%2==0){
				return true;
			}
		}
		return false;
	}

	public Boolean isPrimeNumber(String str){
		if(isInteger(str)){
			boolean isPrime =true;
			int number=Integer.parseInt(str);

			if (number==0 || number==1){
				isPrime=false;
			}
			else{
				for(int i=2;i<=number-1;i++){
					if(number%i==0){
						isPrime=false;
						break;
					}
				}
			}

			if(isPrime){
				//System.out.println(number + " is a prime number");
				return true;
			}
		}
		return false;
	}
}

