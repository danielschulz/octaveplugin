package net.gazpacho.plugin.octaveplugin;

import com.intellij.lang.Language;

public class OctaveLanguage extends Language {
    private static final OctaveLanguage INSTANCE = new OctaveLanguage();

    private OctaveLanguage() {
        super("Octave");
    }

    public static OctaveLanguage getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
