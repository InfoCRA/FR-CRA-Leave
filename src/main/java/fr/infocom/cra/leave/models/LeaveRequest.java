package fr.infocom.cra.leave.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LeaveRequest {
	@Id // clé primaire
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Pour l'auto-incrément
	private int id;
	private int collaboratorId;
	private LocalDateTime dateOfDemand;
	private LocalDateTime dateOfStartLeave;
	private LocalDateTime dateOfEndLeave;
	@ManyToOne
	private LeaveType leaveType;
	private String status;
	private boolean clientInformed;
	
	public LeaveRequest() {
	}

	public LeaveRequest(int id, int collaboratorId, LocalDateTime dateOfDemand, LocalDateTime dateOfStartLeave,
			LocalDateTime dateOfEndLeave, LeaveType leaveType, String status, boolean clientInformed) {
		super();
		this.id = id;
		this.collaboratorId = collaboratorId;
		this.dateOfDemand = dateOfDemand;
		this.dateOfStartLeave = dateOfStartLeave;
		this.dateOfEndLeave = dateOfEndLeave;
		this.leaveType = leaveType;
		this.status = status;
		this.clientInformed = clientInformed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCollaboraterId() {
		return collaboratorId;
	}

	public void setCollaboraterId(int collaboraterId) {
		this.collaboratorId = collaboraterId;
	}

	public LocalDateTime getDateOfDemand() {
		return dateOfDemand;
	}

	public void setDateOfDemand(LocalDateTime dateOfDemand) {
		this.dateOfDemand = dateOfDemand;
	}

	public LocalDateTime getDateOfStartLeave() {
		return dateOfStartLeave;
	}

	public void setDateOfStartLeave(LocalDateTime dateOfStartLeave) {
		this.dateOfStartLeave = dateOfStartLeave;
	}

	public LocalDateTime getDateOfEndLeave() {
		return dateOfEndLeave;
	}

	public void setDateOfEndLeave(LocalDateTime dateOfEndLeave) {
		this.dateOfEndLeave = dateOfEndLeave;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isClientInformed() {
		return clientInformed;
	}

	public void setClientInformed(boolean clientInformed) {
		this.clientInformed = clientInformed;
	}

	@Override
	public String toString() {
		return "LeaveRequest [id=" + id + ", collaboratorId=" + collaboratorId + ", dateOfDemand=" + dateOfDemand
				+ ", dateOfStartLeave=" + dateOfStartLeave + ", dateOfEndLeave=" + dateOfEndLeave
				+ ", leaveType=" + leaveType + ", status=" + status + ", clientInformed=" + clientInformed + "]";
	}
}