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
public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand(Light light){
		this.light = light;
	}
	public void execute(){
		light.off();
	}
	public void undo() {
		light.on();
	}
}
