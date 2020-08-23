<h1>Assignment 6.1</h1>

Sum of digits of a given number to a given power
Given a number, we need to find the sum of all the digits of a number which we get after raising the number to a specified power.

Input: number = 5, power = 4 
Output: 13
Explanation:
Raising 5 to the power 4 we get 625.
Now adding all the digits = 6 + 2 + 5


Input: number = 9, power = 5
Output: 27
Explanation:
Raising 9 to the power 5 we get 59049.
Now adding all the digits = 5 + 9 + 0 + 4 + 9

<h1>Assignment 6.2</h1>

Create PIN using three given input numbers

"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (passwords). You have been asked to work on the module that is expected to generate PINs using three input numbers. 
Assumptions: The three given input numbers will always consist of three digits each i.e. each of them will be in the range >=100 and <=999
100 <= input1 <= 999
100 <= input2 <= 999
100 <= input3 <= 999
Below are the rules for generating the PIN -
- The PIN should be made up of 4 digits
- The unit (ones) position of the PIN should be the least of the units position of the three input numbers
- The tens position of the PIN should be the least of the tens position of the three input numbers

 
- The hundreds position of the PIN should be the least of the hundreds position of the three input numbers
- The thousands position of the PIN should be the maximum of all the digits in the three input numbers
Example 1 -
input1 = 123
input2 = 582
input3 = 175
then, PIN = 8122
Example 2 -
input1 = 190
input2 = 267
input3 = 853
then, PIN = 9150

<h1>Assignment 6.3</h1>

Given an array A[] of size n, find the most frequent element in the array, i.e. the element which occurs the most number of times. It is assured that at least one element is repeated.

For example:

Input: A[] = {3, 9, 1, 3, 6, 3, 8, 1, 6}

Output: 3

Input: A[] = {1, 9, 1, 3, 2, 3, 10}

Output: 1
