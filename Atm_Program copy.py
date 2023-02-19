#program:      Atm Program
#Programmer:  Allister Bell Jr
#Date:	       10/11/2022 
#Abstract:    This program is a simulation of an ATM. it is set to process deposits, withdrawals,
#	      and invalid transaction codes, and provides a current balance.
#The main function definition 
def main(): 
    Name = input( "what is your name? ")
    Account_ID = input("what is your account ID? ")
    Transaction_code = input("press W or w for withdrawal , Press D or d for Deposit ")
    Previous_Balance = float(input(" What is your previous balance? ")) 
    Transaction_Amount = float(input( "How much is the transaction amount? "))
    if Transaction_code == "W" or Transaction_code == "w":
        Withdrawal_Process(Previous_Balance, Transaction_Amount) 
    elif Transaction_code == "D" or Transaction_code == "d":
        Deposit_Process(Previous_Balance, Transaction_Amount) 
    else:
        Process_Invalid_Code(Previous_Balance)
	
#The Invalid code Function Defintion 
def Process_Invalid_Code(Previous_Balance):
    New_Balance = Previous_Balance 
    print("Invalid Transaction code") 
    print("please type W or w for withdrawal") 
    print("or type D or d for Deposit") 
    Print_Function(New_Balance)
    
# Defines the Deposit Process 
def Deposit_Process(Previous_Balance, Transaction_Amount):
    New_Balance = Transaction_Amount + Previous_Balance
    Print_Function(New_Balance)
    
# Defines the Withdrawal Process 
def Withdrawal_Process(Previous_Balance, Transaction_Amount):
    if Previous_Balance >= Transaction_Amount:
        New_Balance = Previous_Balance - Transaction_Amount
        Print_Function(New_Balance)
    else:
        print("Invalid Transaction: Not sufficient Funds")
        New_Balance = Previous_Balance
        Print_Function(New_Balance)
	
# Defines the print Function 
def Print_Function(New_Balance):
    print('Your balance is now $', format(New_Balance, '.2f'))
    
#Call the main function 
main()