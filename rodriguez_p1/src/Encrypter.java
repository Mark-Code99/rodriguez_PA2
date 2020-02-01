public class Encrypter {

public static int Encrypt (int number) {
	
	 int digitOne,digitTwo,digitThree,digitFour;
	
	 digitOne =  number / 1000;
	 digitTwo = (number % 1000) / 100;
	 digitThree = (number % 100) / 10;
	 digitFour =  number % 10;
	 
	 digitOne = (digitOne + 7) % 10 ;
	 digitTwo = (digitTwo + 7) % 10;
	 digitThree = (digitThree + 7) % 10;
	 digitFour = (digitFour + 7) % 10;
	 
	 return (digitThree * 1000 + digitFour * 100 + digitOne * 10 + digitTwo);
	 
}

}