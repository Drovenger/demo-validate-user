package model;

import javax.validation.constraints.*;

public class User {
    @NotBlank(message = "Đéo đc để trống")
    @Size(min = 2, max = 30, message = "Tên ngắn thế ?")
    private String name;

    @Min(value = 18, message = "Chú chưa đủ tuổi!")
    private int age;

    @Email(message = "Không có email thì tắt máy học đi cháu!")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
