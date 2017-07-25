
public class Runner3 {
public static void main (String[] args){
		ChineseSpeaker cs = new ChineseSpeaker();
		for (int id = 0; id < 10; id++) {
			cs.speakRandomNum();
		}
		EnglishSpeaker es = new EnglishSpeaker();
		for (int id1 = 0; id1 < 10; id1++) {
			es.speakRandomNum();

	}
}
}
