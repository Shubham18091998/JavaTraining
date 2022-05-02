package com.cts.domain;

public class Trainer {
	private int trainerId;
	private String trainerName;
	private String skills;
	
	public Trainer() {
		super();
		trainerId=0;
		trainerName="";
		skills="";
	}

	public Trainer(int trainerId, String trainerName, String skills) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.skills = skills;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	public void showDetails() {
		System.out.println("Trainer ID:"+trainerId+" Trainer Name:"+trainerName+" Skills:"+skills);
	}
	

}
