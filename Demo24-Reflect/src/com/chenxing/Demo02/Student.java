package com.chenxing.Demo02;

/**
 * @ClassName Student
 * @Description: TODO 学生类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/18 5:13 下午
 */
public class Student {
    public String name;
    public String sex;
    private int age;
    private float score;
    protected String address;
    protected String tel;
    String classed;

    // 构造方法


     Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    private Student(String name, String sex, int age, float score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    private Student(String name, String sex, int age, float score, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.address = address;
    }

    protected Student(String name, String sex, int age, float score, String address, String tel) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.address = address;
        this.tel = tel;
    }

    protected Student(String name, String sex, int age, float score, String address, String tel, String classed) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.address = address;
        this.tel = tel;
        this.classed = classed;
    }

    // set & get

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
        if (age>100){
            System.out.println("ERROR");
            System.exit(-1);
        }
         this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getClassed() {
        return classed;
    }

    public void setClassed(String classed) {
        this.classed = classed;
    }

    // toString


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", classed='" + classed + '\'' +
                '}';
    }

    public void  methodPub(){
        System.out.println("共有无参成员方法，");
    }
    public void  methodPub(String arg){
        System.out.println("共有有参成员方法，" + arg);
    }
    private void  methodPri(){
        System.out.println("私有无参成员方法，");
    }
    private void  methodPri(String arg){
        System.out.println("私有有参成员方法，" + arg);
    }
    protected void  methodPro(){
        System.out.println("受保护无参成员方法，");
    }
    protected void  methodPro(String arg){
        System.out.println("受保护参成员方法，" + arg);
    }
     void  methodDef(){
        System.out.println("受保护无参成员方法，");
    }
     void  methodDef(String arg){
        System.out.println("受保护参成员方法，" + arg);
    }
}
