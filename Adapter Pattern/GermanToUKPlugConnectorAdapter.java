/**
 * This is a class that implements the UKPlugConnector interface. 
 * It creates a local GermanPlugConnector object called plug.
 * It has a constructor that reads in an object of type GermanPlugConnector and assigns it
 * to the local one.
 * It has implemented the provideElectricity() method from the interface but in its body, it
 * calls the giveElectricity() method implemented in the GermanPlugConnector.
 * 
 * 
 */
public class GermanToUKPlugConnectorAdapter implements UKPlugConnector {

    private GermanPlugConnector plug;

    public GermanToUKPlugConnectorAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }

}
