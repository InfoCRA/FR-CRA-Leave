package fr.infocom.cra.leave.managers;

import java.util.Optional;

import fr.infocom.cra.leave.models.LeaveRequest;

public interface LeaveRequestManager {
	public Iterable<LeaveRequest> findAll();
	public Optional<LeaveRequest> findById(int id);
	public LeaveRequest createOrUpdate(LeaveRequest leaveRequest);
	public void delete(LeaveRequest leaveRequest);
}