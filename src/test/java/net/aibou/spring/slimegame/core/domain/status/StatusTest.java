package net.aibou.spring.slimegame.core.domain.status;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import net.aibou.spring.slimegame.core.domain.status.Status;

import org.junit.Test;

public class StatusTest {

	Status status = new Status(1, 2, 3, 4, 5);

	@Test
	public void 各ステータス取得テスト() {
		assertThat(status.getHp(), is(1));
		assertThat(status.getMp(), is(2));
		assertThat(status.getAp(), is(3));
		assertThat(status.getDp(), is(4));
		assertThat(status.getSp(), is(5));
	}

	@Test
	public void ステータス加算テスト() {
		status.addStatus(new Status(6, 7, 8, 9, 10));
		assertThat(status.getHp(), is(7));
		assertThat(status.getMp(), is(9));
		assertThat(status.getAp(), is(11));
		assertThat(status.getDp(), is(13));
		assertThat(status.getSp(), is(15));
	}
}
