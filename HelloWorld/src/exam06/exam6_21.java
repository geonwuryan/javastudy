package exam06;
public class exam6_21 {
	
}

class Mytv{
	boolean isPowerOn;
	int		channel;
	int		volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHAANEL = 100;
	
	void trunOnOff() {
		isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		if(volume<MAX_VOLUME)
			volume++;
		
	}
	void volumDown() {
		if(volume>MIN_VOLUME)
			volume--;
		
	}
	void channelUp() {
		if(channel == MAX_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel++;
		}
		
	}
	void channelDown() {
		if (channel == MIN_CHAANEL) {
			channel = MAX_CHANNEL;
		}else {
			channel--;
		}
		
	}
}

class Exercise6_21 {
	 public static void main (String[] args) {
			Mytv t = new Mytv();	
			
			t.channel = 100;
			t.volume = 0;
			System.out.println("CH :" + t.channel+", VOL :"+t.volume);
			
			t.channelDown();
			t.volumDown();
			System.out.println("CH :" + t.channel+", VOL :"+t.volume);
			
			t.volume = 100;
			t.channelUp();
			t.volumeUp();
			System.out.println("CH :" + t.channel+", VOL :"+t.volume);
		}
}
