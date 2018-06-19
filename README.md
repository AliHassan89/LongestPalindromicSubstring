# LongestPalindromicSubstring
The following problem is taken from www.leetcode.com

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example:

 Input: "babad"

 Output: "bab"

 Note: "aba" is also a valid answer.


 Example:

 Input: "cbbd"

 Output: "bb"

# Solution:

1. We receive a string as function parameter. The task is to calculate longest palindromic subString.

2. We can do it by starting from any character in the string and going right and left checking if the character on right is equal to the character on the left. However, there is an edge case. Since we will be starting the loop from 0th index and going until len-1 index we can sometimes end up in a situation where last two characters of the string only form palindrome. We will cover this edge case by calling helper function twice by incrementing in i.

3. Loop through the string starting from 0th location until i-1 location.

4. In the loop call a helper function passing in original string, i and j. </br>
extendPalindrome(s, i, i);</br>

5. In order to cover the edge case mentioned above we will call the extendPalindrome function once more this time by incrementing value of j.</br>
extendPalindrome(s, i, i+1);</br>

6. The helper function </br>
void extendPalindrome(String s, int i, int j) </br>
will loop through the string by decrementing the ith value and incrementing the jth value until it finds that string[i] != string[j].

7. As soon as a mismatch is found it is checked if j-i is greater than maxLen which was initialized to Integer.MIN_VALUE. Then maxLen is updated and a new variable call it lo is updated with value of i+1.</br>
lo = i + 1

8. Lastly substring is returned s.substring(lo, lo + maxLen);
