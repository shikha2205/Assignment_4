def fibonacci(n):
    fib_sequence = [0, 1]
    for i in range(2, n):
        next_term = fib_sequence[i - 1] + fib_sequence[i - 2]
        fib_sequence.append(next_term)
    return fib_sequence[:n]
try:
    n_terms = int(input("Enter the number of terms you want in the Fibonacci sequence: "))
    if n_terms <= 0:
        print("Please enter a positive integer.")
    else:
        print("Fibonacci sequence:", fibonacci(n_terms))
except ValueError:
    print("Invalid input. Please enter an integer.")