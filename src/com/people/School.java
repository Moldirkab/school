package com.people;

import java.util.ArrayList;

public class School {
    private final ArrayList<Person> members;
    public School() {
        members = new ArrayList<>();
    }
    public void addMember(Person person) {
        members.add(person);
    }

    public ArrayList<Person> getMembers() {
        return members;
    }
    public void bubbleSort() {
        for (int i = 0; i < members.size() - 1; i++) {
            for (int j = 0; j < members.size() - 1 - i; j++) {
                if (members.get(j).getSurname().compareTo(members.get(j + 1).getSurname()) > 0) {
                    Person temp = members.get(j);
                    members.set(j, members.get(j + 1));
                    members.set(j + 1, temp);
                }
            }
        }
        for (Person person : members) {
            System.out.println(person);
        }
    }
}