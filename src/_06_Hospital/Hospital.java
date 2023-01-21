package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctors.add(doctor);
	}
	
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int intDoc = 0;
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(intDoc).assignPatient(patients.get(i));
			} catch (DoctorFullException dfe) {
				intDoc++;
				i--;
			}
		}
		
		
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}
}
