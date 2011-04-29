import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;



/**
 * Will create a new thread and play packets added to the ring buffer and set as ready
 * @author bencall
 *
 */
public class PCMPlayer extends Thread{
	AudioFormat audioFormat;
	Info info;
	SourceDataLine dataLine;
	AudioServer server;
	
	public PCMPlayer(AudioServer server){
		super();
		this.server = server;
	}
	
	public void run(){
		server.getNextFrame();
	}
}
