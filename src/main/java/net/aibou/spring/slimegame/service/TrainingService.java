package net.aibou.spring.slimegame.service;

import net.aibou.spring.slimegame.core.domain.slime.Slime;

import org.springframework.stereotype.Service;

@Service
public interface TrainingService {
	public Slime buildUp(Slime slime);
	
	public Slime buildUpHard(Slime slime);
	
	public Slime study(Slime slime);
	
	public Slime free(Slime slime);
	
	public Slime play(Slime slime);
	
	public Slime rest(Slime slime);
}
