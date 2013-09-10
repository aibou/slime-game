package net.aibou.spring.slime.core.domain.status;


public class Status {
	private int hp;
	private int mp;
	private int ap;
	private int dp;
	private int sp;

	protected Status(int hp, int mp, int ap, int dp, int sp) {
		this.hp = hp;
		this.mp = mp;
		this.ap = ap;
		this.dp = dp;
		this.sp = sp;
	}

	public void addStatus(Status status) {
		this.hp += status.hp;
		this.mp += status.mp;
		this.ap += status.ap;
		this.dp += status.dp;
		this.sp += status.sp;
	}
	
	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getAp() {
		return ap;
	}

	public int getDp() {
		return dp;
	}

	public int getSp() {
		return sp;
	}
}
