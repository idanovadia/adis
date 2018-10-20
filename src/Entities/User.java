package Entities;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User extends AEntity{
    private String username;
    private String password;
    private String birth;
    private String first_name;
    private String last_name;
    private String city;


    public User(String username,String password,String birth, String city, String firstname, String lastname){
        super();
    this.username=username;
    this.password=password;
    this.birth =birth;
    this.city=city;
    this.first_name =firstname;
    this.last_name =lastname;

    }

    @Override
    /*
    Return the fields names in arraylist
     */
    public ArrayList<String> getFields() {
        return fields;

    }
    /*
    Returns the fields value in arraylist
     */
    public ArrayList<String> getFieldsValue(){
        ArrayList<String> result = new ArrayList<>();
        result.add(this.username);
        result.add(this.password);
        result.add(this.birth);
        result.add(this.city);
        result.add(this.first_name);
        result.add(this.last_name);

        return result;
    }

    @Override
    /*
    Returns the fields in a long string with delimiters
     */
    public String getFieldsForDB() {
        String result ="";
        for (int i = 0; i < fields.size(); i++) {
            if (i == 0) {
                result = fields.get(i);
            } else {
                result = result + ", " + fields.get(i);
            }
        }
        return result;
    }

    @Override
    /*
    Returns String of question marks (?) for the database query
     */
    public String getValuesForDB() {
        String result="";
        for (int i = 0; i < fields.size(); i++) {
            if (i == 0) {
                result = "?";
            } else {
                result = result + ", " + "?";
            }
        }
        return result;
    }


    @Override
    /*
    Returns DB name of the entity
     */
    public String GetDBName() {
        return "users";
    }

    @Override
    /*
    Returns primary key value of the user entity
     */
    public String getPrimaryKeyValue() {
        return username;
    }

    @Override
    /*
    Returns primary key name of the user entity
     */
    public String getPrimaryKeyName() {
        return "username";
    }

    @Override
    public void ReadFromDB() {

    }

    @Override
    public void InsertTODB() {

    }


    @Override
    public void DeleteFromDB() {

    }

    @Override
    public void UpdateFromDB() {

    }
}