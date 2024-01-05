import os, random
from datetime import datetime


def get_month_and_date(year, day_of_year):
    date = datetime.strptime(f'{year} {day_of_year}', '%Y %j')
    month = date.strftime('%b')  # Month in three letter
    day = date.strftime('%d')    # Date
    
    return f'{month} {day}'

def getBirthdays(input_size) -> None:
    dateList = [random.randint(1,365) for _ in range(input_size)]
    random_birthdays = [get_month_and_date(2023,i) for i in dateList]
    
    return random_birthdays
        

def getMatch(birthday_list) -> bool:
    find_dup_bday = list(set(birthday_list))
    
    if len(find_dup_bday) < len(birthday_list):
        return True
    
    return False
    
def main():
    input_size = int(input("How many birthdays shall I generate? (Max 100)\n: "))
    while True:
        if input_size <= 100 and input_size > 0:
            break
        else:
            input_size = int(input("Maximum allowed input size is between 1 and 100. \nHow many birthdays shall I generate?\n: "))
    
    print(f"Here are {input_size} birthdays:")
    tempList = getBirthdays(input_size)
    for i in tempList:
        print(i,end=" ")
    print() # Change line
    
    if getMatch(tempList) == True:
        print("Multiple People share same birthday in current simulation")
    else:
        print("In this simulation, everyone has unique birthdays.\n")
    
    print()
    input(f"Generating {input_size} random birthdays 100,000 times...\nPress Enter to begin...")
    print()
    matching_list = []
    for i in range(0,100000):
        if i % 10000 == 0:
            print(f"{i} simulations run...")
        matching_list.append(getMatch(getBirthdays(input_size)))
    print("100000 simulations run.")
    print(f"Out of 100,000 simulations of {input_size} people, there was a matching birthday in that group {matching_list.count(True)} times.")
    print(f"This means that 23 people have a {matching_list.count(True)/len(matching_list)*100} % chance of having a matching birthday in their group.")
    print(f"That's probably more than you would think!")

if __name__ == "__main__":
    os.system("clear") # clear terminal
    print("Birthday Paradox, by Aditya Choudhury (2241003040)")
    while True:
        main()
        play_again = input("Do you want to play again? (yes or no)\n: ")
        if play_again == "yes":
            continue
        elif play_again == "no":
            print("Thanks for playing....")
            exit(0)
        else:
            print("Invalid choice, exitting....")
            exit(1)