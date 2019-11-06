package com.offcn.springbootmybatisdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name = "user")
public class User implements  Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键  自增长
    private Integer uid;
    private String uname;
    private String password;

    public User(Integer uid, String uname, String password) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
    }

    public User() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
