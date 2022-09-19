package com.atguigu.sad;

/**
 * @createTime : 2022/8/1 20:14
 */
public class Course {
    private Integer cno;
    private String cname;

    public Course() {
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Course(Integer cno, String cname) {
        this.cno = cno;
        this.cname = cname;
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
