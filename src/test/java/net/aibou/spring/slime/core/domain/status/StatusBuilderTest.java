package net.aibou.spring.slime.core.domain.status;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StatusBuilderTest {

	@Test
	public void hpメソッドは自分自身を返す() {
		StatusBuilder statusBuilder = new StatusBuilder();
		assertThat(statusBuilder.hp(5), is(sameInstance(statusBuilder)));
	}
	
	@Test
	public void mpメソッドは自分自身を返す() {
		StatusBuilder statusBuilder = new StatusBuilder();
		assertThat(statusBuilder.mp(5), is(sameInstance(statusBuilder)));
	}
	
	@Test
	public void apメソッドは自分自身を返す() {
		StatusBuilder statusBuilder = new StatusBuilder();
		assertThat(statusBuilder.ap(5), is(sameInstance(statusBuilder)));
	}
	
	@Test
	public void dpメソッドは自分自身を返す() {
		StatusBuilder statusBuilder = new StatusBuilder();
		assertThat(statusBuilder.dp(5), is(sameInstance(statusBuilder)));
	}
	
	@Test
	public void spメソッドは自分自身を返す() {
		StatusBuilder statusBuilder = new StatusBuilder();
		assertThat(statusBuilder.sp(5), is(sameInstance(statusBuilder)));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void hpメソッドに負の数を与えるとIllegalArgumentException() {
		StatusBuilder statusBuilder = new StatusBuilder();
		statusBuilder.hp(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void mpメソッドに負の数を与えるとIllegalArgumentException() {
		StatusBuilder statusBuilder = new StatusBuilder();
		statusBuilder.mp(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void apメソッドに負の数を与えるとIllegalArgumentException() {
		StatusBuilder statusBuilder = new StatusBuilder();
		statusBuilder.ap(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dpメソッドに負の数を与えるとIllegalArgumentException() {
		StatusBuilder statusBuilder = new StatusBuilder();
		statusBuilder.dp(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void spメソッドに負の数を与えるとIllegalArgumentException() {
		StatusBuilder statusBuilder = new StatusBuilder();
		statusBuilder.sp(-1);
	}

	
	@Test
	public void いずれかの値がセットされずにbuildするとIllegalStateException() {
		StatusBuilder statusBuilder = new StatusBuilder();
		try {
			statusBuilder.hp(1).mp(2).ap(3).dp(4).build();
			fail("");
		} catch (IllegalStateException e) {
			assertThat(e.getMessage(), is("設定されていないステータスがあります"));
		}
		
		statusBuilder = new StatusBuilder();
		try {
			statusBuilder.hp(1).mp(2).ap(3).sp(4).build();
			fail();
		} catch (IllegalStateException e) {
			assertThat(e.getMessage(), is("設定されていないステータスがあります"));
		}
		
		statusBuilder = new StatusBuilder();
		try {
			statusBuilder.hp(1).mp(2).dp(3).sp(4).build();
			fail();
		} catch (IllegalStateException e) {
			assertThat(e.getMessage(), is("設定されていないステータスがあります"));
		}
		
		statusBuilder = new StatusBuilder();
		try {
			statusBuilder.hp(1).ap(2).dp(3).sp(4).build();
			fail();
		} catch (IllegalStateException e) {
			assertThat(e.getMessage(), is("設定されていないステータスがあります"));
		}

		statusBuilder = new StatusBuilder();
		try {
			statusBuilder.mp(1).ap(2).dp(3).sp(4).build();
			fail();
		} catch (IllegalStateException e) {
			assertThat(e.getMessage(), is("設定されていないステータスがあります"));
		}
	}
	
	
}
