package net.aibou.spring.slimegame.core.domain.status;

public class StatusFactory {
	
	/**
	 * 初期ステータス
	 * @return
	 */
	public static Status createInitialStatus() {
		StatusBuilder statusBuilder = new StatusBuilder();
		return statusBuilder
				.hp(randomInRangeOf(4, 6))
				.mp(randomInRangeOf(2, 5))
				.ap(randomInRangeOf(3, 5))
				.dp(randomInRangeOf(3, 5))
				.sp(randomInRangeOf(3, 5))
				.build();
	}
	
	/**c
	 * 鍛えるコマンドで上昇するステータス
	 * @return
	 */
	public static Status createBuildUpStatus() {
		StatusBuilder statusBuilder = new StatusBuilder();
		return statusBuilder
				.hp(randomInRangeOf(3, 6))
				.mp(0)
				.ap(randomInRangeOf(3, 5))
				.dp(randomInRangeOf(3, 5))
				.sp(randomInRangeOf(0, 1))
				.build();
	}

	/**
	 * 勉強するコマンドで上昇するステータス
	 * @return
	 */
	public static Status createStudyStatus() {
		StatusBuilder statusBuilder = new StatusBuilder();
		return statusBuilder
				.hp(randomInRangeOf(3, 5))
				.mp(randomInRangeOf(4, 7))
				.ap(0)
				.dp(0)
				.sp(randomInRangeOf(0, 1))
				.build();
	}

	/**
	 * 猛特訓するコマンドで上昇するステータス
	 * @return
	 */
	public static Status createBuildUpHardStatus() {
		StatusBuilder statusBuilder = new StatusBuilder();
		return statusBuilder
				.hp(randomInRangeOf(4, 7))
				.mp(randomInRangeOf(3, 5))
				.ap(randomInRangeOf(3, 5))
				.dp(randomInRangeOf(3, 5))
				.sp(randomInRangeOf(3, 5))
				.build();
	}

	/**
	 * 自由にするコマンドで上昇するステータス.
	 * いずれかのステータスが2〜12の範囲で上昇する
	 * @return
	 */
	public static Status createFreeStatus() {
		StatusBuilder statusBuilder = new StatusBuilder();
		int[] status = new int[]{0, 0, 0, 0, 0};
		status[randomInRangeOf(0, 4)] = randomInRangeOf(2, 12);
		return statusBuilder
				.hp(status[0])
				.mp(status[1])
				.ap(status[2])
				.dp(status[3])
				.sp(status[4])
				.build();
	}

	/**
	 * 遊ばせるコマンドで上昇するステータス
	 * @return
	 */
	public static Status createPlayStatus() {
		StatusBuilder statusBuilder = new StatusBuilder();
		return statusBuilder
				.hp(randomInRangeOf(2, 4))
				.mp(randomInRangeOf(2, 4))
				.ap(randomInRangeOf(1, 3))
				.dp(randomInRangeOf(1, 3))
				.sp(randomInRangeOf(1, 3))
				.build();
	}

	/**
	 * 休ませるコマンドで上昇するステータス
	 * @return
	 */
	public static Status createRestStatus() {
		StatusBuilder statusBuilder = new StatusBuilder();
		return statusBuilder
				.hp(randomInRangeOf(5, 9))
				.mp(randomInRangeOf(4, 7))
				.ap(0)
				.dp(0)
				.sp(0)
				.build();
	}
	
	public static Status createNullStatus() {
		StatusBuilder statusBuilder = new StatusBuilder();
		return statusBuilder
				.hp(0)
				.mp(0)
				.ap(0)
				.dp(0)
				.sp(0)
				.build();
	}
	
	/**
	 * min以上，max以下の値をランダムに返すメソッド．
	 * minとmaxが逆でも正常処理する．
	 * @param min
	 * @param max
	 * @return
	 */
	private static int randomInRangeOf(int min, int max) {
		if(min > max) {
			min = min ^ max;
			max = min ^ max;
			min = min ^ max;
		}
		return (int)(Math.random() * (max - min + 1) + min); 
	}
}
 