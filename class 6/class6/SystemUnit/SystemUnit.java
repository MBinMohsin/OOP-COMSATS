package class6.SystemUnit;

public class SystemUnit{
	private String cpuName;
	private int ramSize;
	private int diskSize;
	private String systemId;
	private String lcdModel;

	public void setCPUName(String cpu){
		this.cpuName=cpu;
		}	
	public void setRAMSize(int ram){
		ramSize=ram;
		}	
	public void setDiskSize(int diskSize){
		this.diskSize=diskSize;
		}	
	public void setSystemId(String systemId){
		this.systemId=systemId;
		}	
	public void setLCDModel(String lcdModel){
		this.lcdModel=lcdModel;
		}	
	public String getCPUName(){
		return cpuName;
		}	
	public int getRAMSize(){
		return ramSize;
	
		}	
	public int getDiskSize(){
		return diskSize;
	
		}	
	public String getSystemId(){
		return systemId;
	
		}	
	public String getLCDModel(){
		return lcdModel;
	
		}	
	public String toString(){
		return String.format("\nCPU:%s\nName: %s\nDesignation: %s\n",systemId ,cpuName, lcdModel );
	}


}
