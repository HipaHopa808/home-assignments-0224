package ru.sberbank.jd.lesson01;

import java.util.ArrayList;
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
        Collection<String> hobbies = new ArrayList<>();
        hobbies.add("Фингердрамминг");
        hobbies.add("Битмейкинг");
        return hobbies;

    }

    @Override
    public String getRepoUrl() {
        return "https://github.com/HipaHopa808/home-assignments-0224";
    }

    @Override
    public String getPhone() {
        return "89171098924";
    }

    @Override
    public Collection<String> getCourseExpectations() {
        Collection<String> expectations = new ArrayList<>();
        expectations.add("Научиться программированию на Java для последующей смены профессии.");
        expectations.add("Наработать навык работы в команде разработки");
        return expectations;

    }

}
