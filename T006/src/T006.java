/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：使用Math.random()，產生0到9的亂數，並計算在執行10次後，每個數字出線的比例
 * 設計規格：英文occuring times,hitTimes,hit count,hitCnt,iHitCnt,iHitCnts
 * 設計想法：產生一個矩陣，常讀為10.0，放0出現的次數，依此類推
 * 虛擬碼：
 *  
 */

/**
 * @author BoWei
 *
 */
public class T006 {
	public static void main(String [] args){
//		*產生一個矩陣，長度為10。0，放0的出現次數，依此類推		
		int[] iHitCnts = new int[10];
//		*呼叫亂數10次		
		for (int id = 0; id < 10; id++){
//			*呼叫亂數1
			int iNum = (int)(10*Math.random());
//			*依產生數字，更新該數字出現次數
			iHitCnts[iNum]++;
		}
//		* 最後，計算數字出現比例		
		for (int id = 0; id < iHitCnts.length; id++){
//			* 計算出數字比例			
			double dblPercent = 100.0*(iHitCnts[id] / 10.0);
//			* 印出			
			System.out.println("數字:"+id+"出現比率:"+dblPercent+"%");
		}
	}
}
