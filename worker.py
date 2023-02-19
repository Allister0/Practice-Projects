#===============================================================================
# Program:           Superclass Person & HourlyWorker/ SalaryWorker
#                    subclasses
# Programmer:        Allister Bell Jr
# Date:              December 5, 2022
# Abstract:          This class stores and displays data about persons. it
#                    also calculates the hourly rate with premium increases
#                    based on shift for hourly workers, and the bi_weekly
#                    gross pay for salary workers.
#===============================================================================
PREMIUM2 = .05
PREMIUM3 = .10
PAY_PERIOD = 26

class Person:
    
    #the __init__ method initializes the attributes
    def __init__(self, name, id_number, city):
        self.__name = name
        self.__id_number = id_number
        self.__city = city
        
        
    # this method accepts an argument for the person's name
    def set_name(self,name):
        self.__name = name
        
    # This method accepts an argument for the person's ID number
    def set_id_number(self, id_number):
        self.__id_number = id_number
        
    # This method accepts an argument for the person's city of residence 
    def set_city(self,city):
        self.__city = city
        
    # This method returns the employee's name
    def get_name(self):
        return self.__name
    
    # This method returns the employee's number
    def get_id_number(self):
        return self.__id_number
    
    # This method returns the employee's city of residence
    def get_city(self):
        return self.__city
    
    # This method displays a message indicating the employee's name, ID, and city
    def show_employee(self):
        print('Employee name is', self.__name)
        print('Employee number is', self.__id_number)
        print('Employee city is', self.__city)
        
    # This method displays a message about the volunteer's pay status 
    def show_pay(self):
        print()
        print('This person is an unpaid volunteer.')
        print()
        
class HourlyWorker(Person):
    
    # This method calls the superclass's init method and initializes shift and 
    # pay rate attributes
    def __init__(self, name, id_number, city, shift, pay_rate):
        Person.__init__(self, name, id_number, city)
        self.__shift = shift 
        self.__pay_rate = pay_rate
        
        
    # This method calculates and displays the hourly and premium pay rate of a 
    #production employee
    def show_pay(self):
        print('Employee shift is', self.__shift)
        if self.__shift == '1':
            premium_rate = self.__pay_rate
        elif self.__shift == '2':
            premium_rate = (PREMIUM2 * self.__pay_rate) + self.__pay_rate
        else:
            premium_rate = (PREMIUM3 * self.__pay_rate) + self.__pay_rate
            print('Employee hourly premium pay rate is $', format(premium_rate, '.2f'))
            
class SalaryWorker(Person):
    # This method calls the superclass's init method and initializes the 
    #pay rate attribute
    def __init__(self, name, id_number, city, pay_rate):
        Person.__init__(self, name, id_number, city)
        self.__pay_rate = pay_rate
        
    # This method displays the annual salary and bi_weekly gross pay for 
    # salaried employee
    def show_pay(self):
        print('Employee annual salary is $', format(self.__pay_rate, '.2f'))
        bi_weekly_pay = float(self.__pay_rate) / PAY_PERIODS
        print('Employee bi-weekly gross pay is $', format(bi_weekly_pay, '.2f'))
        