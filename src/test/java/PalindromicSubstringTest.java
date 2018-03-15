package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import main.java.PalindromicSubstring;
import org.junit.Test;

public class PalindromicSubstringTest {

  PalindromicSubstring palindromicSubstring = new PalindromicSubstring();

  @Test
  public void longestPalindrome_shouldTestEmptyString(){
    //given
    String palindrome = "";

    //when
    String s = palindromicSubstring.longestPalindrome("");

    //then
    assertThat(s, equalTo(palindrome));

  }

  @Test
  public void longestPalindrome_shouldTestSingleCharPalindrome(){
    //given
    String palindrome = "y";
    String source = "abcdefghijklmnopqrstuvwxyz";

    //when
    String s = palindromicSubstring.longestPalindrome(source);

    //then
    assertThat(s, equalTo(palindrome));
  }

  @Test
  public void longestPalindrome_shouldTestMultipleCharPalindrome(){
    //given
    String palindrome = "abba";
    String source = "abcdefababbacdef";

    //when
    String s = palindromicSubstring.longestPalindrome(source);

    //then
    assertThat(s, equalTo(palindrome));
  }
}
