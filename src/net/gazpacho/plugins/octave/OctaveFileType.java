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

package net.gazpacho.plugins.octave;

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
