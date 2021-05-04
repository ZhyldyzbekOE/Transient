package com.company;

public class UserInfo {

    private long id;
    private String name;
    private transient String status;
    private transient String number;

    public UserInfo(long id, String name, String status, String number) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
