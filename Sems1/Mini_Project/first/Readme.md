## What is Affine cipher ##

The Affine Cipher is a type of monoalphabetic substitution cipher where each letter in the plaintext is mapped to a unique letter in the ciphertext through a simple mathematical function. The function used is an affine transformation, which involves multiplication and addition operations on the characters of the plaintext. The encryption and decryption keys consist of two numbers, which determine the specific affine transformation used. The security of the Affine Cipher is relatively weak and can be easily broken with simple frequency analysis.

## How the code works ##
The program takes user input as plaintext and uses a combination of a multiplicative key (k1) and an additive key (k2) to encrypt the plaintext. The Affine cipher algorithm uses the formula "C = (P × k1 + k2) mod 26" to compute the encrypted message, where "C" is the ciphertext, "P" is the plaintext, "k1" and "k2" is predefined inside the code and "mod 26" ensures that the result is within the range of the alphabet (A-Z and a-z).

## Working of encrypt() method ##
The driver code calls the method if `encrypt()` , then encryption process first checks if each character of the plaintext is an uppercase letter or a lowercase letter. If it's an uppercase letter, it converts the character to an integer using the formula "`k3 = plaintext.charAt(i) - 'A'`". If it's a lowercase letter, it converts the character to an integer using the formula "k3 = plaintext.charAt(i) - 'a'". The encrypted message is then computed using the above formula and converted back to a character.

## Working of decrypt() method ##
The driver code calls the method if `encrypt()` , then decryption process first computes the inverse of the multiplicative key `k1_inverse` and uses the formula "`P = ((C − k2) × k1^-1) mod 26`" to decrypt the ciphertext back to the original plaintext. The decryption process uses a similar procedure as the encryption process to check if each character of the ciphertext is an uppercase letter or a lowercase letter, convert the character to an integer, and compute the decrypted message.

## Working of driver code ## 
The driver code first asks for input from the user using Scanner class of `input_paraphrase` and assigns the input to the variable `plaintext`.
Then it calls the method of `encrypt(plaintext)` and `decrypt(ciphertext)` for encryption and decryption of the provided paraphrase
Finally, the program outputs the encrypted message (ciphertext) and the decrypted message (plaintext). The `input.close()` method is used to close the input stream after taking the user input. The program is closed by the main method.