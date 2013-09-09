package net.aibou.spring.slime.core.domain.status;

import net.aibou.spring.slime.constant.StatusType;

public class Status {
	private int hp;
	private int mp;
	private int ap;
	private int dp;
	private int sp;
	
	protected Status(int hp, int mp, int ap, int dp, int sp){
		this.hp = hp;
		this.mp = mp;
		this.ap = ap;
		this.dp = dp;
		this.sp = sp;
	}
	
	public int getStatusOf(StatusType type) {
		switch(type) {
			case HP :
				return hp;
			case MP :
				return mp;
			case AP :
				return ap;
			case DP :
				return dp;
			case SP :
				return sp;
			default :
				return -1;
		}
	}
	
	public void addStatus(Status status) {
		this.hp += status.hp;
		this.mp += status.mp;
		this.ap += status.ap;
		this.dp += status.dp;
		this.sp += status.sp;
	}
}
