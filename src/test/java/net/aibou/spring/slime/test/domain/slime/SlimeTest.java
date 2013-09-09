package net.aibou.spring.slime.test.domain.slime;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import net.aibou.spring.slime.constant.StatusType;
import net.aibou.spring.slime.core.domain.slime.Slime;
import net.aibou.spring.slime.core.domain.status.Status;

import org.junit.Before;
import org.junit.Test;

public class SlimeTest {

	//@Autowired
	private Slime slime;

	@Before
	public void スライム生成() {
		slime = new Slime("スライム名", "親の名前");
	}

	@Test
	public void ステータス取得() {
		Status status = slime.getStatus();
		assertThat(status.getStatusOf(StatusType.HP), is(slime.getStatusOf(StatusType.HP)));
		assertThat(status.getStatusOf(StatusType.MP), is(slime.getStatusOf(StatusType.MP)));
		assertThat(status.getStatusOf(StatusType.AP), is(slime.getStatusOf(StatusType.AP)));
		assertThat(status.getStatusOf(StatusType.DP), is(slime.getStatusOf(StatusType.DP)));
		assertThat(status.getStatusOf(StatusType.SP), is(slime.getStatusOf(StatusType.SP)));
	}

	@Test
	public void 鍛えるコマンド_上昇パラメータ() {
		int beforeHp = slime.getStatusOf(StatusType.HP);
		int beforeMp = slime.getStatusOf(StatusType.MP);
		int beforeAp = slime.getStatusOf(StatusType.AP);
		int beforeDp = slime.getStatusOf(StatusType.DP);
		int beforeSp = slime.getStatusOf(StatusType.SP);
		Status upStatus = slime.buildUp();
		Status slimeStatus = slime.getStatus();
		assertThat(upStatus.getStatusOf(StatusType.HP) - slimeStatus.getStatusOf(StatusType.HP), is(beforeHp));
		assertThat(upStatus.getStatusOf(StatusType.MP) - slimeStatus.getStatusOf(StatusType.MP), is(beforeMp));
		assertThat(upStatus.getStatusOf(StatusType.AP) - slimeStatus.getStatusOf(StatusType.AP), is(beforeAp));
		assertThat(upStatus.getStatusOf(StatusType.DP) - slimeStatus.getStatusOf(StatusType.DP), is(beforeDp));
		assertThat(upStatus.getStatusOf(StatusType.SP) - slimeStatus.getStatusOf(StatusType.SP), is(beforeSp));
	}
}
