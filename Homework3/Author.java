package Mirea.Homework3;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name,char gender, String email){ 
    this.name = name;
    this.gender = gender;
    this.email = email; 
    } 
    public String getName() { 
        return name; 
    } 
    public String getEmail() { 
        return email; 
    } 
    public void setemail(String email) { 
        this.email = email; 
    }
    public char getgender() { 
        return gender; 
    }

    @Override 
    public String toString() { 
        return "Email @ ("+this.name+" ("+this.gender+") at "+this.email+")."; 
    }
}
