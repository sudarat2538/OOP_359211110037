package ooplap9;

public class Address {
    private String homeNember;
    private String privince;
    private String postCode;

    public Address(String homeNember, String privince, String postCode) {
        this.homeNember = homeNember;
        this.privince = privince;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homeNember='" + homeNember + '\'' +
                ", privince='" + privince + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    public String getHomeNember() {
        return homeNember;
    }

    public void setHomeNember(String homeNember) {
        this.homeNember = homeNember;
    }

    public String getPrivince() {
        return privince;
    }

    public void setPrivince(String privince) {
        this.privince = privince;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
