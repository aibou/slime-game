package net.aibou.spring.slimegame.core.domain.status;

class StatusBuilder {
	private int hp = -1;
	private int mp = -1;
	private int ap = -1;
	private int dp = -1;
	private int sp = -1;
	private final static String ILLEGAL_ARGUMENT_MESSAGE = "マイナスの値をセットすることはできません";

	protected Status build() {
		if(hp < 0 || mp < 0 || ap < 0 || dp < 0 || sp < 0) {
			throw new IllegalStateException("設定されていないステータスがあります");
		}
		return new Status(this.hp, this.mp, this.ap, this.dp, this.sp);
	}

	protected StatusBuilder hp(int hp) {
		if(hp < 0) {
			throw new IllegalArgumentException(ILLEGAL_ARGUMENT_MESSAGE);
		}
		this.hp = hp;
		return this;
	}

	protected StatusBuilder mp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException(ILLEGAL_ARGUMENT_MESSAGE);
		}
		this.mp = mp;
		return this;
	}

	protected StatusBuilder ap(int ap) {
		if(ap < 0) {
			throw new IllegalArgumentException(ILLEGAL_ARGUMENT_MESSAGE);
		}

		this.ap = ap;
		return this;
	}

	protected StatusBuilder dp(int dp) {
		if(dp < 0) {
			throw new IllegalArgumentException(ILLEGAL_ARGUMENT_MESSAGE);
		}
		this.dp = dp;
		return this;
	}

	protected StatusBuilder sp(int sp) {
		if(sp < 0) {
			throw new IllegalArgumentException(ILLEGAL_ARGUMENT_MESSAGE);
		}
		this.sp = sp;
		return this;
	}
}
