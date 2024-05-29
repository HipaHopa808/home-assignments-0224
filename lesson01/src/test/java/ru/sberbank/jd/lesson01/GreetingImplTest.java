package ru.sberbank.jd.lesson01;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class GreetingImplTest extends TestCase {

    @Test
    public void testGetFirstName() {
        GreetingImpl main = new GreetingImpl();
        Assert.assertEquals("Дмитрий",main.getFirstName());
    }
    @Test
    public void testGetLastName() {
        GreetingImpl main = new GreetingImpl();
        Assert.assertEquals("Федоров",main.getLastName());
    }
    @Test
    public void testGetBirthYear() {
    }
    @Test
    public void testGetHobbies() {
    }
    @Test
    public void testGetRepoUrl() {
    }
    @Test
    public void testGetPhone() {
    }
    @Test
    public void testGetCourseExpectations() {
    }
}