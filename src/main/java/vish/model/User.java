package vish.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "name")
    private  String name;

    @Column(name = "lastname")
    private  String Lastname;

    @Column(name = "age")
    private  int age;

    @Column(name = "gender")
    private  String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

       @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
