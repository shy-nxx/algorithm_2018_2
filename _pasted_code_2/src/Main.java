import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input =Integer.parseInt( br.readLine());
		// System.out.println("Hello Goorm! Your input is " + input);
		int num = Integer.parseInt(br.readLine());
		int posX;
		int posY;
		String who;
		int player1;
		int player2;
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= num; j++){
				String pos = br.readLine();
				System.out.println(pos);
				String[] st = pos.split(" ");
				posX = Integer.parseInt(st[0]);
				posY = Integer.parseInt(st[1]);
				who = st[2];
				
				int a = Math.abs(posX);
				int b = Math.abs(posY);
				
				// System.out.println(a + " " + b);
			}
			 num = Integer.parseInt(br.readLine());
			
		}
		
	}
}