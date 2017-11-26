/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author студент
 */
//public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
   /*public static void main(String[] args) {
        Pattern p1 = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        Matcher m1 = p1.matcher( "aE:dC:cA:56:76:54" );
        boolean b = m1.matches();
        System.out.println(b);
        
    }
    
} */
/*
import java.util.regex.*;
public class JavaApplication2 {
public static void main(String[] args) {
// проверка на соответствие строки шаблону
Pattern p1 = Pattern.compile("a*y");
Matcher m1 = p1.matcher( "aaay" );
boolean b = m1.matches();
System.out.println(b);
// поиск и выбор подстроки, заданной шаблоном
String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*" ;
String s = "адреса эл.почты: mymail@tut.by и rom@bsu.by";
Pattern p2 = Pattern. compile (regex);
Matcher m2 = p2.matcher(s);
while (m2.find()) {
System.out.println("e-mail: " + m2.group());
}
// разбиение строки на подстроки с применением шаблона в качестве
// разделителя
Pattern p3 = Pattern.compile("\\d+\\s?");
String[] words = p3.split("java5tiger 77 java6mustang");
for (String word : words)
System.out.println(word);
}
}
*/

import java.util.regex.*;
public class JavaApplication2 {
public static void main(String[] args) {
String input = "abdcxyz";
myMatches("([a-z]*)([a-z]+)", input);
myMatches("([a-z]?)([a-z]+)", input);
myMatches("([a-z]+)([a-z]*)", input);
myMatches("([a-z]?)([a-z]?)", input);
}
public static void myMatches(String regex,
String input) {
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);
if(matcher.matches()) {
System.out.println("First group: "
+ matcher.group(1));
System.out.println("Second group: "
+ matcher.group(2));
} else
System.out.println("nothing");
System.out.println();
}} 

