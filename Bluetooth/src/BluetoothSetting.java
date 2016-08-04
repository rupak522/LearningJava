
public class BluetoothSetting {

	public static void getData(){
		BluetoothManager bm=BluetoothManager.getBluetoothManager();
		System.out.println("The connected bluetooth is "+bm.getConnectedBluetooth().name);
	}
}
