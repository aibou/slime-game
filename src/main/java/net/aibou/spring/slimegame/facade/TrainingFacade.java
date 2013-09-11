package net.aibou.spring.slimegame.facade;

import net.aibou.spring.slimegame.core.domain.slime.Slime;
import net.aibou.spring.slimegame.core.entities.SlimeEntity;
import net.aibou.spring.slimegame.service.TrainingService;

import org.springframework.beans.factory.annotation.Autowired;

public class TrainingFacade {

	@Autowired
	TrainingService trainingService;

	public SlimeEntity training(Slime slime) {
		// mock
		//return trainingService.buildUp(new Slime("sla","hoge"));
		return new SlimeEntity();
	}
}
