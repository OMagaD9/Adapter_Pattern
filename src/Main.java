public class Main {
    public static void main(String[] args) {
        EnglishToMorseCodeTranslator morseCodeTranslator = new EnglishToMorseCodeTranslator();
        ITranslator adapter = new MorseCodeAdapter(morseCodeTranslator);

        String text = "My name is Anton";
        String morseCode = adapter.translate(text);

        System.out.println("Text: " + text);
        System.out.println("Morse Code: " + morseCode);
    }
}
