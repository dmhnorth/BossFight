package generators;

import java.util.Random;

public class NameGeneratorSimple implements NameGenerator {

    public static String generateRandomWord() {
        Random random = new Random();
        char[] word = new char[random.nextInt(8)+3];
        for(int j = 0; j < word.length; j++)
        {
            word[j] = (char)('a' + random.nextInt(26));
        }
        return new String(word);
    }

    @Override
    public String getUniqueName() {
        return generateRandomWord();
    }
}
