package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor extends Patient {

	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patients.size() == 3) {
			throw new DoctorFullException();
		}
		
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		
		return patients;
	}

	public void doMedicine() {
		
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
}
