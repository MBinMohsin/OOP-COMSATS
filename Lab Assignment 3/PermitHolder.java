import java.util.Objects;

public class PermitHolder extends Person{
    private int permitId;
    private static int integ = 1000;
    public int getPermitId() {
        return permitId;
    }

    public void setPermitId(int permitId) {
        this.permitId = permitId;
    }

    public PermitHolder(String name1) {
        super(name1);
        integ++;
        permitId=integ;
    }

    @Override
    public boolean equals(Object o) {
        PermitHolder that = (PermitHolder) o;
        return getPermitId() == that.getPermitId();
    }

}
