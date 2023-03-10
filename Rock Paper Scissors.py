#                 Homework 6 Program Code
#
#===============================================================================
#Program:       Rock Paper Scissors
#Programmer:    Allister Bell Jr
#Date:          25 October 2022    
#Abstract:      This program takes a players choice and compares it to a random 
#               computer choice and displays the winner of the popular game
#               'Rock Paper Scissors'
#               
#===============================================================================
import random
# Defining the main function 
def main():
    # setting up control variables for player, computer, tied games and play loop.
    play_again = 'y'
    number_of_tied_games = 0
    number_of_player_games = 0
    number_of_computer_games = 0
    print("Let's play the game of Rock, Paper, scissors.")
    # create loop for rock paper scissor options
    while play_again == 'y' or play_again == 'Y':
        computer_choice = process_player_choice()
        player_choice = process_player_choice()
        #display computer choice
        if computer_choice == 1:
            print('the computer chooses rock.')
        elif computer_choice == 2:
            print('the computer chooses paper.')
        else:
            print('the computer chooses scissors')
        #display player choice   
        if player_choice == 1:
            print("you choose rock")
        elif player_choice == 2:
            print('you choose paper')
        else:
            print('you choose scissors')
            
       #create result variable and accumulator  
        result = determine_winner(player_choice, computer_choice)
        if result == 'computer':
            number_of_computer_games += 1
        elif result == 'player':   
            number_of_player_games += 1
        else:
            number_of_tied_games += 1
        print(result)
        
        play_again = input('Do you want yo play again? (Enter y for yes): ')
        print('There were', number_of_tied_games, 'tie games played.')
        print('The computer won', number_of_computer_games, 'game(s). ')
        print('You won', number_of_player_games, 'game(s).') 
        
def process_computer_choice():
    choice1 = random.randint(1,3)
    return choice1

def process_player_choice():
    print('what is your choice? Enter 1 for rock, 2 for paper, or 3 for scissors: ',)
    choice2 = int(input())
    #create input validation loop to prevent use of bad data input
    while choice2 != 1 and choice2 != 2 and choice2 != 3:
        print('ERROR: the choice can only be 1, 2, or 3.')
        choice2 = int(input("Please enter a correct choice: "))
    return choice2

def determine_winner(player_choice, computer_choice):
    if computer_choice == 1:
        if player_choice == 2:
            print('Paper covers rock. You win!')
            winner = 'player'
        elif player_choice == 3:
            print(' Rock crushes scissors. The computer wins!')
            winner = 'computer'
        else:
            print('The game is tied. Try again.')
            winner = "tied"
            
    if computer_choice == 2:
        if player_choice == 1:
            print('Paper covers rock. The computer wins!')
            winner = "computer"
        elif player_choice == 3:
            print('Scissors cuts paper. You win!')
            winner = 'player'
        else:
            print('The game is tie. Try again.')
            winner = 'tied'
    if computer_choice == 3:
        if player_choice == 1:
            print('Rock smashes scissors. You win!')
            winner = 'player'
        elif player_choice == 2:
            print('Scissors cuts paper. The computer wins!')
            winner = 'computer'
        else:
            print('The game is tied. Try again.')
            winner = 'tied'
            
    return winner

main() 
            
    
        
            
    