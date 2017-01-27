# Stopwatch tasks by Totsapon menkul (5910545698) (*)
I ran the tasks on a ASUS , and got
these results:

 Task | Time 
 --------------------------------------|-------:
 Append 50,000 chars to String | 2.149479 sec
 Append 100,000 chars to String | 7.411963 sec
 Append 100,000 chars to StringBuilder | 0.011174 sec
 Sum 1,000,000,000 double values from an array | 2.342651 sec
 Sum 1,000,000,000 Double objects from an array | 11.148502 sec
 Sum 1,000,000,000 BigDecimal objects | 24.004937 sec
## Explanation of Results

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
- Because there are memory that contain data before appending another 100,000 chars, the data in memory will get bigger and bigger to append. So it will take longer time than small data.

Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
- Because when StringBuilder adding a char. It will wait until length of char is meet initial maximum of StringBuilder array.
When a char length is more than initial maximum array, StringBuilder will double length of its array when a char length is reach to the maximum array again StringBuilder will double length of its array again. So StringBuilder does not need to create a new array one by one. This process will get much faster than appending to String.

Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
- The double which is a primitive is the fastest time. Because the number just add in its array. 
  The Double which is an object is in the middle. Because a number when added into a class will have some attributes to process. 
  The BigDecimal is the slowest one. Because BigDecimal class make a number perfectly accurate so this will take a long long time 
  to process.
