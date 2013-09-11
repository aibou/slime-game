package net.aibou.spring.slimegame.core.domain.status;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import net.aibou.spring.slimegame.core.domain.status.Status;
import net.aibou.spring.slimegame.core.domain.status.StatusFactory;

import org.junit.Test;

public class StatusFactoryTest {

	@Test
	public void testCreateInitialStatus() {
		Status status = StatusFactory.createInitialStatus();
		int hp = status.getHp();
		int mp = status.getMp();
		int ap = status.getAp();
		int dp = status.getDp();
		int sp = status.getSp();
		assertThat(hp, isOneOf(4, 5, 6));
		assertThat(mp, isOneOf(2, 3, 4, 5));
		assertThat(ap, isOneOf(3, 4, 5));
		assertThat(dp, isOneOf(3, 4, 5));
		assertThat(sp, isOneOf(3, 4, 5));
	}

	@Test
	public void testCreateBuildUpStatus() {
		Status status = StatusFactory.createBuildUpStatus();
		int hp = status.getHp();
		int mp = status.getMp();
		int ap = status.getAp();
		int dp = status.getDp();
		int sp = status.getSp();
		assertThat(hp, isOneOf(3, 4, 5, 6));
		assertThat(mp, is(0));
		assertThat(ap, isOneOf(3, 4, 5));
		assertThat(dp, isOneOf(3, 4, 5));
		assertThat(sp, isOneOf(0, 1));
	}

	@Test
	public void testCreateStudyStatus() {
		Status status = StatusFactory.createStudyStatus();
		int hp = status.getHp();
		int mp = status.getMp();
		int ap = status.getAp();
		int dp = status.getDp();
		int sp = status.getSp();
		assertThat(hp, isOneOf(3, 4, 5));
		assertThat(mp, isOneOf(4, 5, 6, 7));
		assertThat(ap, is(0));
		assertThat(dp, is(0));
		assertThat(sp, isOneOf(0, 1));
	}

	@Test
	public void testCreateBuildUpHardStatus() {
		Status status = StatusFactory.createBuildUpHardStatus();
		int hp = status.getHp();
		int mp = status.getMp();
		int ap = status.getAp();
		int dp = status.getDp();
		int sp = status.getSp();

		assertThat(hp, isOneOf(4, 5, 6, 7));
		assertThat(mp, isOneOf(3, 4, 5));
		assertThat(ap, isOneOf(3, 4, 5));
		assertThat(dp, isOneOf(3, 4, 5));
		assertThat(sp, isOneOf(3, 4, 5));
	}

	@Test
	public void testCreateFreeStatus() {
		Status status = StatusFactory.createFreeStatus();
		int hp = status.getHp();
		int mp = status.getMp();
		int ap = status.getAp();
		int dp = status.getDp();
		int sp = status.getSp();

		Collection<Integer> increaseRange = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		if(hp != 0) {
			assertThat(hp, isIn(increaseRange));
			assertThat(mp, is(0));
			assertThat(ap, is(0));
			assertThat(dp, is(0));
			assertThat(sp, is(0));
			return;
		}
		
		if(mp != 0) {
			assertThat(hp, is(0));
			assertThat(mp, isIn(increaseRange));
			assertThat(ap, is(0));
			assertThat(dp, is(0));
			assertThat(sp, is(0));
			return;
		}
		
		if(ap != 0) {
			assertThat(hp, is(0));
			assertThat(mp, is(0));
			assertThat(ap, isIn(increaseRange));
			assertThat(dp, is(0));
			assertThat(sp, is(0));
			return;
		}
		
		if(dp != 0) {
			assertThat(hp, is(0));
			assertThat(mp, is(0));
			assertThat(ap, is(0));
			assertThat(dp, isIn(increaseRange));
			assertThat(sp, is(0));
			return;
		}
		
		if(sp != 0) {
			assertThat(hp, is(0));
			assertThat(mp, is(0));
			assertThat(ap, is(0));
			assertThat(dp, is(0));
			assertThat(sp, isIn(increaseRange));
			return;
		}
		fail();
	}

	@Test
	public void testCreatePlayStatus() {
		Status status = StatusFactory.createPlayStatus();
		int hp = status.getHp();
		int mp = status.getMp();
		int ap = status.getAp();
		int dp = status.getDp();
		int sp = status.getSp();
		assertThat(hp, isOneOf(2, 3, 4));
		assertThat(mp, isOneOf(2, 3, 4));
		assertThat(ap, isOneOf(1, 2, 3));
		assertThat(dp, isOneOf(1, 2, 3));
		assertThat(sp, isOneOf(1, 2, 3));
	}

	@Test
	public void testCreateRestStatus() {
		Status status = StatusFactory.createRestStatus();
		int hp = status.getHp();
		int mp = status.getMp();
		int ap = status.getAp();
		int dp = status.getDp();
		int sp = status.getSp();
		assertThat(hp, isOneOf(5, 6, 7, 8, 9));
		assertThat(mp, isOneOf(4, 5, 6, 7));
		assertThat(ap, is(0));
		assertThat(dp, is(0));
		assertThat(sp, is(0));
	}
}
