package com.groups;

import com.groups.model.Group;
import com.groups.model.Item;
import com.groups.util.GroupUtils;
import com.groups.util.Storage;

import java.util.List;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {


        Storage storage = new Storage();

        Scanner scanner = new Scanner(System.in);

        String line;
        do {
            System.out.println("Insert group name");
            line = scanner.next();
            Group group = new Group(line);
            storage.addNewGroup(group);
        } while (!line.equals("exit"));


        List<Group> groups = storage.getGroups();

        for (Group group : groups) {
            System.out.println(group);
        }



    }
}
