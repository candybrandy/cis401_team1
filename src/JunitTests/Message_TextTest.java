package JunitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import cis401_team1.Message;

public class Message_TextTest {

	@Test
	public void test() {
		String userID[];
		userID = new String[2];
		Message test = new Message("Chat", userID ,"hey");
		assertEquals("hey", test.getText());
	}

}
