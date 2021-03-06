package registrar.RegaliaOrderingSystem.Dto;

import registrar.RegaliaOrderingSystem.Models.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserDto {
    @NotNull(message = "Please enter a valid email")
    @Email(message = "Please enter a valid email")
    private String email;
    private String username;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String ceremony_date;
    private String cap_size;
    private String degree;
    private String department;
    private Integer weight;
    private String height;
    private String granting_institution;
    private String granting_city;
    private String granting_state;
    private String last_updated;
    private String role;

    public UserDto(String email, String username, String first_name, String last_name, String phone_number, String ceremony_date, String cap_size, String degree, String department, Integer weight, String height, String granting_institution, String granting_city, String granting_state, String last_updated) {
        this.email = email;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.ceremony_date = ceremony_date;
        this.cap_size = cap_size;
        this.degree = degree;
        this.department = department;
        this.weight = weight;
        this.height = height;
        this.granting_institution = granting_institution;
        this.granting_city = granting_city;
        this.granting_state = granting_state;
        this.last_updated = last_updated;
    }

    public UserDto(String email, String username, String first_name, String last_name, String phone_number, String ceremony_date, String cap_size, String degree, String department, Integer weight, String height, String granting_institution, String granting_city, String granting_state, String last_updated, String role) {
        this.email = email;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.ceremony_date = ceremony_date;
        this.cap_size = cap_size;
        this.degree = degree;
        this.department = department;
        this.weight = weight;
        this.height = height;
        this.granting_institution = granting_institution;
        this.granting_city = granting_city;
        this.granting_state = granting_state;
        this.last_updated = last_updated;
        this.role = role;
    }

    public UserDto(String username){
        this.username = username;

    }
    public UserDto(){
        super();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCeremony_date() {
        return ceremony_date;
    }

    public void setCeremony_date(String ceremony_date) {
        this.ceremony_date = ceremony_date;
    }

    public String getCap_size() {
        return cap_size;
    }

    public void setCap_size(String cap_size) {
        this.cap_size = cap_size;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getGranting_institution() {
        return granting_institution;
    }

    public void setGranting_institution(String granting_institution) {
        this.granting_institution = granting_institution;
    }

    public String getGranting_city() {
        return granting_city;
    }

    public void setGranting_city(String granting_city) {
        this.granting_city = granting_city;
    }

    public String getGranting_state() {
        return granting_state;
    }

    public void setGranting_state(String granting_state) {
        this.granting_state = granting_state;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", ceremony_date='" + ceremony_date + '\'' +
                ", cap_size='" + cap_size + '\'' +
                ", degree='" + degree + '\'' +
                ", department='" + department + '\'' +
                ", weight=" + weight +
                ", height='" + height + '\'' +
                ", granting_institution='" + granting_institution + '\'' +
                ", granting_city='" + granting_city + '\'' +
                ", granting_state='" + granting_state + '\'' +
                ", last_updated=" + last_updated +
                ", role='" + role + '\'' +
                '}';
    }
}
