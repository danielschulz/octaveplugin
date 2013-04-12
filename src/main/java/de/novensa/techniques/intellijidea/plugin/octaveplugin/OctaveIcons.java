/*
 * Copyright (C) 2012 Tom Conder.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.novensa.techniques.intellijidea.plugin.octaveplugin;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * This class delivers all icons needed throughout the entire plugin. Up to now this is one.
 *
 * @author Tom Conder, Daniel Schulz
 */
public class OctaveIcons {

    public static final String ICONS_PATH = "/icons/";
    public static final String OCTAVE_PLUGIN_ICON_FILE_NAME = "octaveIcon.png";


    /**
     * Load an icon from a given path and label it <code>OctaveIcon</code> class.
     *
     * @param path The path the icon is found at
     * @return The icon in an <code>Icon</code> class
     */
    private static Icon load(final String path) {
        return IconLoader.getIcon(path, OctaveIcons.class);
    }

    /**
     * The standard icon path
     */
    public static final Icon octaveIcon = load(ICONS_PATH + OCTAVE_PLUGIN_ICON_FILE_NAME);
}
