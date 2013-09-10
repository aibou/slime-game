package net.aibou.spring.slime.core.domain.slime;

import net.aibou.spring.slime.core.domain.status.Status;
import net.aibou.spring.slime.core.domain.status.StatusFactory;

public class Slime {
	private String name;
	private String ownerName;
	private Status status;

	public Slime(String name, String ownerName) {
		this.name = name;
		this.ownerName = ownerName;
		this.status = StatusFactory.createInitialStatus();
	}

	public Status getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void addStatus(Status status) {
		this.status.addStatus(status);
	}

	public Status buildUp() {
		Status upStatus = StatusFactory.createBuildUpStatus();
		status.addStatus(upStatus);
		return upStatus;
	}

	public Status study() {
		Status upStatus = StatusFactory.createStudyStatus();
		status.addStatus(upStatus);
		return upStatus;
	}

	public Status buildUpHard() {
		Status upStatus = StatusFactory.createBuildUpHardStatus();
		status.addStatus(upStatus);
		return upStatus;
	}
	
	public Status free() {
		Status upStatus = StatusFactory.createFreeStatus();
		status.addStatus(upStatus);
		return upStatus;
	}

	public Status play() {
		Status upStatus = StatusFactory.createPlayStatus();
		status.addStatus(upStatus);
		return upStatus;
	}

	public Status rest() {
		Status upStatus = StatusFactory.createRestStatus();
		status.addStatus(upStatus);
		return upStatus;
	}
}
