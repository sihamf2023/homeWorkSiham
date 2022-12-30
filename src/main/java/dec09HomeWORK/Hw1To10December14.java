package dec09HomeWORK;

public class Hw1To10December14 {
    //1- Given a string, return a new string made of 3 copies
    // of the last 2 chars of the original string.
    // The string length will be at least 2.
    //Examples :
    //"Clarusway" → "ayayay"
    //"Florida" → "dadada"
    //"Hi" → "HiHiHi"
    public static void main(String[] args) {
        String str = "Clarusway";
        String s = str.substring(str.length() - 2, str.length());
        System.out.println(s + s + s);

        // 2- Given a string, return true if it’s ending with ‘a’.
        // Otherwise return false. The string length will be at least 2.
        //Examples :
        //Apple –> false
        //Canada –> true
        String str1 = "Morocco";
        System.out.println(str1.endsWith("a"));

        //3- Given a string, return the first index number of ‘a’.
        // If there is no ‘a’ return -1.
        //Examples :
        //“Washington” → 1
        String str2 = "Washingthon";
        if (str2.contains("a"))
            System.out.println(str2.indexOf("a"));
        else {
            System.out.println(-1);
        }
        ;

        /** for (int i =0 ; i < str2.length()-1; i++) {
         if (str2.charAt(i) == str2.charAt('a')) {
         System.out.println(i);}
         else if (str2.charAt(i) != str2.charAt('a')) {
         System.out.println(-1);
         }

         }*/
        //4- Given a string, replace all is with was.
        //Examples :
        //“My name is Rajendra. My name is lamror.My name is Technolamror.
        // " → “My name was Rajendra. My name was lamror. My name was Technolamror."

        String str4 = "My name is Rajendra. My name is lamror.My name is Technolamror ";
        System.out.println(str4.replaceAll("is", "was"));

        //5- Given a string, remove the spaces between words.
        //Examples :
        //“My name is Arthur. I am 20 years old.” →”MynameisArthur.Iam20yearsold.”
        String str5 = "My name is Arthur. I am 20 years old.";
        System.out.println(str5.replaceAll(" ", ""));

        //6- Given a string, split it from ‘:’ and return the new string. If there is no ‘:’ return “There is no ‘:’ in the string”.
        //Examples :
        //“Name : Daniel” → “NameDaniel”
        //“My name is Deniel” → “There is no ‘:’ in the string”

        String newStr1 = "Name : Daniel";
        String newStr = "My name is Daniel";
        boolean hasI = false;
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == ':') {
                hasI = true;
                String[] result1 = newStr.split(":");
                for (int k = 0; k <= result1.length - 1; k++) {
                    System.out.print(result1[k].trim());
                }
            }
        }
        if (!hasI) System.out.println("There is no ':' in the string");


        //7- Given a string, return the new string after converting all char
        // in string lower case.
        //Examples :
        //“New York City” → “new york city”

        String str7 = "New York City";
        System.out.println(str7.toLowerCase());

        //8- Given a string, return the new string after converting all char in string UPPER case.
        //Examples :
        //“New York City” → “NEW YORK CITY”
        String str8 = "New York City";
        System.out.println(str8.toUpperCase());

        //9- Given a string, return the length of the string.
        //Examples :
        //“Clarusway SDET Course” → “The String length is 22”
        //“New York” → The String length is 8”

        String str9 = "Clarusway SDET Course";
        System.out.println("the string length is :" + str9.length());

        //10- Given 3 or 4 strings, return the new string after concatenation.
        //Examples :
        //New
        //York
        //City
        //→ “New York City”
        //My
        //Name
        //Is
        //Alex
        //→ “My name is Alex”

        String str10 = "New ";
        String str11 = "York ";
        String str12 = "City";
        System.out.println(str10 + str11 + str12);
        System.out.println(str10.concat(str11.concat(str12)));
    }

}


