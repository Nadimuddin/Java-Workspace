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
		}
	}
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
		JSONObject obj = new JSONObject();
		JSONArray list[];
		JSONArray temp = new JSONArray();
		String str = read.readFile("Appointment.json");
		if(str.equals(""))
		{
			list = new JSONArray[1];
			list[0] = new JSONArray();
			list[0].add(docName);
			list[0].add(patName);
			obj.put("Appointment",list[0]);
			write.writeFile("Appointment.json",obj.toJSONString());
		}
		else
		{
			int count=0;
			obj = (JSONObject) new JSONParser().parse(read.readFile("Appointment.json"));
			temp = (JSONArray)obj.get("Appointment");
			list = new JSONArray[temp.size()+1];
			for(i=0;i<temp.size();i++)
			{
				list[i] = new JSONArray();
				list[i] = (JSONArray)temp.get(i);
				if(docName.equals((String)list[i].get(0)))
					count++;
			}
			if(count>=5)
			{
				System.out.println("Appointment full for today, do you want to appoint for next day"
				+"\n1.Yes\n2.No");
				if(u.getIntegerInput()==1)
				{
					JSONArray list2 = new JSONArray();
					list2.add(docName);
					list2.add(patName);
					System.out.println("Appointment booked for next day");
				}
				else
					return;
			}
			else
			{
				list[i] = new JSONArray();
				list[i].add(docName);
				list[i].add(patName);
				obj.put("Appointment",list);
				write.writeFile("Appointment.json",obj.toJSONString());
			}
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
