package com.chenxing.Stu_manager.global;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:27
 */
public class Student {
    private int id;
    private String name;
    private String sex;
    private  int age;
    private float score;
    private String tel;
    private String classid;
    // 完整构造方法
    public Student(int id, String name, String sex, int age, float score, String tel, String classid) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.tel = tel;
        this.classid = classid;
    }
    // 不包含id的
    public Student(String name, String sex, int age, float score, String tel, String classid) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.tel = tel;
        this.classid = classid;
    }
    // 无参的构造方法
    public Student() {
    }
    // set & get

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    // toString 方法 方便查看输出


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", tel='" + tel + '\'' +
                ", classid='" + classid + '\'' +
                '}';
    }

}
