import pytest
from simple_calculator import add, subtract, multiply, divide

# Test the add function
def test_add():
    assert add(2, 3) == 5, "2 + 3 should equal 5"
    assert add(-1, 1) == 0, "-1 + 1 should equal 0"

# Test the subtract function
def test_subtract():
    assert subtract(5, 3) == 2, "5 - 3 should equal 2"
    assert subtract(3, 5) == -2, "3 - 5 should equal -2"

# Test the multiply function
def test_multiply():
    assert multiply(2, 3) == 6, "2 * 3 should equal 6"
    assert multiply(-2, 3) == -6, "-2 * 3 should equal -6"

# Test the divide function, including division by zero
def test_divide():
    assert divide(6, 3) == 2, "6 / 3 should equal 2"
    assert divide(5, 0) == "Error: Cannot divide by zero!", "Division by zero should return error"
