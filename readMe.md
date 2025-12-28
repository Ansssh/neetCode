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

