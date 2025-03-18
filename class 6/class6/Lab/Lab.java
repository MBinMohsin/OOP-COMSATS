package class6.Lab;

import class6.Employee.*;
import class6.SystemUnit.*;

public class Lab{
	private String name;
	private Employee labStaff;
	private SystemUnit system[] = new SystemUnit[50];
	boolean hasMultimedia;


	public Lab(String name, Employee labStaff, SystemUnit system[], boolean hasMultimedia){
		setName(name);
		setLabStaff(labStaff);
		
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setLabStaff(Employee labStaff){
		this.labStaff = labStaff;
	}

	public void setSystemUnit(SystemUnit[] system){
		this.system = system;
	}

	public void setHasMultimedia(boolean hasMultimedia){
		this.hasMultimedia = hasMultimedia;
	}


	public String getName(){
		return this.name;
	}

	public Employee getLabStaff(){
		return this.labStaff;
	}

	public SystemUnit[] getSystemUnit(){
		return system;
	}

	public boolean getHasMultimedia(){
		return this.hasMultimedia;
	}
public String toString(){

		StringBuilder str = new StringBuilder();
		str.append(name);
		str.append(" : ");
		str.append(labStaff);
		for(int i = 0; i < 50; i++)
		{
			str.append(system[i]);
		}

		return str.toString();
	}
}
