/**
 * ��@�ɶ��O���G
 * ����G<mm/dd>: <00:00>~<00:00>: <00:00>
 * ����G<mm/dd>: <00:00>~<00:00>: <00:00>
 * �{���ؼСG�ϥ�Math.random()�A����0��9���üơA�íp��b����10����A�C�ӼƦr�X�u�����
 * �]�p�W��G�^��occuring times,hitTimes,hit count,hitCnt,iHitCnt,iHitCnts
 * �]�p�Q�k�G���ͤ@�ӯx�}�A�`Ū��10.0�A��0�X�{�����ơA�̦�����
 * �����X�G
 *  
 */

/**
 * @author BoWei
 *
 */
public class T006 {
	public static void main(String [] args){
//		*���ͤ@�ӯx�}�A���׬�10�C0�A��0���X�{���ơA�̦�����		
		int[] iHitCnts = new int[10];
//		*�I�s�ü�10��		
		for (int id = 0; id < 10; id++){
//			*�I�s�ü�1
			int iNum = (int)(10*Math.random());
//			*�̲��ͼƦr�A��s�ӼƦr�X�{����
			iHitCnts[iNum]++;
		}
//		* �̫�A�p��Ʀr�X�{���		
		for (int id = 0; id < iHitCnts.length; id++){
//			* �p��X�Ʀr���			
			double dblPercent = 100.0*(iHitCnts[id] / 10.0);
//			* �L�X			
			System.out.println("�Ʀr:"+id+"�X�{��v:"+dblPercent+"%");
		}
	}
}
