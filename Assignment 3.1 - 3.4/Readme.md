<h1>Assignment 3.1</h1>

All digits Count:

Write a function to find the count of ALL digits in a given number N. the number will be passed to the function as an input of type int.

Assumption: The input number will be a positive integer >=1 and <=25000.

For example:

if the given number is 292, the function should return 3 because there are 3 digits in this number.

if the given number is 1015, the function should return 4 because there are 4 digits in this 

<h1>Assignment 3.2</h1>

Unique Digits Count

Write a function to find the count of unique digits in a given number N. The number will be passed to the function as an input parameter of type int.

Assumption: The input number will be positive integer number >=1 and <=25000.

For example:

If the given number is 292, the function should return 2 because there are are only 2 unique digits 2 and 9 in this number.

If the given number is 1015, the function should return 3 because there are are only 3 unique digits 1,0 and 5 in this number.

<h1>Assignment 3.3</h1>

digitSum:

the lables on a traders boxes display a large number(integer). The trader wants to label the boxes with a single digit ranging from 1 to 9. he decides to perform digit sum on this large number, continuously till he gets a single digit number.

NOTE: In maths, the "digit sum" of a given number is the sum of all its digits,(Example: the digit sum of 84001 is calculated  as 8+4+0+0+1=13, teh digit sum of 13 is 1+3=4)

Write a function that takes as input a large number and returns a single digit by performing continuous digitSum on this number and on the resulting numbers, till the resulting number is a single digit number in the range 1 to 9.

Example 1: If the large number whose single-digit digitSum is to be found is 976592, the process is as below-

9+7+6+5+9+2=38

3+8=11

1+1=2

So output =2.

NOTE: For negative numbers, the result should also be in negative.

Example 2: If the large number whose single-digit digitSum is to be found is -123456, the process is as below-

 1+2+3+4+5+6=21

2+1=3

So output= -3.

<h1>Assignment 3.4</h1>

Even or Odd Digits sum:

In maths, the "digitSum" of a given number is the sum of all its digits, Examplethe digit sum of 84001 is calculated as 8+4+0+0+1=13.

the digit sum of 158is 1+5+8=14.

Rohan's teacher has asked him to write a function that takes as input a positive number and performs digitSum of either only the even digits or only the odd digits in the given number, based on the option "even" or "odd".

The function will take two parameters,

- the first parameter will be an integer number representing the number whose digitSum needs to be found.

-the second parameter will be a string representing the option, which will be either "even" or "odd".

Example 1: If the given number is 9625, and the option is "odd",we must add only the odd digits i.e 9+5=14.

Example 2: If the given number is 2134, and the option is "even",we must add only the even digits i.e 2+4=6.

Assumptions:

The input number(input1) will be a positive integer number>=1 and <=25000.

The input string(input2) will always be either "even" or "odd".


