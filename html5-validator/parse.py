from time import sleep

def convert_to_list(errors):
    '''
    Converts a string which contains raw error output
    into a 2D list where the outer lists are errors.
    The inner list contains the location (index 0)
    and error message (index 1).

    Args:
        errors (str): raw error output from the HTML5 Validator

    Returns:
        list: a 2D list containing error locations and messages
    '''
    result = []

    count = 0  # number of single quotes detected
    pair = ""  # string containing both error location and message

    for char in errors:
        if char == "'":  # new pair has started
            count += 1  
        elif count == 1:
            # keep appending characters
            # until the pair ends (another single quote)
            pair += char  
        elif count == 2:  # pair has ended
            # split the string into location and message
            pair = pair.split("error:")

            # strip whitespace
            pair[0] = pair[0].strip()
            pair[1] = pair[1].strip()

            # add the pair to the result
            result.append(pair)  

            count = 0  # reset count
            pair = "" # reset pair

    return result

def print_errors(pairs, fast):
    '''
    Prints all of the errors in order with their
    locations and messages

    Args:
        pairs (list): 2D list generated from convert_to_list()
        fast (bool): True if you want the function to print fast
    '''
    count = 1  # number of errors

    # print location and message of each error
    # number the errors for reference
    for pair in pairs:
        location = pair[0]
        message = pair[1]
        
        print("ERROR %d" % count)
        print(">>> " + location)
        print(">>> " + message)
        print()

        if fast:
            sleep(0.1)
        else:
            sleep(0.5)

        count += 1

def print_errors_left(not_fixed):
    '''
    Prints the number of errors left
    and their error numbers

    Args:
        not_fixed (list): list of ints which are the error numbers of the not fixed errors
    '''
    print("Errors left: " + str(len(not_fixed)))

    print("Errors not fixed yet:")
    elements_in_row = 1
    for error_number in not_fixed:
        # print 10 error numbers per row
        if elements_in_row % 10 != 0:
            print(error_number, end=" ")
        else:
            print(error_number)
        elements_in_row += 1

def track_errors(pairs):
    '''
    Continuously prompt the user if they
    want to mark an error as fixed, get info
    on a specific error, or end the program

    Args:
        pairs (list): 2D list generated from convert_to_list()
    '''
    # stores not fixed error numbers
    not_fixed = [i for i in range(1, len(pairs) + 1)]

    # continuously prompt user for choice
    while True:
        choice = input("Choose: (1) Fix error, (2) Get error info, or (3) Exit: ")

        # mark error as fixed
        if choice == '1':
            error_number = int(input("Enter error number once you have fixed it: "))

            try:
                sleep(0.3)
                not_fixed.remove(error_number)
                print()
                print("Error fixed!")
            except ValueError:
                print("Error, not a valid error number or already fixed")
            finally:
                sleep(0.5)
                print_errors_left(not_fixed)
                print()
        
        # get info on an error
        elif choice == '2':
            error_number = int(input("Enter error number to get info: "))
            index = error_number - 1

            try:
                print()
                sleep(0.3)

                # print the error info
                print("ERROR " + str(error_number))
                print(">>> " + pairs[index][0])
                print(">>> " + pairs[index][1])

                print()
            except IndexError:
                print("Invalid error number")
            finally:
                sleep(0.5)
                print_errors_left(not_fixed)
                print()
        elif choice == '3':
            break
        else:
            print("Invalid choice, please try again")
        
        print()


def main():
    # read text file which contains error message copied and pasted
    # should all be on one line
    errors = open("errors.txt", "r")
    errors = errors.readline()

    # cut off the "ERROR:html5validator.validator:[" at the start
    # and the "]" at the end
    errors = errors[32 : len(errors) - 2]

    pairs = convert_to_list(errors)

    fast = input("Do you want to print the errors fast? Enter Y or N: ").lower()
    fast = fast == 'y'

    print_errors(pairs, fast)

    track_errors(pairs)

main()
