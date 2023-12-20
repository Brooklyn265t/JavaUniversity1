package Mirea.Homework2324;

public final class ImmutablePerson {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final Boolean IsAgree;

    public ImmutablePerson(String name, String surname, String address, String phone, Boolean isAgree) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.IsAgree = isAgree;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public Boolean isAgree(){
        return IsAgree;
    }
}
