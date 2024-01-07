import os, random


def generate_secret_number() -> str:
    return str((random.sample(range(100, 1000), 1))[0])

def provide_hint(guess, random_num) -> bool:
    if guess == random_num:
        print("You got it!")
        return True
    
    clues = []
    for i in range(3):
        if guess[i] == str(random_num)[i]:
            clues.append("Fermi")
        elif guess[i] in str(random_num):
            clues.append("Pico")
    
    if not clues:
        print("Bagels")
    else:
        print(" ".join(clues))
    
    return False
    
def play_game() -> None:
    random_num = generate_secret_number()
    print("I have thought up a number.\nYou have 10 guesses to get it.")
    for i in range(1,11):
        current_guess = input(f"Guess #{i}\n> ")
        if len(current_guess) != 3:
            print("You can only input 3 digit numbers, You current chance was lost")
        else:
            if provide_hint(current_guess, random_num) == True:
                break;
            elif provide_hint(current_guess, random_num) == False and i == 10:
                print(f"The correct number was {random_num}\n")
    

if __name__ == "__main__":
    os.system("clear") # clear the terminal window
    print('''
Bagels, a deductive logic game.
By Aditya Choudhury (2241003040)
I am thinking of a 3-digit number. Try to guess what it is.
Here are some clues:
When I say: \t That means:
Pico \t\t One digit is correct but in the wrong position.
Fermi \t\t One digit is correct and in the right position.
Bagels \t\t No digit is correct.
        ''')
    input("Press enter to begin...")
    while True:
        play_game()
        play_again = input("Do you want to play again? (yes or no)\n: ")
        if play_again == "yes":
            continue
        elif play_again == "no":
            print("Thanks for playing!")
            exit(0)
        else:
            print("Invalid choice, Exitting......")
            exit(0)