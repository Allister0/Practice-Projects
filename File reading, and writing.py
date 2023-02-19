#                      Program 8 Program Code           
#
#===============================================================================
#Program:             Names and using List Variables
#Programmer:          Allister Bell Jr
#Date:                11/01/2022
#Abstract:            Creating and using a list variable and an output seqential 
#                     data file.
#===============================================================================

def main():
    #puts the list of names into the "names" variable
    names = inputNames()
    
    print("original order, not sorted: ")
    #calls the printNames function to print the list single spaced
    printNames(names)
    
    print("sorted list of names: ")
    #uses the sort method to sort the list of names
    names.sort()
    #calls the printnames function to print the list single spaced 
    printNames(names)
    
    #calls the writenames function to write the list to a new file 
    writeNames(names)
    
    #calls the searchNames function to allow the user to search the list 
    searchNames(names)
    
    
def inputNames():
    #Opens the file reads it into the program and retrurns the list to main
    infile = open('names.txt', "r")
    names =  infile.readlines()
    infile.close()
    index = 0
    while index < len(names):
        names[index] = names[index].rstrip('\n')
        index += 1
        
    return names


def printNames(names):
    #Lists the names single spaced on seperate lines 
    for n in names:
        print(n)
        
def writeNames(names):
    #Takes the "names" list, and writes it to a new file
    newNames = (names)
    outfile = open('newNames.txt', 'w')
    for item in newNames:
        outfile.write(item + '\n')
        outfile.close()
        
def searchNames(names):
    #Allows the user to search the list for a specific name.
    searchAgain = "y"
    
    while searchAgain == "y" or searchAgain == "Y":
        
        name = input('who are you looking for? (case sensitive) ')
        if name in names:
            print(name, 'was found in the list')
            position = names.index(name)
            print('The name', name, 'is found at index', position)
        else:
            print(name, 'was not found in the list')
            
            searchAgain = input("Do you want to search again? (y/n): ")    
            
main()            