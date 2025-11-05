# Function to add two numbers
def add(x y):
    return x + y


# Function to subtract two numbers
def subtract(x, y):
    return x - y


# Function to multiply two numbers
def multiply(x, y):
    return x * y


# Function to divide two numbers, with error handling for division by zero
def divide(x, y):
    if y == 0:
        return "Error: Cannot divide by zero!"
    return x / y


# Main function to run the calculator
def main():
    # Start an infinite loop to keep the calculator running until the user exits
    while True:
        # Display the menu options
        print("\nSimple Calculator Menu:")
        print("1. Add")
        print("2. Subtract")
        print("3. Multiply")
        print("4. Divide")
        print("5. Exit")

        # Get user input for menu choice
        choice = input("Enter your choice (1-5): ")

        # Exit the program if user selects option 5
        if choice == "5":
            print("Goodbye!")
            break

        # Check if the choice is valid (1-4)
        if choice not in ["1", "2", "3", "4"]:
            print("Invalid choice. Please try again.")
            continue

        # Try block to handle invalid number inputs
        try:
            # Get two numbers from the user
            num1 = float(input("Enter first number: "))
            num2 = float(input("Enter second number: "))

            # Perform the selected operation and display the result
            if choice == "1":
                result = add(num1, num2)
                print(f"Result: {num1} + {num2} = {result}")
            elif choice == "2":
                result = subtract(num1, num2)
                print(f"Result: {num1} - {num2} = {result}")
            elif choice == "3":
                result = multiply(num1, num2)
                print(f"Result: {num1} * {num2} = {result}")
            elif choice == "4":
                result = divide(num1, num2)
                print(f"Result: {num1} / {num2} = {result}")

        # Handle invalid inputs (e.g., non-numeric values)
        except ValueError:
            print("Please enter valid numbers.")


if __name__ == "__main__":
    main()
