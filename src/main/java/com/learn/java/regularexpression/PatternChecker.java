package com.learn.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//regular expression is a pattern used for searching and manipulating strings
public class PatternChecker {

    public static void main(String[] args) {
        String pattern = "[a-z]+"; //character from a - z, matches one or more consecutive lowercase characters.
        String stringToCheck = "Happy Learning !!";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(stringToCheck);
        while (matcher.find()) {
            System.out.println(stringToCheck.substring(matcher.start(), matcher.end()));
        }

        String sentence = "I will be in the office in 15 minutes";
        // match all words "in"
        Pattern pattern2 = Pattern.compile("\\bin\\b");
        Matcher matcher2 = pattern2.matcher(sentence);
        while (matcher2.find()) {
            System.out.println("Pattern matches: " + matcher2.group() + " at " + matcher2.start());
        }

    }
}
