/**
 * This class implements the GermanPlugConnector (which has a single method called giveElectricity()).
 * It also creates an object of type UKPlugConnector (another interface) called plug.
 * This class has a constructor that reads in an object of type UKPlugConnector and sets it 
 * accordingly to the private object.
 * @Override means the method is overriding the parent class.
 * 
 * 
 */
public class UKToGermanPlugConnectorAdapter implements GermanPlugConnector{
	
	private UKPlugConnector plug;
	
	public UKToGermanPlugConnectorAdapter(UKPlugConnector plug){
		this.plug = plug;
	}
	
	@Override
	public void giveElectricity(){
		plug.provideElectricity();
	}

}