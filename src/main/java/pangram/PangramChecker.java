package pangram;

public class PangramChecker {

    public boolean isPangram(String input) {
        //Make everything uppercase
        input = input.toUpperCase();

        //Check if each letter A-Z appear in the input string
        for (char a = 'A'; a <= 'Z'; a++) {
            if (input.indexOf(a) < 0) {
                return false;
            }
        }
        return true;
    }
}
