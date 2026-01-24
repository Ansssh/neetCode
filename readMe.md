# Neet Code Diary

Hello People, My name is Ansh. I'm on my venture to complete neetCode in a month. And this is my Journal. i'll track my whole progress here. Stay Tuned!

## Arrays

The first topic of neetCode 150, containing 9 Questions - 

### Question 1 - Contains Duplicates `int[] -> boolean`

- Convert to Set
- Check for size

Time Complexity - $O(n)$

### Question 2 - Valid Anagram `String, String -> boolean`
- Both String to Array
- Sort the Arrays
- compare the arrays

Time Complexity - $O(n * log(n))$ 

### Question 3 - Two Sum - `int[], int -> int[]`
- store the number, along with their index in hashmap
- iterate over the array, check if its complement exists in hashmap, if yes, return the current and stored index else iterate
- given that solution is garunteed

Time Complexity - $O(n)$ 

### Question 4 - Group Anagrams - `String[] -> List<List<String>>`

- Create a Hashmap, from `String` to `List<String>`
- for each string in Array,
    - convert the `String` to `char[]`. **Sort it**. and convert back to `String`
    - now, we've got the sample string for all the anagrams of that String
    - take that sample String and store the string belonging to that sample.

Time Complexity - $O(n^2 * log(n))$ 


### Question 5 - Top K Frequent Elements

- Create a frequency map and then convert it into a 2-D array
- Sort the array with respect to frequency
- return the top k elements

Time Complexity - $O(n * log(n))$ 

### Question 6 - Encode and Decode Strings

- Given a String Array, Encode it by joining it with a non-UTF-8 seperator
- Similiarly, remove the delimeter to decode it

Time Complexity - $O(n)$

### Question 7 - Product Except Self

- Given an array, Create two arrays of same size and store the prefix and suffix product of the numbers of array except self.
- return the product of suffix and prefix

#### Example - 
nums = [2,3,4,5]
prefix = [1,2,6,24] & suffix = [60,20,5,1]
solution = [60, 40, 30, 24]

Time Complexity - $O(n)$

### Question 8 - valid Sudoku 

- Given a 2-D character array containing '.' or numbers from '1' to '9',
- Brute Force (Check Rows, Check Cols and Check Boxes)

Time Complexity - $O(n^2)$

### Question 9 - largest consecutive

- Given an int array, find the longest sequence that can be created, 
- use set for $O(1)$ lookups
- for each element in array, check if the next sequence exists in the set by maintaining a local variable.

Time Complexity - $O(n^2)$


> Arrays & Hashing Complete!! 

## Two Pointers

### Question 1 - is palindrome

- Given a String check if it is a palindrome, 
- Use two pointers approach

Time Complexity - $O(n)$

### Question 2 - Two Sum 

- Given an array and target, find two numbers such that their sum == target, return their indexes

Time Complexity - $O(n)$

### Question 3 - Three Sum

- Given an array, find all triplets whose sum equals 0;
- Combine for-loop with two sum, 
- for every element in array, calculate two sum with the target $(0-element)$

Time Complexity - $O(n^2)$

### Qustion 4 - Max Area

- Given an array of heights, find the max area.
- using while loop, mutiply the length with height and width and keep track of maximum.

Time Complexity - $O(n)$

### Question 5 - Trapping Rain Water

- Given an array of heights, find the total water that can be contained in the area,
- make two arrays, suffix & prefix where at index i, one can get the highest bounds from left and right
- for every position, calc the water contianed as $Math.Min(suffix[i] , prefix[i]) - height[i]$

Time Complexity - $O(n)$

> Two Pointers Complete

## Stack 

### Question 1 - Valid Parenthesis

- Given a String of Parenthesis, check if it is valid or not
- put every opening bracket in a stack and pop the top element if they correspond, otherwise return false;

Time Complexity - $O(n)$

### Question 2 - Min Stack

- Implement a custom stack where you can get the smallest element present in stack at any given time in O(1)
- Create another stack which stores currentElement and currentMinimum, check the [logic](stack/question2/CreateMinStack.java#L5)

Time Complexity - $O(1)$

### Question 3 - Polish Notation

- Given a String Array in postfix notation, evaluate.
- push the numbers in stack, when encountered an operation, pop the latest values, operate on them and push it back.

Time Complexity - $O(n)$

### Question 4 - Daily Temperatures

- Given an array of daily temperatures, for each day, return the number of days after which warmer temp appears
- Use stack to store that day index, then when a day with higher temperature comes, store the difference in solution array and pop the element

Time Complexity - $O(n)$

### Question 5 - Car Fleet

- Count the number of fleets that multiple cars will make to reach destination
- Calculate the time required to reach the destination by formula $time = distance / speed$
- Add the count for each fleet based on the time it reaches the destination

Time Complexity - $O(n)$

