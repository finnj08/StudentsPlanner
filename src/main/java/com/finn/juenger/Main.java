package com.finn.juenger;

import javax.swing.*;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.jthemedetecor.OsThemeDetector;

public class Main {
    static void main() {
        final OsThemeDetector detector = OsThemeDetector.getDetector();
        IO.println("test");
        final boolean isDarkThemeUsed = detector.isDark();
        if (isDarkThemeUsed) {
            FlatMacDarkLaf.setup();
        } else {
            FlatMacLightLaf.setup();
        }
        SwingUtilities.invokeLater(App::new);
    }
}
