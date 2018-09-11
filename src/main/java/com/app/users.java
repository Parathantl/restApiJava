package com.app;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class users {
    @Id
    public ObjectId _id;

    public String name;
    public String address;
    public int age;

    // Constructors
    public users() {}

    public users(ObjectId _id, String name, String address, int age) {
        this._id = _id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // ObjectId needs to be converted to string
    public String get_id() { return _id.toString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
