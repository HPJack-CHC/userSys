package edu.nf.users_sys.entity;
import java.util.Date;

/**
 * @author HPJack
 * @date 2020/11/25 - 18:12
 */
public class Users {
    private Integer uid;
    private String uname;
    private String upwd;
    private Integer age;
    private String email;
    private String sex;
    private String tel;
    private String address;
    private Date birthday;

    public Users() {

    }

    public Users(Integer uid, String name, Integer age, String email, String sex, String u_tel, String address, Date birthday) {
        this.uid = uid;
        this.uname = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
        this.tel = u_tel;
        this.address = address;
        this.birthday = birthday;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return uname;
    }

    public String getPassword() {
        return upwd;
    }

    public void setPassword(String password) {
        this.upwd = password;
    }

    public void setName(String name) {
        this.uname = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getU_tel() {
        return tel;
    }

    public void setU_tel(String u_tel) {
        this.tel = u_tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
