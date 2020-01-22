import javax.sound.midi.*;
public class MusicTest1 {
	
	static void play()
	{
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
			System.out.println("Crash");
		}
		System.out.println("We got a sequencer");
	}
	
	

	public static void main(String[] args) {
		MusicTest1.play();
		int a=10;
		int c=(int)(Math.random()* a);
		System.out.println(c);
		int b=325678989;
	}

}
