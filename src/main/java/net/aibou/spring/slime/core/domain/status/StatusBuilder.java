package net.aibou.spring.slime.core.domain.status;

class StatusBuilder {
	private int hp;
	private int mp;
	private int ap;
	private int dp;
	private int sp;

	protected Status build() {
		return new Status(this.hp, this.mp, this.ap, this.dp, this.sp);
	}

	protected StatusBuilder hp(int hp) {
		this.hp = hp;
		return this;
	}

	protected StatusBuilder mp(int mp) {
		this.mp = mp;
		return this;
	}

	protected StatusBuilder ap(int ap) {
		this.ap = ap;
		return this;
	}

	protected StatusBuilder dp(int dp) {
		this.dp = dp;
		return this;
	}

	protected StatusBuilder sp(int sp) {
		this.sp = sp;
		return this;
	}
}
