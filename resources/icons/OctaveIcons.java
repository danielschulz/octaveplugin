package icons;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class OctaveIcons {
    private static Icon load(String path) {
        return IconLoader.getIcon(path, OctaveIcons.class);
    }

    public static final Icon iconOctave = load("/icons/octaveIcon.png");
}
