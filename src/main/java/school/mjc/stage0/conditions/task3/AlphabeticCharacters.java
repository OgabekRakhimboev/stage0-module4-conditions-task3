package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void main(String [] args){
        vowelDeterminer('4');
    }
    public static void vowelDeterminer(char character) {
        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)){
            if (character == 'A' || character == 'a' || character == 'E' || character == 'e' ||
                    character == 'I' || character == 'i' || character == 'O' || character == 'o' ||
                    character == 'U' || character == 'u'){
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
