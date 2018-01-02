package cz.viktr.libraries.gp.core;

import org.gedcom4j.exception.GedcomParserException;
import org.gedcom4j.parser.GedcomParser;

import java.io.IOException;

/**
 * Created by krejc on 1. 1. 2018.
 */
public class GParser {

    public static void parse(String path){
        GedcomParser gp = new GedcomParser();
        try {
            gp.load(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GedcomParserException e) {
            e.printStackTrace();
        }
    }
}
