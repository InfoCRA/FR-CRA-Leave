package fr.infocom.cra.leave.managers;

import java.util.Optional;

import fr.infocom.cra.leave.models.LeaveType;

public interface LeaveTypeManager {
	public Iterable<LeaveType> findAll();
	public Optional<LeaveType> findById(int id);
	public LeaveType createOrUpdate(LeaveType leaveType);
	public void delete(LeaveType leaveType);
}