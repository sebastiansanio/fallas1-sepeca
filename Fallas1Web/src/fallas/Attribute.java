package fallas;

import java.util.ArrayList;

public class Attribute {
	
	private String name;
	ArrayList<String> optionList = new ArrayList<String>();
	ArrayList<Integer> valueList = new ArrayList<Integer>();
	private String description;
	
	public Attribute(){
	}
	
	public Attribute(String name,String description){
		this.name=name;
		this.description=description;
		
	}
	
	public ArrayList<String> getOptionsList() {
		return optionList;
	}
	
	public ArrayList<Integer> getValueList() {
		return valueList;
	}

	public void addOption(String option,int value) {
		this.optionList.add(option);
		this.valueList.add(value);
	}

	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}

	public String getDescription() {
		
		return this.description;
	}
	
	
}
