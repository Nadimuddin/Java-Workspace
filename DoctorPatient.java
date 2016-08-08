package com.bridgelabz.main;
import com.bridgelabz.utility.ReadFile;
import com.bridgelabz.utility.WriteFile;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.main.DPSystem;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
class DoctorPatient
{
	JSONParser parser = new JSONParser();
	ReadFile read = new ReadFile();
	Utility u = new Utility();
	DPSystem dp = new DPSystem();
	
	int option;
	JSONObject jsonObj;
	DoctorPatient()throws Exception
	{
		//jsonObj = (JSONObject)parser.parse(read.readFile("DoctorPatient.json"));
		//doctor.doctor((JSONArray)jsonObj.get("Doctor"));
		//patient.patient((JSONArray)jsonObj.get("Patient"));
		//doctor = new Doctor();
		System.out.println("Enter system as\n1.Clinic\n2. Doctor\n3. Patient");
		option = u.getIntegerInput();
		switch(option)
		{
			case 1:
				System.out.println("under construction");
			break;
			case 2:
				System.out.println("Select from below"+
				"\n1.Search patient\n2.Check patients who have taken appointment");
			dp.doctorSystem(u.getIntegerInput());
			break;
			case 3:
			System.out.println("Select from below"+
			"\n1.Search doctor\n2.Take appointment");
			dp.patientSystem(u.getIntegerInput());
			break;
			default:
			System.out.println("Wrong option");
			break;
		}
	}
	
	/*void doctor()
	{
		JSONArray doct = (JSONArray)jsonObj.get("Doctor");
		//JSONObject doct0 = doc
		//String id = (String)doct.get
		JSONObject obj = (JSONObject)doct.get(1);
		//Object id = obj.get("name");
		String id = (String)obj.get("name");
		System.out.println("Doctor1: "+id);
	}*/
	
	public static void main(String arg[])throws Exception
	{
		new DoctorPatient();
	}
}
