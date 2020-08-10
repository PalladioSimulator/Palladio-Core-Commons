package org.palladiosimulator.commons.stoex.providers;

import java.util.function.Supplier;

import org.palladiosimulator.commons.stoex.parser.antlr.StoexParser;

import com.google.inject.Inject;

public class StoExParserProvider implements Supplier<StoexParser> {

    @Inject
    private StoexParser parser;

    @Override
    public StoexParser get() {
        return parser;
    }

}
