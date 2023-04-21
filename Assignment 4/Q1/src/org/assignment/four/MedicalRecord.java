package org.assignment.four;

import java.util.Date;

public class MedicalRecord {
	
	Date date;
	
	String doctorName;
	
	String diagnosis;
	
	String treatment;
	
	
	public MedicalRecord() {
		
		this(null, "", "", "");
		
	}

	public MedicalRecord(Date date, String doctorName, String diagnosis, String treatment) {
		this.date = date;
		this.doctorName = doctorName;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	@Override
	public String toString() {
		return String.format("MedicalRecord [date=" + date + ", doctorName=" + doctorName + ", diagnosis=" + diagnosis
				+ ", treatment=" + treatment + "");
	}
	
}
