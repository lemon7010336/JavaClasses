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
