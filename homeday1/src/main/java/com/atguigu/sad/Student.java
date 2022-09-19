package com.atguigu.sad;

import java.util.*;

/**
 * @createTime : 2022/8/1 20:15
 */
public class Student {
    private String name;
    private Integer age;
    private double [] scoreArr; //不需要分配空间
    private List<Course> courseList = new ArrayList<Course>();
    private Set<String> friendSet; //不需要创建对象
    private Map countriesMap = new HashMap<String,String>();
    private Properties properties;

    public Student(String name, Integer age, double[] scoreArr, List<Course> courseList,
                   Set<String> friendSet, Map countriesMap, Properties properties) {
        this.name = name;
        this.age = age;
        this.scoreArr = scoreArr;
        this.courseList = courseList;
        this.friendSet = friendSet;
        this.countriesMap = countriesMap;
        this.properties = properties;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double[] getScoreArr() {
        return scoreArr;
    }

    public void setScoreArr(double[] scoreArr) {
        this.scoreArr = scoreArr;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Set<String> getFriendSet() {
        return friendSet;
    }

    public void setFriendSet(Set<String> friendSet) {
        this.friendSet = friendSet;
    }

    public Map getCountriesMap() {
        return countriesMap;
    }

    public void setCountriesMap(Map countriesMap) {
        this.countriesMap = countriesMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scoreArr=" + Arrays.toString(scoreArr) +
                ", courseList=" + courseList +
                ", friendSet=" + friendSet +
                ", countriesMap=" + countriesMap +
                ", properties=" + properties +
                '}';
    }
}
