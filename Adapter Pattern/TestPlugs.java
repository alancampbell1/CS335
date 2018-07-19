/*
 * This is the main method where two test methods are created and called accordingly.
 * 
 * 
 */
public final class TestPlugs{

	public static void main (String args[]){
		testGermanToUKAdapter();
		testUKToGermanAdapter();
	}


	/*	
	 *	Test Method for testing GermanToUK Adapter.
	 *	- A GermanPlugConnector is created of type ZestPlug() called 'plug'.
	 *	- A UKElectricalSocket is created called 'socket'.
	 *	- A 'UKPlugConnector' object of type 'GermanToUKPlugConnectorAdapter' is created and
	 *	'plug' is passed to it. 
	 *	- The german 'plug' is assigned to a local german plug in 'GermanToUKPlugConnectorAdapter'.
	 *	which is in an object called 'ukAdapter'.
	 *	The UKElectricalSocket object, 'socket', calls its plugIn() method and passes the
	 *	'ukAdapter' object.
	 *	- This causes the 'provideElectricity()' method in 'plugIn()' in 'UKElectricalSocket'
	 *	to be overriden by the one in GermanToUKPlugConnectorAdapter which calls 'giveElectricity'
	 *	
	 *	
	 */
	public static void testGermanToUKAdapter(){
		/* create a germany plug connector (brand: zest) */
		GermanPlugConnector plug = new ZestPlug();
		/* create a UK socket */
		UKElectricalSocket socket = new UKElectricalSocket();
		/* create an adapter */
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plug);
		/* use this adapter in a UK socket */
		socket.plugIn(ukAdapter);
	}

	/*	
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testUKToGermanAdapter(){
		//We have created a UK plug connector of type Furutech
	    UKPlugConnector plug = new Furutech();
	    
	    //We need to create a German Socket
	    GermanElectricalSocket socket = new GermanElectricalSocket();
	    
	    //We want to create an adapter
	    GermanPlugConnector germanAdapter = new UKToGermanPlugConnectorAdapter(plug);
	    
	    //We call the plugIn method from socket.
	    socket.plugIn(germanAdapter);
	}
}