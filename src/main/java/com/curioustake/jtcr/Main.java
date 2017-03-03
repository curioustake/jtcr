package com.curioustake.jtcr;

import com.curioustake.jtcr.ch1.Ch1Main;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Begin executing " + Main.class.getSimpleName());

        final String kickOff = args[0];
        System.out.println( "Kick off [" + kickOff + "]");

        switch (kickOff) {
            case "Ch1Main":Ch1Main.enact(args);break;
            default:
                System.out.println("WTF are you trying to do!!!");
        }
    }
}
