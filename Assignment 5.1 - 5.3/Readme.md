<h1>Assignment 5.1</h1>

Most frequent digit:

You need to find which digit occurs most number of times across the four given input numbers.

The prototype of the function is:

int MostFrequentDigit(int input1,int input2,int input3,int input4);

where input1,input2,input3 and input4 are the four given input numbers.The function is expected to find and return the most frequent digit.

Example 1:

If input1=123,input2=234,input3=345,input4=673

We see that across these four numbers,

1,5,6 and 7 occur once,

2 and 4 occur twice,

3 occurs four times.

Therefore, 3 is the most frequent digit and so the function must return 3.



Sample Input:

123

234

345

673

Output:

3

<h1>Assignment 5.2</h1>

Simple Encoded Array:
Maya has stored few confidential numbers in an array (array of int). To ensure that others do not find the numbers easily, she has applied a simple encoding.
Encoding used : Each array element has been substituted with a value that is the sum of its original value and its succeeding element’s value.
i.e. arr[i] = original value of ​arr[i] + original value of ​arr[i+1]
e.g. value in arr[0] = original value of arr[0] + original value of arr[1]
Also note that value of last element i.e. arr[last index] remains unchanged.
For example, 
If the encoded array is {7,6,8,16,12,3}
The original array should have been {2,5,1,7,9,3}
Provided the encoded array, you are expected to find the –
First number (value in index 0) in the original array
Sum of all numbers in the original array
Write the logic in the function  findOriginalFirstAndSum(int[] input1, int input2);
where, 
input1 represents the encoded array, and 
input2 represents the number of elements in the array input1
The method is expected to –
find the value of the first number of the original array and store it in the member output1 and
find the sum of all numbers in the original array and store it in the member output2
Note that the output1 and output2 should be returned as -
- members of a Result object (if the code is being written in Java, C# or C++)
- members of a Result struct  (if the code is being written in C)
Assumption: The array elements can be positive and/or negative numbers
Example 1:
If the encoded array is {7,6,8,16,12,3}
The Original array should have been {2,5,1,7,9,3}
So, First number in original array = 2
Sum of all numbers in original array = 27
Example 2:
If the encoded array is {-2,-7,-12,-15}
The Original array should have been {8,-10,3,-15}
So, First number in original array = 8
Sum of all numbers in original array = -1

Sample input:

EncodedArray  :7,6,8,16,12,3

Array size :5

Output:

a[0] : 2

Sum: 27

<h1>Assignment 5.3</h1>

Decreasing sequence:
Given an integer array, find the number of decreasing sequences in the array and the length of its longest decreasing sequence.
You are expected to complete the logic within the given function, 
where, 
input1 represents the integer array and,
input2 represents the number of elements in the integer array
The function should set the  output1 variable to the number of decreasing sequences in the array, and set the  output2 variable to the length of the longest decreasing sequence in the array.
Example 1: 
If  input1[ ] = {11,3,1,4,7,8,12,2,3,7} 
and  input2 = 10
output1 should be 2
output2 should be 3
Explanation: 
In the given array  input1, the decreasing sequences are “11,3,1” and “12,2”, i.e. there are two decreasing sequences in the array, and so  output1 is assigned  2. The first sequence i.e. “11,3,1” is the longer one containing  three items, when compared to the second sequence “12,2” which contains 2 items. So, the length of the longest decreasing sequence  output2 =  3.
Example 2: 
If  input1[ ] = {9} 
and  input2 = 1
output1 should be 0
output2 should be 0
Example 3: 
If  input1[ ] = {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5} 
and  input2 = 20
output1 should be 3
output2 should be 6


Sample input:
11,3,1,4,7,8,12,2,3,7
10
Output1: 2
Output2:3