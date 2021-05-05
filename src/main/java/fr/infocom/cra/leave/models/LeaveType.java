package fr.infocom.cra.leave.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeaveType {
	@Id // clé primaire
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Pour l'auto-incrément
	private int id;
	private String type;
	
	public LeaveType() {
	}

	public LeaveType(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "LeaveType [id=" + id + ", type=" + type + "]";
	}
}