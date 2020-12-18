package org.json.junit.data;

import java.util.ListResourceBundle;

/**
 * A resource bundle class
 */
public class StringsResourceBundle extends ListResourceBundle {
    static final Object[][] contents = {
            {"greetings.hello", "Hello, "},
            {"greetings.world", "World!"},
            {"farewells.later", "Later, "},
            {"farewells.gator", "Alligator!"}
    };

    @Override
    public Object[][] getContents() {
        return contents;
    }
}