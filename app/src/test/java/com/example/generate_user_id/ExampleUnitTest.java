package com.example.generate_user_id;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void password_generated() {
        GenerateUserId gen = new GenerateUserId("John", "Maxwell", "04/23/1990");
        assertEquals("jn0490max47", gen.generatePassword());
    }

    @Test
    public void username_generated(){
        GenerateUserId gen = new GenerateUserId("John", "Maxwell", "04/23/1990");
        assertEquals("jmaxwell23", gen.generateUserId());
    }
}