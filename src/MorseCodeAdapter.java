class MorseCodeAdapter implements ITranslator {
    private EnglishToMorseCodeTranslator morseCodeTranslator;

    public MorseCodeAdapter(EnglishToMorseCodeTranslator morseCodeTranslator) {
        this.morseCodeTranslator = morseCodeTranslator;
    }

    @Override
    public String translate(String text) {
        return morseCodeTranslator.translateToMorseCode(text);
    }
}

