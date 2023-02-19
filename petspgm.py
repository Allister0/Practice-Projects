#===============================================================================
# Program:        Class Pets
# Programmer:     Allister Bell Jr
# Date:           December 2, 2022
# Abstract:       This PetData class stores data about pets.
#===============================================================================


class PetData:
    
    # The __init__method initializes the attributes.
    def __init__(self, pet_name, pet_type, pet_age):
        self.__pet_name = pet_name
        self.__pet_type = pet_type
        self.__pet_age = pet_age
        
        
    # This method accepts an argument for the pet's name
    def set_pet_name(self, pet_name):
        self.__pet_name = pet_name
    
    # This method accepts an argument for the pet's type
    def set_pet_type(self, pet_type):
        self.__pet_type = pet_type
        
    # This method accepts an argument for the pet's age
    def set_pet_age(self, pet_age):
        self.__pet_age = pet_age
        
    # This method returns the pet's name
    def get_pet_name(self):
        return self.__pet_name
    
    # This method returns the pet's type
    def get_pet_type(self):
        return self.__pet_type
    
    # This method returns the pet's age
    def get_pet_age(self):
        return self.__pet_age