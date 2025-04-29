public class Supervisor extends Person{
    private int yearsOfExperience
    public Supervisor(String name1, int yearsOfExperience) {
        super(name1);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
