/**
 * This class has a single method that reads in an object of type UKPlugConnector. UKPlugConnector
 * is an interface and in this method the interface's empty function provideElectricity() is called.
 * 
 */

public class UKElectricalSocket {

    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity();
    }
}
