package p0;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String lyrics = "how many roads. must a man walk down before you call him a man how many seas must a white dove sail before she sleeps in the \r\n"
				+ "sand yes and how many times must the cannon balls fly before they're forever banned the answer my friend is blowing in the wind \r\n"
				+ "the answer is blowing in the wind yes and how many years can a mountain exist before it is washed to the sea yes and how many\r\n"
				+ "years can some people exist before they're allowed to be free yes and how many times can a man turn his head and pretend that he \r\n"
				+ "just doesn't see the answer my friend is blowing in the wind the answer is blowing in the wind yes and how many times must a man \r\n"
				+ "look up before he can see the sky yes and how many ears must one man have before he can hear people cry yes and how many \r\n"
				+ "deaths will it take 'till he knows that too many people have died the answer my friend is blowing in the wind the answer is blowing in \r\n"
				+ "the wind";
		
		String[] arr = lyrics.split(" ");
		
		System.out.println(Arrays.toString(arr));
	}

}
