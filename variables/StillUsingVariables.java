package week1.variables;

import java.sql.SQLOutput;

public class StillUsingVariables {
    public static void main(String[] args) {
        String fullName = "Kosei Takahashi";
        int graduate = 2010;

        String result = String.format("My name is %s and I'll graduate in %d.", fullName, graduate);
        System.out.println(result);
    }
}
