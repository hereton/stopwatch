# Stopwatch tasks by Totsapon menkul (5910545698) (*)
I ran the tasks on a ASUS , and got
these results:

 Task | Time 
 --------------------------------------|-------:
 Append 50,000 chars to String | 2.078236 sec
 Append 100,000 chars to String | 7.181962 sec
 Append 100,000 chars to StringBuilder | 0.009466 sec
 Sum 1,000,000,000 double values from an array | 3.016828 sec
 Sum 1,000,000,000 Double objects from an array | 13.500505 sec
 Sum 1,000,000,000 BigDecimal objects | 22.505741 sec
 
 
## Explanation of Results

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
- Because the added string it will make a copy of sum of a string more 50000 times so the time will take more than 2X.

Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
- Because when StringBuilder added string. It will wait until length of StringBuilder is meet initial maximum of StringBuilder array.
When string is meet initial maximum, StringBuilder will double or triple length of its array. So this is make the string get into memory faster and shorter time.

Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
- The double which is a primitive is the fastest time. Because the number just add in its array. 
  The Double which is an object is in the middle. Because a number when added into a class will have some attributes to process. 
  The BigDecimal is the slowest one. Because BigDecimal class make a number perfectly accurate so this will take a long long time 
  to process.
