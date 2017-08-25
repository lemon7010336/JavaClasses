/**
 * ��@�ɶ��O���G
 * ����G<mm/dd>: <00:00>~<00:00>: <00:00>
 * �{���ؼСG
 * �]�p�W��G
 * �]�p�Q�k�G
 * �����X�G
 *  
 */

/**
 * @author BoWei
 *
 */
public class RemoteLoader {
	
	public static void main(String[] args) {
		RemoteControlWithUndo remoteCotrol = new RemoteControlWithUndo();
		
		Light LivingRoomLight = new Light();
		
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(LivingRoomLight);
		LightOffCommand LivingRoomLightOff = 
				new LightOffCommand(LivingRoomLight);
		
		RemoteControlWithUndo remoteControl = null;
		remoteControl.setCommand(0, livingRoomLightOn, LivingRoomLightOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}
