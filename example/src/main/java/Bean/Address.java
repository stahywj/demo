package Bean;

/**
 * Created by kenneth on 2016/8/15.
 */
public class Address {
    private String postcode;
    private String phone;
    private String address;

    public Address(){

    }
    public Address(String postcode, String phone, String address){
        this.postcode = postcode;
        this.phone = phone;
        this.address = address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
