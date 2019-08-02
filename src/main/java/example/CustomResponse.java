package example;

public class CustomResponse {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomResponse(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    String name;
    String email;
    long phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}