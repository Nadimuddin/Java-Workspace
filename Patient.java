package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import com.bridgelabz.main.Doctor;
import com.bridgelabz.utility.ReadFile;
import com.bridgelabz.utility.WriteFile;
import org.json.simple.parser.JSONParser;
class Patient
{
	JSONObject obj;
	Object temp;
	String id[],name[],mob[],age[];
	Utility u = new Utility();
	ReadFile read = new ReadFile();
	WriteFile write = new WriteFile();
	JSONObject jsonObj;
	JSONArray arr;
	int i;
	public void patient()throws Exception
	{
		jsonObj = (JSONObject) new JSONParser().parse(read.readFile("DoctorPatient.json"));
		arr = (JSONArray)jsonObj.get("Patient");
		System.out.println("All patient added to Array");
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
			age[i] =(String)obj.get("age");
			
			/*System.out.println("id: "+obj.get("id"));
			System.out.println("name: "+obj.get("name"));
			System.out.println("specialization: "+obj.get("specialization"));
			System.out.println("availability: "+obj.get("availability"));*/
		}
	}
	/*public void patientSystem(int option)throws Exception
	{
		doctor.doctor();
		switch(option)
		{
			case 1:
			System.out.println("Enter doctor's name/id/speciality to search");
			int index = doctor.searchDoc(u.getStringInput());
			if(index == -1)
				System.out.println("data not found");
			else
				doctor.displayDocDetail(index);
			break;
			case 2:
			System.out.println("under construction");
			break;
			default:
			System.out.println("Wrong input");
			break;
		}
	}*/
	public int searchPatient(String key)
	{
		 for(i=0; i<id.length;i++)
		{
			if(id[i].equals(key) || name[i].equals(key) || mob[i].equals(key))
				return i;
		}
		return -1;
	}
	public void takeAppointment(String docName, String patName)throws Exception
	{
		/*arr.add("id : 05");
		arr.add("name : Saurabh");
		arr.add("specialization : physician");
		arr.add("availability: 5-3");
		jsonObj.put("Docotor",arr);
		write.writeFile("appointment.json",jsonObj.toJSONString());*/
		JSONObject obj = new JSONObject();
		JSONArray list[] = new JSONArray[5];
		JSONArray temp = new JSONArray();
		String str = read.readFile("Appointment.json");
		if(str.equals(""))
		{
			System.out.println("Nothing in file");
			list[0] = new JSONArray();
			list[0].add(docName);
			list[0].add(patName);
			obj.put("Appointment",list[0]);
			write.writeFile("Appointment.json",obj.toJSONString());
		}
		else
		{
			//i=1;
			obj = (JSONObject) new JSONParser().parse(read.readFile("Appointment.json"));
			temp = (JSONArray)obj.get("Appointment");
			for(i=0;i<temp.size();i++)
			{
				System.out.println("i in for "+i);
				list[i] = new JSONArray();
				list[i] = (JSONArray)temp.get(i);
			}
			System.out.println("i out :"+i);
			list[i] = new JSONArray();
			list[i].add(docName);
			list[i].add(patName);
			obj.put("Appointment",list);
			/*System.out.println("list0: "+list[0]+"\nsize: "+list[0].size());
			System.out.println("\nlist1: "+list[1]+"\nsize: "+list[1].size());
			System.out.println("\nobj: "+obj+"\nsize: "+list[1].size());*/
			write.writeFile("Appointment.json",obj.toJSONString());
			/*obj.put("Appointment",list);
			write.writeFile("Appointment.json",obj.toJSONString());*/
			/*if(list.size() == 5)
			{
				System.out.println("appointment will be bool for another day");
			}*/
		}
	}
	public void displayPatDetail(int index)
	{
		System.out.println("ID: "+id[index]);
		System.out.println("Name: "+name[index]);
		System.out.println("Mobile: "+mob[index]);
		System.out.println("Age: "+age[index]);
	}
}
