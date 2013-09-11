package net.aibou.spring.slimegame.core.domain.slime;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import net.aibou.spring.slimegame.core.domain.status.Status;

import org.junit.Before;
import org.junit.Test;

public class SlimeTest {

	private Slime slime;

	@Before
	public void スライム生成() {
		slime = new Slime("スライム名", "親の名前");
	}

	@Test
	public void スライム名取得() {
		assertThat(slime.getName(), is("スライム名"));
	}
	
	@Test
	public void スライムの育て親名取得() {
		assertThat(slime.getOwnerName(), is("親の名前"));
	}
	
	@Test
	public void スライム生成直後はlastUpStatusはすべて0() {
		Status status = slime.getLastUpStatus();
		assertThat(status.getHp(), is(0));
		assertThat(status.getMp(), is(0));
		assertThat(status.getAp(), is(0));
		assertThat(status.getDp(), is(0));
		assertThat(status.getSp(), is(0));
	}

	@Test
	public void 鍛えるコマンド_上昇確認() {
		Status slimeStatus = slime.getStatus();
		int beforeHp = slimeStatus.getHp();
		int beforeMp = slimeStatus.getMp();
		int beforeAp = slimeStatus.getAp();
		int beforeDp = slimeStatus.getDp();
		int beforeSp = slimeStatus.getSp();
		Status upStatus = slime.buildUp();
		slimeStatus = slime.getStatus();
		assertThat(upStatus.getHp(), is(slimeStatus.getHp() - beforeHp));
		assertThat(upStatus.getMp(), is(slimeStatus.getMp() - beforeMp));
		assertThat(upStatus.getAp(), is(slimeStatus.getAp() - beforeAp));
		assertThat(upStatus.getDp(), is(slimeStatus.getDp() - beforeDp));
		assertThat(upStatus.getSp(), is(slimeStatus.getSp() - beforeSp));
		assertThat(upStatus, is(sameInstance(slime.getLastUpStatus())));
	}
	
	@Test
	public void 勉強するコマンド_上昇確認() {
		Status slimeStatus = slime.getStatus();
		int beforeHp = slimeStatus.getHp();
		int beforeMp = slimeStatus.getMp();
		int beforeAp = slimeStatus.getAp();
		int beforeDp = slimeStatus.getDp();
		int beforeSp = slimeStatus.getSp();
		Status upStatus = slime.study();
		slimeStatus = slime.getStatus();
		assertThat(upStatus.getHp(), is(slimeStatus.getHp() - beforeHp));
		assertThat(upStatus.getMp(), is(slimeStatus.getMp() - beforeMp));
		assertThat(upStatus.getAp(), is(slimeStatus.getAp() - beforeAp));
		assertThat(upStatus.getDp(), is(slimeStatus.getDp() - beforeDp));
		assertThat(upStatus.getSp(), is(slimeStatus.getSp() - beforeSp));
		assertThat(upStatus, is(sameInstance(slime.getLastUpStatus())));
	}

	@Test
	public void 猛特訓するコマンド_上昇確認() {
		Status slimeStatus = slime.getStatus();
		int beforeHp = slimeStatus.getHp();
		int beforeMp = slimeStatus.getMp();
		int beforeAp = slimeStatus.getAp();
		int beforeDp = slimeStatus.getDp();
		int beforeSp = slimeStatus.getSp();
		Status upStatus = slime.buildUpHard();
		slimeStatus = slime.getStatus();
		assertThat(upStatus.getHp(), is(slimeStatus.getHp() - beforeHp));
		assertThat(upStatus.getMp(), is(slimeStatus.getMp() - beforeMp));
		assertThat(upStatus.getAp(), is(slimeStatus.getAp() - beforeAp));
		assertThat(upStatus.getDp(), is(slimeStatus.getDp() - beforeDp));
		assertThat(upStatus.getSp(), is(slimeStatus.getSp() - beforeSp));
		assertThat(upStatus, is(sameInstance(slime.getLastUpStatus())));
	}

	@Test
	public void 自由にするコマンド_上昇確認() {
		Status slimeStatus = slime.getStatus();
		int beforeHp = slimeStatus.getHp();
		int beforeMp = slimeStatus.getMp();
		int beforeAp = slimeStatus.getAp();
		int beforeDp = slimeStatus.getDp();
		int beforeSp = slimeStatus.getSp();
		Status upStatus = slime.free();
		slimeStatus = slime.getStatus();
		assertThat(upStatus.getHp(), is(slimeStatus.getHp() - beforeHp));
		assertThat(upStatus.getMp(), is(slimeStatus.getMp() - beforeMp));
		assertThat(upStatus.getAp(), is(slimeStatus.getAp() - beforeAp));
		assertThat(upStatus.getDp(), is(slimeStatus.getDp() - beforeDp));
		assertThat(upStatus.getSp(), is(slimeStatus.getSp() - beforeSp));
		assertThat(upStatus, is(sameInstance(slime.getLastUpStatus())));
	}

	@Test
	public void 遊ばせるコマンド_上昇確認() {
		Status slimeStatus = slime.getStatus();
		int beforeHp = slimeStatus.getHp();
		int beforeMp = slimeStatus.getMp();
		int beforeAp = slimeStatus.getAp();
		int beforeDp = slimeStatus.getDp();
		int beforeSp = slimeStatus.getSp();
		Status upStatus = slime.play();
		slimeStatus = slime.getStatus();
		assertThat(upStatus.getHp(), is(slimeStatus.getHp() - beforeHp));
		assertThat(upStatus.getMp(), is(slimeStatus.getMp() - beforeMp));
		assertThat(upStatus.getAp(), is(slimeStatus.getAp() - beforeAp));
		assertThat(upStatus.getDp(), is(slimeStatus.getDp() - beforeDp));
		assertThat(upStatus.getSp(), is(slimeStatus.getSp() - beforeSp));
		assertThat(upStatus, is(sameInstance(slime.getLastUpStatus())));
	}
	
	@Test
	public void 休ませるコマンド_上昇確認() {
		Status slimeStatus = slime.getStatus();
		int beforeHp = slimeStatus.getHp();
		int beforeMp = slimeStatus.getMp();
		int beforeAp = slimeStatus.getAp();
		int beforeDp = slimeStatus.getDp();
		int beforeSp = slimeStatus.getSp();
		Status upStatus = slime.rest();
		slimeStatus = slime.getStatus();
		assertThat(upStatus.getHp(), is(slimeStatus.getHp() - beforeHp));
		assertThat(upStatus.getMp(), is(slimeStatus.getMp() - beforeMp));
		assertThat(upStatus.getAp(), is(slimeStatus.getAp() - beforeAp));
		assertThat(upStatus.getDp(), is(slimeStatus.getDp() - beforeDp));
		assertThat(upStatus.getSp(), is(slimeStatus.getSp() - beforeSp));
		assertThat(upStatus, is(sameInstance(slime.getLastUpStatus())));
	}
}
