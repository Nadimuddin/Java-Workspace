package com.bridgelabz.main;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.utility.ReadFile;
import com.bridgelabz.main.Patient;
import com.bridgelabz.utility.Utility;
class Doctor
{
	JSONObject obj,jsonObj;
	Object temp;
	String id[],name[],special[],avail[];
	int i;
	ReadFile read = new ReadFile();
	Utility u = new Utility();
	public void doctor()throws Exception
	{
		jsonObj = (JSONObject) new JSONParser().parse(read.readFile("DoctorPatient.json"));
		JSONArray arr = (JSONArray)jsonObj.get("Doctor");
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
	/*public void doctorSystem(int option)throws Exception
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
	}*/
	public int searchDoc(String key)
	{
		for(i=0; i<id.length;i++)
			if(id[i].equals(key) || name[i].equals(key) || special[i].equals(key))
				return i;
		return -1;
	}
	public String docName(int index)
	{
		return name[index];
	}
	public void displayDocDetail(int index)
	{
		System.out.println("ID: "+id[index]);
		System.out.println("Name: "+name[index]);
		System.out.println("Speciality: "+special[index]);
		System.out.println("Availability: "+avail[index]);
	}
}
