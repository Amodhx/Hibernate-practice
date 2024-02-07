package lk.ijse.embeded;

import jakarta.persistence.Embeddable;

@Embeddable
public class Fullname {
    private String fisrtName;
    private String lastName ;

    public Fullname() {
    }

    @Override
    public String toString() {
        return "Fullname{" +
                "fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Fullname(String fisrtName, String lastName) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
    }
}
