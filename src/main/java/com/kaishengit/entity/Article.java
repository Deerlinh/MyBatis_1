package com.kaishengit.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by 蔡林红 on 2017/10/25.
 */
public class Article implements Serializable{
    private int id;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", simplecontent='" + simplecontent + '\'' +
                ", simplepic='" + simplepic + '\'' +
                ", createtime=" + createtime +
                ", scannum=" + scannum +
                ", replynum=" + replynum +
                ", lastreplytime=" + lastreplytime +
                ", nodeid=" + nodeid +
                '}';
    }

    private String title;
    private String content;
    private String simplecontent;
    private  String simplepic;
    private Timestamp createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSimplecontent() {
        return simplecontent;
    }

    public void setSimplecontent(String simplecontent) {
        this.simplecontent = simplecontent;
    }

    public String getSimplepic() {
        return simplepic;
    }

    public void setSimplepic(String simplepic) {
        this.simplepic = simplepic;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public int getScannum() {
        return scannum;
    }

    public void setScannum(int scannum) {
        this.scannum = scannum;
    }

    public int getReplynum() {
        return replynum;
    }

    public void setReplynum(int replynum) {
        this.replynum = replynum;
    }

    public Timestamp getLastreplytime() {
        return lastreplytime;
    }

    public void setLastreplytime(Timestamp lastreplytime) {
        this.lastreplytime = lastreplytime;
    }

    public int getNodeid() {
        return nodeid;
    }

    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
    }

    private  int scannum;
    private  int  replynum;
    private  Timestamp lastreplytime;
    private int nodeid;
}
