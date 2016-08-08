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
		switch(option)
		{
			case 1:
			System.out.println("Enter patient's's name/id/Mobile to search");
			int index = patient.searchPatient(u.getStringInput());
			if(index == -1)
				System.out.println("Record not found");
			else
				patient.displayPatDetail(index);
			break;
			case 2:
			System.out.println("under construction");
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
		int index = -1;
		switch(option)
		{
			case 1:
			System.out.println("Enter doctor's name/id/speciality to search");
			index = doctor.searchDoc(u.getStringInput());
			if(index == -1)
				System.out.println("data not found");
			else
				doctor.displayDocDetail(index);
			break;
			case 2:
			do
			{
				System.out.println("Enter doctor's name/id/speciality");
				String doct	 = u.getStringInput();
				index = doctor.searchDoc(doct);
				System.out.println("doctor searched "+index);
				if(index == -1)
				{
					System.out.println("Doctor's record not found");
					continue;
				}
				System.out.print("Enter your(patient) name: ");
				String patName = u.getStringInput();
				index = patient.searchPatient(patName);
				System.out.println("searching patient "+index);
				if(index == -1)
				{
					System.out.println("Name not found in the record");
					continue;
				}
				patient.takeAppointment(doctor.docName(index),patName);
			}
			while(index == -1);
			break;
			default:
			System.out.println("Wrong input");
			break;
		}
	}
}
