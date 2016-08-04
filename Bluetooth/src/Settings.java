
public class Settings {

	public static void main(String[] args){
		
	 BluetoothManager bm=	BluetoothManager.getBluetoothManager();
	 bm.turnOn();
	 
	 bm.connectToBluetooth(2);
	 
	 Bluetooth current =bm.getConnectedBluetooth();
	 
	 System.out.println("The connected bluetooth is "+current.name);
	 System.out.println("Strength: "+current.strength);
	 if(current.type==Bluetooth.TYPE_AUDIO){
		 System.out.println("This bluetooth is a Speaker ");
	 } else{

		 System.out.println("The bluetooth is a Mobile phone");
	 }
	 
	 BluetoothSetting.getData();
	 
	 bm.disconnect();
	 
 Bluetooth current1 =bm.getConnectedBluetooth();
	 
	 System.out.println("The connected bluetooth is "+current1.name);
	 System.out.println("Strength: "+current1.strength);
	 if(current1.type==Bluetooth.TYPE_AUDIO){
		 System.out.println("This bluetooth is a Speaker ");
	 } else{

		 System.out.println("The bluetooth is a Mobile phone");
	 }
	 
	}
}
