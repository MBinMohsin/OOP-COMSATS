public class ParkingSystem {

    private String campusName;
    private Supervisor supervisor;
    private ParkingZone[] zone=new ParkingZone[2];
    private PermitHolder[] perm=new PermitHolder[2];
    static ParkingSystem instance;
    private static int inter=0;
    private static int inter1=0;

    private ParkingSystem(String name, Supervisor supervisor){
        System.out.print("Parking System Created.");
    }
    public void addZone(ParkingZone zoneX){
        zone[inter]=zoneX;
        inter++;
    }
    public void addPermitHolder(PermitHolder permitX){
        perm[inter1]=permitX;
        inter1++;
    }
    public static ParkingSystem getInstance(String name, Supervisor supervisor){
        if (instance == null)
            instance = new ParkingSystem(name, supervisor);
        return instance;
    }
    public


}
