package com.bridgelabz.main;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.utility.ReadFile;
class JSONInventory
{
	//create JSONParser object to read from JSON file
	JSONParser parser = new JSONParser();

	//call ReadFile class to read from file	
	ReadFile read = new ReadFile();
	JSONInventory()throws Exception
	{
		//convert JSONParser to JSONObject
		JSONObject jsonObj = (JSONObject) parser.parse(read.readFile("inventory.json"));
		
		/**
		*	create JSONArray and
		*	store JSON object in to Array
		*/
		JSONArray name = (JSONArray) jsonObj.get("Name");
		JSONArray weight = (JSONArray) jsonObj.get("Weight");
		JSONArray price = (JSONArray) jsonObj.get("Price per Kg");

		System.out.println("\n\n\n*****     Inventory Report     *****");
		for(int i=0; i<weight.size(); i++)
		{
			/*
			*	Print name, weight & price of each item specified in the question
			*	and calculate total price of each item
			*/
			System.out.println(name.get(i)+"-> Weight: "+weight.get(i)+" Price:"+price.get(i)+"/Kg");
			System.out.println("Total Price of "+name.get(i)+" = "+(Long)weight.get(i)*(Long)price.get(i)+"\n");
		}
	}
	public static void main(String arg[])throws Exception
	{
		new JSONInventory();
	}
	
}
