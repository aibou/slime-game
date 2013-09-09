package net.aibou.spring.slime.service;

import net.aibou.spring.slime.core.domain.slime.Slime;
import net.aibou.spring.slime.core.entities.SlimeEntity;

import org.springframework.stereotype.Service;

@Service
public interface TrainingService {
	public SlimeEntity buildUp(Slime slime);
	
	public SlimeEntity buildUpHard(Slime slime);
	
	public SlimeEntity study(Slime slime);
	
	public SlimeEntity free(Slime slime);
	
	public SlimeEntity play(Slime slime);
	
	public SlimeEntity rest(Slime slime);
}
