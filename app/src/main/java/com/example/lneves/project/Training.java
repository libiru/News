package com.example.lneves.project;

import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by lneves on 12/12/2017.
 */

public class Training {

    private String date;
    private String month;
    private String nameTraining;
    private String period;
    private String time;
    private String local;
    private String teacher;
    private String link;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getNameTraining() {
        return nameTraining;
    }

    public void setNameTraining(String nameTraining) {
        this.nameTraining = nameTraining;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}