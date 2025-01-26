package programs.string;

import static java.lang.System.out;

public class CharactersASCII {
    public static void main(String[] args) {

        out.println("The character for ASCII value 0-31 is : \u0001");
        out.println("The character for ASCII value 0-31 is :  ");

        int asciiValue = 33;
        char ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch + ". First ASCII value is 33."); // !

        asciiValue = 34;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // "

        asciiValue = 35;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // #

        asciiValue = 36;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 37;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 38;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 39;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 40;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 41;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 42;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 43;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 44;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 45;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 46;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 47;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //
        out.println("  ");

        asciiValue = 48;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // 0

        asciiValue = 57;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // 9
        out.println("  ");

        asciiValue = 58;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 59;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 60;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 61;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 62;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 63;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //

        asciiValue = 64;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); //
        out.println("  ");

        ch = 'A';
        asciiValue = ch;
        out.println("The ASCII value of " + ch + " is : " + asciiValue); // 65

        ch = 'Z';
        asciiValue = ch;
        out.println("The ASCII value of " + ch + " is : " + asciiValue); // 90
        out.println("  ");

        asciiValue = 91;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // [

        asciiValue = 92;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // \

        asciiValue = 93;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // ]

        asciiValue = 94;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // ^

        asciiValue = 95;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // _

        asciiValue = 96;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // `
        out.println("  ");

        ch = 'a';
        asciiValue = ch;
        out.println("The ASCII value of " + ch + " is : " + asciiValue); // 97

        ch = 'z';
        asciiValue = ch;
        out.println("The ASCII value of " + ch + " is : " + asciiValue); // 122
        out.println("  ");

        asciiValue = 123;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // {

        asciiValue = 124;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // |

        asciiValue = 125;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch); // }

        asciiValue = 126;
        ch = (char) asciiValue;
        out.println("The character for ASCII value " + asciiValue + " is : " + ch + " Last ASCII value is 126."); // ~
        out.println("  ");

        out.println("If we Print only one Character we get Character : ");
        out.println('a');
        out.println("If we Print one Character after String we get Character after String : ");
        out.println("String : " + 'a');
        out.println("If we Print more than one Character with String gives String : ");
        out.println("String : " + 'a' + 'b');
        out.println("If we Print more than one Character without String gives ASCII value : ");
        out.println('a' + 'b');
        out.println("  ");

        out.println("If we Print Character with Integer we get ASCII value : ");
        out.println('a');
        out.println(10 + 'a');

    }
}
