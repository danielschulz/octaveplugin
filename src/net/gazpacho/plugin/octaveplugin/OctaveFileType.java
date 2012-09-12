package net.gazpacho.plugin.octaveplugin;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import icons.OctaveIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class OctaveFileType extends LanguageFileType {
    public static final LanguageFileType OCTAVE_FILE_TYPE = new OctaveFileType();
    public static final Language OCTAVE_LANGUAGE = OCTAVE_FILE_TYPE.getLanguage();
    @NonNls public static final String DEFAULT_EXTENSION = "m";

    private OctaveFileType() {
        super(OctaveLanguage.getInstance());
    }

    @NotNull
    @NonNls
    @Override
    public String getName() {
        return "Octave";
    }

    @NotNull
    @NonNls
    @Override
    public String getDescription() {
        return OctaveBundle.message("octave.files.file.type.description");
    }

    @NotNull
    @NonNls
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public Icon getIcon() {
        return OctaveIcons.iconOctave;
    }
}
