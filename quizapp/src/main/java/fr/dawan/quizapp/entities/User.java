package fr.dawan.quizapp.entities;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "t_Users")

public class User extends DbObject {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Version
    private int version;

    
    private String username;
    private String pwd;
    private String email;
    private String confirmPwd;

    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;

    public User() {

    typeUser=TypeUser.CLIENT;
    }

    public User(String username, String pwd, String email, String confirmPwd) {
        super();
        this.username = username;
        this.pwd = pwd;
        this.email = email;
        this.confirmPwd = confirmPwd;

        typeUser=TypeUser.CLIENT;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }
    
}