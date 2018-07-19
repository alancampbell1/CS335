/**
 * This class has one method. This method reads in an object of type GermanPlugConnector,
 * which is an interface, and calls its giveElectricity() method.
 * Note: the giveElectricity() method at this point has no body.
 * 
 */

public class GermanElectricalSocket {

    public void plugIn(GermanPlugConnector plug) {
        plug.giveElectricity();
    }
}

