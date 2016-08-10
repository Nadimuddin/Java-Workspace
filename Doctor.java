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
		}
	}
	public int searchDoc(String key)
	{
		for(i=0; i<id.length;i++)
			if(id[i].equals(key) || name[i].equals(key) || special[i].equals(key))
				return i;
		return -1;
	}
	public String[] appointmentTaken(String docName)throws Exception
	{
		JSONObject obj = new JSONObject();
		obj = (JSONObject) new JSONParser().parse(read.readFile("Appointment.json"));
		JSONArray temp = new JSONArray();
		temp = (JSONArray)obj.get("Appointment");
		JSONArray list[] = new JSONArray[temp.size()];
		String patArray[] = new String[temp.size()];
		int j=-1;
		for(i=0; i<temp.size(); i++)
		{
			list[i] = new JSONArray();
			list[i] = (JSONArray)temp.get(i);
			if(docName.equals((String)list[i].get(0)))
			{
				j++;
				patArray[j] =(String)list[i].get(1);
			}
		}
		return patArray;
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
