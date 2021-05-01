package net.md_5.bungee;

public class Bootstrap
{

    public static void main(String[] args) throws Exception
    {
        if ( Float.parseFloat( System.getProperty( "java.class.version" ) ) < 52.0 ) //BotFilter
        {
            System.err.println( "*** ERROR *** BungeeCord-BotFilter requires Java 8 or above to function! Please download and install it!" ); //BotFilter
            System.out.println( "You can check your Java version with the command: java -version" ); //BotFilter
            return;
        }

        BungeeCordLauncher.main( args );
    }
}
