
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Verosffy
 */
public class Employee implements Serializable{
    private String name;
    private String surnmame;
    private Job job;
    private int staffNr;

    public Employee(String name, String surnmame, Job job, int staffNr) {
        this.name = name;
        this.surnmame = surnmame;
        this.job = job;
        this.staffNr = staffNr;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnmame() {
        return surnmame;
    }

    public void setSurnmame(String surnmame) {
        this.surnmame = surnmame;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffNr() {
        return staffNr;
    }

    public void setStaffNr(int staffNr) {
        this.staffNr = staffNr;
    }
    
    
}
