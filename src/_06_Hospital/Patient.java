package _06_Hospital;

public class Patient {

	
	Boolean happy = false;
	public void checkPulse(){
		happy = true;

    }

	public boolean feelsCaredFor() {
		
		if (happy) {
			return true;
		}
		
		return false;
	}
}
