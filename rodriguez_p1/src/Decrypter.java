public class Decrypter {

	public static int Decrypt (int number) {
		
		 int digitOne,digitTwo,digitThree,digitFour;
		
		 digitOne =  number / 1000;
		 digitTwo = (number % 1000) / 100;
		 digitThree = (number % 100) / 10;
		 digitFour =  number % 10;
		 
		 digitOne = (digitOne + 3) % 10 ;
		 digitTwo = (digitTwo + 3) % 10;
		 digitThree = (digitThree + 3) % 10;
		 digitFour = (digitFour + 3) % 10;
		
		 return (digitThree * 1000 + digitFour * 100 + digitOne * 10 + digitTwo);
	}


}