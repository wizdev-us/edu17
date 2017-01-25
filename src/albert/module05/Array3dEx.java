package albert.module05;

public class Array3dEx {
	public static void main(String[] args) throws Exception {

		String[] company = new String[] { new String("YG"), new String("SM"), new String("JYP") };

		String[][] singer = {
		        { new String("2ne1"), new String("빅뱅"), new String("세븐") },
		        { new String("샤이니"), new String("보아"), new String("소녀시대") },
		        { new String("원더걸스"), new String("미쓰에이"), new String("2PM") }
		};

		String[][][] song = new String[][][] {
		        { { new String("박수쳐"), new String("Go away"), new String("아파") },
		                { new String("마지막 인사"), new String("거짓말"), new String("바보") },
		                { new String("와줘"), new String("아쉬운 이별"), new String("너이길 바래") } },

		        { { new String("루시퍼"), new String("샤방샤방"), new String("조조") },
		                { new String("사라"), new String("걸스온탑"), new String("마이네임") },
		                { new String("훗"), new String("Gee"), new String("소원을 말해봐") } },

		        { { new String("텔미"), new String("노바디"), new String("쏘핫") },
		                { new String("배드걸 굿걸"), new String("Breathe"), new String("러브어게인") },
		                { new String("I'll be back"), new String("Heartbeat"), new String("Without you") } }
		};

		for (int i = 0; i < company.length; i++) {
			System.out.println(company[i]);
			for (int j = 0; j < singer.length; j++) {
				System.out.print(singer[i][j] + ": ");
				for (int k = 0; k < song[i][j].length; k++) {
					if (k != 2) {
						System.out.print(song[i][j][k] + ", ");
					} else {
						System.out.println(song[i][j][k]);
					}
				}
			}
		}
	}
}
