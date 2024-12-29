# Software Development Exercises - UE05  

## 📜 Tasks  
This exercise focuses on creating and testing Java methods. Each task introduces key programming concepts, including test methods, arithmetic calculations, text conversion, and method overloading.  

### 1. Test Methods for Arrays  
Develop test methods for array operations:  
- `testMax`: Tests the `max` method, which finds the maximum value in an array.  
- `testAdd`: Tests the `add` method, which adds a given value to each element of an array.  

### 2. Price Calculation  
Implement methods to calculate:  
- **Cost Price:** Includes material and manufacturing costs plus a 20% distribution markup.  
- **Sales Price:** Adds a 30% profit margin to the cost price.  

### 3. Number to Text Conversion  
Convert numbers to their text representation:  
- `digitToText`: Maps digits (0–9) to their English names (e.g., `7 → "Seven"`).  
- `numberToText`: Converts whole numbers to concatenated digit names (e.g., `123 → "OneTwoThree"`).  

### 4. Rounding to Closest  
Round values to the closest of two boundary values:  
- `roundToClosest(int min, int max, int value)`: Rounds a single value.  
- `roundToClosest(int min, int max, int... values)`: Rounds multiple values using the first method.  

---

## 📂 Project Structure  

``src/``

- ``In.java`` Helper class for input  
- ``Out.java`` Helper class for output  
- ``ArrayMethods.java`` Contains methods for array operations and their tests  
- ``ProductPricing.java`` Implements cost and sales price calculations  
- ``NumbersToText.java`` Implements digit-to-text and number-to-text conversions  
- ``RoundToClosest.java`` Implements rounding methods  

``tests/``

- ``Testprotokolle.txt`` Test cases and results for all tasks  

---

## 🛠 Implementation Details  
- **Test Coverage:** Each task includes tests for typical cases and edge cases (e.g., negative inputs).  
- **Floating-Point Precision:** Comparisons account for imprecision using tolerances.  
- **Modular Design:** Methods are reused where possible to reduce duplication.  

---

## 🛠 Tools  
- **Programming Language:** Java  
- **Editor:** Visual Studio Code with [JavaWiz](https://github.com/SSW-JKU/javawiz) extension  

---

## 📝 License  
This project is licensed under the [MIT License](LICENSE).
