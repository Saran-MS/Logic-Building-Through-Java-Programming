<h1>Assignment 4.1</h1>

Is Palindrome Number?

Write a function to find whether the given number N is a palindrome.

A palindrome number is one that reads the same backwards as well as forwards. For example 252,18981,5005 are examples of palindrome numbers.

The number will be passed to the function as an input parameter of type int. If the number is palindrome, the function should return 2, else it should return 1.

Assumption: The input number will be a positive integer number>=1 and <=25000.

Sample Input : 252

Output :Palindrome

Sample Input : 503

Output : Not a palindrome

<h1>Assignment 4.2</h1>

Is palindrome possible?

Write a function to find whether it is possible to get a palindrome number from a given number by re-arranging the positions of its digits. If yes, the function should return 2, else it must return 1.

Example 1: If the given number is 21251, it is possible to form a palindrome by re-arranging its digits, as 21512 or 12521. So the function must return 2.

Example 2: If the given number is 2125, it is not possible to from a palindrome by re-arranging its digits. So the function must return 1.

Note: All digits of the given number should be retained while deciding whether they can together form a palindrome.

Assumption: The input number will be a positive integer number >=1 and 25000.

Sample input :21251

output: 2

Sample input :2125

output:1

<h1>Assignment 4.3</h1>

Weight of a Hill pattern:

Given,
the total levels in a hill pattern (input1),
the weight of the head level (input2), and
the weight increments of each subsequent level (input3),
you are expected to find the total weight of the hill pattern.
"Total levels" represents the number of rows in the pattern.
"Head level" represents the first row.
Weight of a level represents the value of each star (asterisk) in that row. 
The hill patterns will always be of the below format, starting with 1 star at head level and increasing 1 star at each level till level N.

*
**
***
****
*****
******
. . .and so on till level N
Let us see a couple of examples.
Example1 -
Given,
the total levels in the hill pattern = 5 (i.e. with 5 rows)
the weight of the head level (first row) = 10
the weight increments of each subsequent level = 2
Then, The total weight of the hill pattern will be calculated as = 10 + (12+12) + (14+14+14) + (16+16+16+16) + (18+18+18+18+18) = 10 + 24 + 42 + 64 + 90 = 230
Example2 -
Given,
the total levels in the hill pattern = 4
the weight of the head level = 1
the weight increments of each subsequent level = 5
Then, Total weight of the hill pattern will be = 1 + (6+6) + (11+11+11) + (16+16+16+16) = 1 + 12 + 33 + 64 = 110

<h1>Assignment 4.4</h1>

Sum of Sums of Digits in Cyclic order:

Alex has been asked by his teacher to do an assignment on sums of digits of a number. The assignment requires Alex to find the sum of sums of digits of a given number, as per the method mentioned below.

If the given number is 582109, the Sum of Sums of Digits will be calculated as =
= (5 + 8 + 2 + 1 + 0 + 9) + (8 + 2 + 1 + 0 + 9) + (2 + 1 + 0 + 9) + (1 + 0 + 9) + (0 + 9) + (9)
= 25 + 20 + 12 + 10 + 9 + 9 = 85

Alex contacts you to help him write a program for finding the Sum of Sums of Digits for any given number, using the above method.

Help Alex by completing the login in the given function sumOfSumsOfDigits which takes as input an integer input1 representing the given number.
The function is expected to return the "Sum of Sums of Digits" of input1.

Assumptions: For this assignment, let us assume that the given number will always contain more than 1 digit, i.e. the given number will always be >9.

Sample input : 582109

output : 85

Sample input: 9654

ouput: 52

