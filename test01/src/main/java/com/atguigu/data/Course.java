package com.atguigu.data;

/**
 * @createTime : 2022/8/1 16:21
 */
public class Course {
    private Integer cno;
    private String cname;

    public Course() {
    }

    public Course(Integer cno, String cname) {
        this.cno = cno;
        this.cname = cname;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                '}';
    }
}
