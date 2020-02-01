/*
 Create main Method, Encrypter and Decrypter classes.
 Get the four digit integer entered and then either encrypt the number or decrypt it.
 Write the code for encrypting and decrypting.
 Print the final result in the main method.
 */

import java.util.Scanner;

public class Application {
	
	static int integer;
	
	public static void main(String[] args) {
		
		Scanner enterInteger = new Scanner (System.in);
		System.out.print("Enter a four digit integer to encrypt or decrypt: ");
		integer = enterInteger.nextInt();
		System.out.print("Type 1 to encrypt number or press 2 to decrypt the number entered: ");
		int option = enterInteger.nextInt();
		if (option == 1) {
			 System.out.printf("The encrypted value is: %04d", Encrypter.Encrypt(integer));
		}else if (option == 2){
			 System.out.printf("The decrypted value is: %04d ", Decrypter.Decrypt(integer));
		}else {
			System.out.println("Invalid option entered");
		}
			enterInteger.close();
	}

}