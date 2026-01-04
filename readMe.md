# Neet Code Diary

Hello People, My name is Ansh. I'm on my venture to complete neetCode in a month. And this is my Journal. i'll track my whole progress here. Stay Tuned!

## Arrays

The first topic of neetCode 150, containing 9 Questions - 

### Question 1 - Contains Duplicates `int[] -> boolean`
---

- Convert to Set
- Check for size

Time Complexity - $O(n)$

### Question 2 - Valid Anagram `String, String -> boolean`
---
- Both String to Array
- Sort the Arrays
- compare the arrays

Time Complexity - $O(n * log(n))$ 

### Question 3 - Two Sum - `int[], int -> int[]`
---
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
