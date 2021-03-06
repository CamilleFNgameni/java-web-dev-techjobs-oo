package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id= nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString(){
        boolean noData = false;
        String job = "ID: "+getId();
        if(getName()==null|| getName().equals("")){
            job += "\nName: Data not available";
        }else{
            job += "\nName: " + getName();
            noData = true;
        }

        if(getEmployer()==null||getEmployer().getValue().equals("")){
            job += "\nEmployer: Data not available";
        }else{
            job += "\nEmployer: " + getEmployer();
            noData = true;
        }
        if(getLocation()==null||getLocation().getValue().equals("")){
            job += "\nlocation: Data not available";
        }else{
            job += "\nLocation: " + getLocation();
            noData = true;
        }
        if(getPositionType()==null||getPositionType().getValue().equals("")){
            job += "\nPosition Type: Data not available";
        }else{
            job += "\nPosition Type: " + getPositionType();
            noData = true;
        }
        if(getCoreCompetency()==null||getCoreCompetency().getValue().equals("")){
            job += "\nCore Competency: Data not available";
        }else{
            job += "\nCore Competency: " + getCoreCompetency();
            noData = true;
        }
        if(!noData)
        job =  "OOPS! This job does not seem to exist.";
        return job;
    }
}
