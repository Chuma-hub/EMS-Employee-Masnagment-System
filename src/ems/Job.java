
package ems;
import java.io.*;
import java.io.SerializablePermission;

public class Job implements Serializable{
    private double salary;
    private String nameOfJob;

    public Job(double salary, String nameOfJob) {
        this.salary = salary;
        this.nameOfJob = nameOfJob;
        
        SerializablePermission sp = new SerializablePermission("enableSubclassImplementation");
    }
    
     public Job() {
        this.salary = 0.0;
        this.nameOfJob = "";
        SerializablePermission sp = new SerializablePermission("enableSubclassImplementation");
    }

    public boolean equals(Job job)
    {
       if(this.salary == job.salary && this.nameOfJob.equals(job.nameOfJob))
       {
           return true;
       }else{
       return false;
    }}
    public double getSalary() {
        return salary;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }
    
    
    
}
