package com.bridgelabz.main;
import com.bridgelabz.utility.ReadFile;
import com.bridgelabz.utility.WriteFile;
import com.bridgelabz.utility.Utility;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
class DoctorPatient
{
	JSONParser parser = new JSONParser();
	ReadFile read = new ReadFile();
	Utility u = new Utility();
	Doctor doctor = new Doctor();
	Patient patient = new Patient();
	
	int option;
	JSONObject jsonObj;
	DoctorPatient()throws Exception
	{
		jsonObj = (JSONObject)parser.parse(read.readFile("DoctorPatient.json"));
		doctor.doctor((JSONArray)jsonObj.get("Doctor"));
		patient.patient((JSONArray)jsonObj.get("Patient"));
		System.out.println("Enter system as\n1. Doctor\n2. Patient");
		option = u.getIntegerInput();
		switch(option)
		{
			case 1:
			
			break;
			case 2:
			System.out.println("Enter doctor's name/id/speciality to search");
			int index = doctor.searchDoc(u.getStringInput());
			if(index == -1)
				System.out.println("data not found");
			else
			{
			System.out.println("Search result->");
			System.out.println("ID: "+doctor.getId(index));
			System.out.println("Name: "+doctor.getName(index));
			System.out.println("Speciality: "+doctor.getSpeciality(index));
			System.out.println("Availability: "+doctor.getAvailability(index));
			}
			//patient();
			break;
			default:
			System.out.println("Wrong option");
			break;
		}
	}
	
	void doctor()
	{
		JSONArray doct = (JSONArray)jsonObj.get("Doctor");
		//JSONObject doct0 = doc
		//String id = (String)doct.get
		JSONObject obj = (JSONObject)doct.get(1);
		//Object id = obj.get("name");
		String id = (String)obj.get("name");
		System.out.println("Doctor1: "+id);
	}
	
	void patient()
	{
	}
	public static void main(String arg[])throws Exception
	{
		new DoctorPatient();
	}
}
class Doctor
{
	JSONObject obj;
	Object temp;
	String id[],name[],special[],avail[];
	int i;
	public void doctor(JSONArray arr)
	{
		id = new String[arr.size()];
		name = new String[arr.size()];
		special = new String[arr.size()];
		avail = new String[arr.size()];
		for(i=0; i<arr.size(); i++)
		{
			obj = (JSONObject)arr.get(i);
			id[i] =(String)obj.get("id");
			name[i] =(String)obj.get("name");
			special[i] =(String)obj.get("specialization");
			avail[i] =(String)obj.get("availability");
			
			/*temp = obj.get("name");
			name[i] = (String)temp;
			temp = obj.get("specialization");
			special[i] = (String)temp;
			temp = obj.get("availability");
			avail[i] = (String)temp;
			
			System.out.println("id: "+obj.get("id"));
			System.out.println("name: "+obj.get("name"));
			System.out.println("specialization: "+obj.get("specialization"));
			System.out.println("availability: "+obj.get("availability"));*/
		}
	}
	public int searchDoc(String key)
	{
		for(i=0; i<id.length;i++)
		{
			System.out.println("val of id: "+b[i])
			if(id[i].equals(key) || name[i].equals(key) || special[i].equals(key))
				return i;
		}
		return -1;
	}
	public String getId(int index)
	{
		return id[index];
	}
	public String getName(int index)
	{
		return name[index];
	}
	public String getSpeciality(int index)
	{
		return special[index];
	}
	public String getAvailability(int index)
	{
		return avail[index];
	}
}

class Patient
{
	JSONObject obj;
	Object temp;
	String id[],name[],mob[],age[];
	public void patient(JSONArray arr)
	{
		id = new String[arr.size()];
		name = new String[arr.size()];
		mob = new String[arr.size()];
		age = new String[arr.size()];
		for(int i=0; i<arr.size(); i++)
		{
			obj = (JSONObject)arr.get(i);
			id[i] =(String)obj.get("id");
			name[i] =(String)obj.get("name");
			mob[i] =(String)obj.get("mobile");
			age[i] =(String)obj.get("availability");
			
			/*temp = obj.get("name");
			name[i] = (String)temp;
			temp = obj.get("specialization");
			special[i] = (String)temp;
			temp = obj.get("availability");
			avail[i] = (String)temp;
			
			System.out.println("id: "+obj.get("id"));
			System.out.println("name: "+obj.get("name"));
			System.out.println("specialization: "+obj.get("specialization"));
			System.out.println("availability: "+obj.get("availability"));*/
		}
	}
}
