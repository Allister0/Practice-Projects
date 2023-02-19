#==============================================================================#
# program:                 Processing Class PetData
# programmer:              Allister Bell Jr
# Date:                    December  1, 2022
# Abstract:                This program uses the PetData class to retrieve and
#                          display information about a pet enetered by the user.
#==============================================================================#

import petspgm

def main():
    # get a list of pet objects 
    pets = make_list()
    
    #display the data in the list 
    print('Here is the data you entered: ')
    display_list(pets)
    
# This function gets data from the user fr 3 pets. It returns a list 
# of pet objects containing the data.

def make_list():
    #create an empty list
    pet_list = [] 
    
    #Add three pet objects to the list
    print('Enter the data for 3 pets.')
    for count in range(1,4):
        #get hte pet data
        print('Pet number ' + str(count) + ':')
        pet_name = input("Enter your pets name: ") 
        pet_type = input('Enter the type of pet: ')
        pet_age = input("enter your pet's age: ")
        print(pet_name, pet_type, pet_age)  
              
        # Create a new PetData object in memory and assign it to the pet
        # variable
        pet = petspgm.PetData(pet_name, pet_type, pet_age)
        
        # Add the object to the list
        pet_list.append(pet)
        
    # Return the list
    return pet_list

# This function accepts a list containing PetData objects as an arguent 
# and displays the data stored in each object 
def display_list(pet_list):
    for item in pet_list:
        print("Pet's name is: " + item.get_pet_name())
        print("Pet's type is: " + item.get_pet_type())
        print("Pet's age is: " + str(item.get_pet_age()))             
    
# Call the main function
main()


