/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：
 * 設計規格：
 * 設計想法：
 * 虛擬碼：
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
