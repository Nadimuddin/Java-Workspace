package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.main.Doctor;
import com.bridgelabz.main.Patient;
class DPSystem
{
	Utility u = new Utility();
	Patient patient = new Patient();
	Doctor doctor = new Doctor();
	public void doctorSystem(int option)throws Exception
	{
		patient.patient();
		String patArray[];
		int i,index;
		switch(option)
		{
			case 1:
			System.out.println("Enter patient's's name/id/Mobile to search");
			index = patient.searchPatient(u.getStringInput());
			if(index == -1)
				System.out.println("Record not found");
			else
				patient.displayPatDetail(index);
			break;
			case 2:
			System.out.print("Enter your(doctor) name: ");
			patArray = doctor.appointmentTaken(u.getStringInput());
			if(patArray[0] == null)
				System.out.println("No patient have taken appointment!");
			else
			{
				for(i=0; patArray[i]!=null; i++)
				{
					index = patient.searchPatient(patArray[i]);
					patient.displayPatDetail(index);
					System.out.println("--------------------------");
				}
			}
			break;
			default:
			System.out.println("Wrong input");
			break;
		}
	}
	public void patientSystem(int option)throws Exception
	{
		doctor.doctor();
		patient.patient();
		int docIndex=-1,patIndex=-1;
		switch(option)
		{
			case 1:
			System.out.println("Enter doctor's name/id/speciality to search");
			docIndex = doctor.searchDoc(u.getStringInput());
			if(docIndex == -1)
				System.out.println("data not found");
			else
				doctor.displayDocDetail(docIndex);
			break;
			case 2:
			do
			{
				System.out.println("Enter doctor's name/id/speciality");
				String doct	 = u.getStringInput();
				docIndex = doctor.searchDoc(doct);
				if(docIndex == -1)
				{
					System.out.println("Doctor's record not found");
					continue;
				}
				System.out.print("Enter your(patient) name: ");
				String patName = u.getStringInput();
				patIndex = patient.searchPatient(patName);
				if(patIndex == -1)
				{
					System.out.println("Patient's name not found in the record");
					continue;
				}
				patient.takeAppointment(doctor.docName(docIndex),patName);
			}
			while(docIndex == -1 || patIndex == -1);
			break;
			default:
			System.out.println("Wrong input");
			break;
		}
	}
}
