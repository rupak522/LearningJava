import java.util.ArrayList;

public class BluetoothManager {

	ArrayList<Bluetooth> bluetooths=new ArrayList<Bluetooth>();
	Bluetooth connectedBluetooth;
	boolean isConnected=false,
			isTurnOn=false;

	private static BluetoothManager bm;
	
	public static BluetoothManager getBluetoothManager(){
		if(bm==null)
			bm=new BluetoothManager();
		return bm;
	}
	
	public void addBluetoothDataFromHardware(){
		//code to add bluetooth information for the hardware
		//......
		//......
		bluetooths.clear();

		Bluetooth b1=new Bluetooth();
		b1.name="Bikram";
		b1.strength=50;
		b1.type=Bluetooth.TYPE_AUDIO;
		
		bluetooths.add(b1);
		
		Bluetooth b2=new Bluetooth();
		b2.name="BOB";
		b2.strength=50;
		b2.type=Bluetooth.TYPE_TRANSFER;
		
		bluetooths.add(b2);

		Bluetooth b3=new Bluetooth();
		b3.name="RAME";
		b3.strength=50;
		b3.type=Bluetooth.TYPE_AUDIO;
		
		bluetooths.add(b3);

		Bluetooth b4=new Bluetooth();
		b4.name="DevRaj";
		b4.strength=50;
		b4.type=Bluetooth.TYPE_TRANSFER;
		
		bluetooths.add(b4);
		
	}
	
	public void turnOn(){
		isTurnOn=true;
		addBluetoothDataFromHardware();
	}
	public void tunOff(){
		isTurnOn=false;
	}
	public Bluetooth getBluetoothAt(int index){
		return bluetooths.get(index);
	}
	public Bluetooth getConnectedBluetooth(){
		return connectedBluetooth;
	}
	
	public void connectToBluetooth(Bluetooth toBeConnected){
		this.connectedBluetooth=toBeConnected;
		isConnected=true;
	}
	public void connectToBluetooth(int index){
		connectedBluetooth=bluetooths.get(index);
		isConnected=true;
	}
	public void disconnect(){
		if(isConnected==true){
			isConnected=false;
			connectedBluetooth=null;
		}else
			throw new NullPointerException("No  bluetooth connected");
	}
	
	public void searchBluetooth(){
		addBluetoothDataFromHardware();
	}
	
	public void trunOffBluetooth(){
		isConnected=false;
		isTurnOn=false;
		connectedBluetooth=null;
	}
	
}
