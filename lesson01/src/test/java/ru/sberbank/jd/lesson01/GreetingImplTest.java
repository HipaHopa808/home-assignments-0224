package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GreetingImplTest extends TestCase {
    private GreetingImpl  testobj;
    @Before
    public void setUp(){
        testobj = new GreetingImpl();
    }

    @Test
    public void testGetFirstName() {
        Assert.assertEquals("Дмитрий",testobj.getFirstName());
    }
    @Test
    public void testGetLastName() {
        Assert.assertEquals("Федоров",testobj.getLastName());
    }
    @Test
    public void testGetBirthYear() {
        Assert.assertEquals(1999,testobj.getBirthYear());
    }
    @Test
    public void testGetHobbies() {
        ArrayList<String> hobbies = (ArrayList<String>) testobj.getHobbies();
        Assert.assertEquals("Фингердрамминг", hobbies.get(0));
        Assert.assertEquals("Битмейкинг", hobbies.get(1));
    }
    @Test
    public void testGetRepoUrl() {
        Assert.assertEquals("https://github.com/HipaHopa808/home-assignments-0224",testobj.getRepoUrl());
    }
    @Test
    public void testGetPhone() {
        Assert.assertEquals("89171098924",testobj.getPhone());
    }
    @Test
    public void testGetCourseExpectations() {
        ArrayList<String> expectations = (ArrayList<String>) testobj.getCourseExpectations();
        Assert.assertEquals("Научиться программированию на Java для последующей смены профессии.", expectations.get(0));
        Assert.assertEquals("Наработать навык работы в команде разработки", expectations.get(1));
    }
}