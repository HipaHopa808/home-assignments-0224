package ru.sberbank.jd.lesson01;

import java.util.Collection;

public class GreetingImpl implements Greeting{

    @Override
    public String getFirstName(){
        return "Дмитрий";
    }

    @Override
    public String getLastName() {
        return "Федоров";
    }

    @Override
    public int getBirthYear() {
        return 1999;
    }

    @Override
    public Collection<String> getHobbies() {
        return ;
    }

    @Override
    public String getRepoUrl() {
        return null;
    }

    @Override
    public String getPhone() {
        return null;
    }

    @Override
    public Collection<String> getCourseExpectations() {
        return null;
    }

}
