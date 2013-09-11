package net.aibou.spring.slimegame.service.impl;

import net.aibou.spring.slimegame.core.domain.slime.Slime;
import net.aibou.spring.slimegame.service.TrainingService;

public class TrainingServiceImpl implements TrainingService {

	@Override
	public Slime buildUp(Slime slime) {
		slime.buildUp();
		return slime;
	}

	@Override
	public Slime study(Slime slime) {
		slime.study();
		return slime;
	}
	
	@Override
	public Slime buildUpHard(Slime slime) {
		slime.buildUpHard();
		return slime;
	}

	@Override
	public Slime free(Slime slime) {
		slime.free();
		return slime;
	}

	@Override
	public Slime play(Slime slime) {
		slime.play();
		return slime;
	}

	@Override
	public Slime rest(Slime slime) {
		slime.rest();
		return slime;
	}

	
}
