#                 Homework 7 Program Code
#
#===============================================================================
#Program:       Payment due reporter
#Programmer:    Allister Bell Jr
#Date:          28 October 2022    
#Abstract:      This Program prints a payment due report listing each customer 
#               in the data file. Input will be from data in file "disks.txt" 
#                                      
#===============================================================================

# create global constrants for the price of a CD and DVD
CW_RW_PRICE = 16.50
DVD_RW_PRICE = 21.75

def main():
    #Initialize counters.
    cd_customers_counter = 0
    dvd_customers_counter = 0
    total_payment_due = 0
    
    #create column headings line
    print('Customer Name\tcode\tspindle\tpayment Due') 
    print('')  
    
    #cretae the try block of the exception handler.
    try:
        #open file named disks.txt
        infile = open('disks.txt', 'r')
        
        #read the first of the file is which is the customer name field
        customer_name = infile.readline()
        
        #while a file is read continue processing 
        while customer_name != ' ':
            
            #Strip new line character from the customer name field and display.
            customer_name = customer_name.rstrip('\n')
            print(customer_name, end='\t')
            
            #Read code field. Strip new line character and display
            code = infile.readline()
            code = code.rstrip('\n')
            print(code, end='t')
            
            #read the spindlea field. strip new line character and display
            spindles = infile.readline()
            spindles = int(spindles)
            print(format(spindles, '3.0f'), end='\t')
            
            #check code and computer payment due.
            #Increment appropriate counter
            if code == "C" or code == "c":
                payment_due = spindles * CW_RW_PRICE
                cd_customers_counter += 1
            elif code == "D" or code == "d":
                payment_due = spindles * DVD_RW_PRICE
                dvd_customers_counter += 1
            else:
                payment_due = 0
                
            #Accumulate total payments due.
            total_payment_due += payment_due
            
            #Display Invalid code or payment due.
            if payment_due == 0:
                print('invalid code')
            else:
                print('$', format(payment_due, '7,.2f'))
               
            #read the customer name field of the next record.
            customer_name = infile.readline()
            
        #close input file.
        infile.close()
            
        #Display counters and total of payments due.
        print('')
        print('Total customers that purchased CD_RWs:  ', cd_customers_counter)
        print('Total customers that purchase DVD-RWs:  ', dvd_customers_counter)
        print('')
        print('Total amounts of payments due: ', end='')
        print('$', format(total_payment_due, ' ,.2f'), sep='')
            
    #Exception cluase    
    #Display Handler statement to gracefully respond.
    except IOError:
            print('An error occured trying to open or read disks.txt')
#call the main function
main()