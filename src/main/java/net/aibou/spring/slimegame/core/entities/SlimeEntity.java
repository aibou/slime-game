package net.aibou.spring.slimegame.core.entities;

/**
 * Slimeの情報を格納するクラス
 * @author hamaji_ryosuke
 *
 */
public class SlimeEntity {
	private String name;
	private String ownerName;
	private int hp;
	private int mp;
	private int ap;
	private int dp;
	private int sp;

	/**
	 * SlimeエンティティのBuilderクラス.
	 * @author hamaji_ryosuke
	 *
	 */
	public class Builder {

		private String name;
		private String owner;
		private int hp;
		private int mp;
		private int ap;
		private int dp;
		private int sp;

		public Builder() { }

		public SlimeEntity build() {
			SlimeEntity slime =  new SlimeEntity();
			slime.name = this.name;
			slime.ownerName = this.owner;
			slime.hp = this.hp;
			slime.mp = this.mp;
			slime.ap = this.ap;
			slime.dp = this.dp;
			slime.sp = this.sp;
			return slime;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder owner(String owner) {
			this.owner = owner;
			return this;
		}

		public Builder hp(int hp) {
			this.hp = hp;
			return this;
		}

		public Builder mp(int mp) {
			this.mp = mp;
			return this;
		}

		public Builder ap(int ap) {
			this.ap = ap;
			return this;
		}

		public Builder dp(int dp) {
			this.dp = dp;
			return this;
		}

		public Builder sp(int sp) {
			this.sp = sp;
			return this;
		}
	}
	
	public String getName() {
		return name;
	}

	public String getOwner() {
		return ownerName;
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
