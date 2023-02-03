package Sems1.Mini_Project.first;

import java.util.Scanner;
public class AffineChiper{
    // Driver code
    public static void main(String[]Args){
        // Input block
        Scanner input_paraphrase = new Scanner(System.in);
        System.out.println("Enter a paraphrase: ");
        String input_string = input_paraphrase.nextLine();
        input_paraphrase.close();
        String plaintext = input_string;
        
        // Output block
        String ciphertext = encrypt(plaintext);
        String decrypted = decrypt(ciphertext);
        System.out.println("Ciphertext: " + ciphertext);
        System.out.println("Decrypted text: " + decrypted);

    }
    
    //Function for encryption block
    public static String encrypt(String plaintext) {
        int k1 = 7; // Multiplicative key
        int k2 = 2; // Additive key
        char[] ciphertext = new char[plaintext.length()];
        // Compute block for encryption of key
        for (int i = 0; i < plaintext.length(); i++) {
          int k3 = plaintext.charAt(i) - 'a';
          int encrypted = (k3 * k1 +k2) % 26; //  Formula according to question "C = (P × k1 + k2) mod 26  k1 + k2) mod 26"
          ciphertext[i] = (char)(encrypted + 'a');
        }
        return new String(ciphertext);
      }

    //Function for decryption block
    public static String decrypt(String ciphertext) {
        int k1 = 7; // Multiplicative key
        int k2 = 2; // Additive key
        char[] plaintext = new char[ciphertext.length()];
        // Compute block for k1 k1_inverse
        int k1_inverse = 0; 
        for (int i = 0; i < 26; i++) {
          if ((k1 * i) % 26 == 1) {
            k1_inverse = i;
            break;
          }
        }
        // Compute block for decryption of key
        for (int i = 0; i < ciphertext.length(); i++) {
          int k3 = ciphertext.charAt(i) - 'a';
          int decrypted = ((k3 - k2 + 26)* k1_inverse) % 26; //  Formula according to question "P = ((C − k2) × k1 k2) × k1 + k2) mod 26  k1− k2) × k1^-1) mod 26"
          plaintext[i] = (char)(decrypted + 'a');
        }
        return new String(plaintext);
      }
}
