package net.aibou.spring.slimegame.core.beans;

import net.aibou.spring.slimegame.core.domain.status.Status;
import net.aibou.spring.slimegame.core.entities.SlimeEntity;

public class TrainingBean {
	private SlimeEntity slime;
	private Status upStatus;

	public SlimeEntity getSlime() {
		return slime;
	}
	public void setSlime(SlimeEntity slime) {
		this.slime = slime;
	}
	public Status getUpStatus() {
		return upStatus;
	}
	public void setUpStatus(Status upStatus) {
		this.upStatus = upStatus;
	}
}
