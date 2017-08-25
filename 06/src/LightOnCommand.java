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
