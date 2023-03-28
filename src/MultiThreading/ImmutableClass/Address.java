package MultiThreading.ImmutableClass;

public class Address implements Cloneable{
    private String region;
    private String street;

    public Address(String region, String street) {
        this.region = region;
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Address{" +
                "region='" + region + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
