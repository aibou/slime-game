package net.aibou.spring.slime.facade;

import net.aibou.spring.slime.core.domain.slime.Slime;
import net.aibou.spring.slime.core.entities.SlimeEntity;
import net.aibou.spring.slime.service.TrainingService;

import org.springframework.beans.factory.annotation.Autowired;

public class TrainingFacade {

	@Autowired
	TrainingService trainingService;

	public SlimeEntity training(Slime slime) {
		// mock
		return trainingService.buildUp(new Slime("sla","hoge"));
	}
}
