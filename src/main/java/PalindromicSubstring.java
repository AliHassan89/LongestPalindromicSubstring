/**

 Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example:

 Input: "babad"

 Output: "bab"

 Note: "aba" is also a valid answer.


 Example:

 Input: "cbbd"

 Output: "bb"
 */

package main.java;

public class PalindromicSubstring {

  int maxLen, lo;

  public String longestPalindrome(String s) {
    int len = s.length();
    if (len < 2)
      return s;

    String longest = "";

    for (int i=0; i<len-1; i++)
    {
      extendPalindrome(s, i, i);
      extendPalindrome(s, i, i+1);
    }

    return s.substring(lo, lo + maxLen);
  }

  private void extendPalindrome(String s, int i, int j)
  {
    while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
      i--;
      j++;
    }

    if (maxLen < j - i)
    {
      maxLen = j-i-1;
      lo = i + 1;
    }
  }

}
