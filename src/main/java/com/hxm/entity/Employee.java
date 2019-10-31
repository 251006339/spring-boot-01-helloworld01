package com.hxm.entity;




import org.springframework.cglib.beans.BeanGenerator;

import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * @author XAIOHU
 * @date 2019/10/31 --14:27
 **/
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer  gender;
    private Integer dId;
    private String desc;
    private Byte video;
    private Timestamp cteate;
    private BigInteger moneybag;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", dId=" + dId +
                ", desc='" + desc + '\'' +
                ", video=" + video +
                ", cteate=" + cteate +
                ", moneybag=" + moneybag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Byte getVideo() {
        return video;
    }

    public void setVideo(Byte video) {
        this.video = video;
    }

    public Timestamp getCteate() {
        return cteate;
    }

    public void setCteate(Timestamp cteate) {
        this.cteate = cteate;
    }

    public BigInteger getMoneybag() {
        return moneybag;
    }

    public void setMoneybag(BigInteger moneybag) {
        this.moneybag = moneybag;
    }
}
