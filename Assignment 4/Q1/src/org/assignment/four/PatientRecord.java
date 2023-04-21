package org.assignment.four;

import java.util.Date;

public class PatientRecord {
	
	Patient patient = new Patient();
	
	MedicalRecord []medicalrecords = new MedicalRecord [20];
	
	public void PrintRecord() {
	
		medicalrecords[0] = new MedicalRecord(new Date(2024, 11, 21), "Cletus Dsouza", "Cancer", "Chemo");
		medicalrecords[1] = new MedicalRecord(new Date(2023, 9, 27), "Cletus Dsouza", "Cancer", "Chemo");
		medicalrecords[2] = new MedicalRecord(new Date(2023, 9, 27), "Cletus Dsouza", "Cancer", "Chemo");
		medicalrecords[3] = new MedicalRecord(new Date(2023, 9, 27), "Cletus Dsouza", "Cancer", "Chemo");
		medicalrecords[4] = new MedicalRecord(new Date(2023, 9, 27), "Cletus Dsouza", "Cancer", "Chemo");


}}