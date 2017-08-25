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
public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	
	
	
		
	}
	/* (non-Javadoc)
	 * @see Command#undo()
	 */
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
