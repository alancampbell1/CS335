/**
 * This class implements GermanPlugConnector and so must give a body to the giveElectricity() method.
 * It does this by giving a simple print statement.
 * 
 */

public final class ZestPlug implements GermanPlugConnector
{
    public void giveElectricity(){
        System.out.println("giving electricity to a zest plug.");
    }
}