package com.groups;

import com.groups.model.Group;
import com.groups.model.Item;
import com.groups.util.GroupUtils;
import com.groups.util.Storage;

import java.util.List;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

//        Group jazz = new Group("jazz");
//
//        jazz.addGroup(new Group("armenian jazz"));
//        jazz.addGroup(new Group("georgian jazz"));
//        jazz.addItems(new Item("name", 25, "USD", new Group("group")));
//
//        Group rock = new Group("rock");
//        rock.addItems(new Item("SOAD", 500, "USD", new Group("group2")));
//        Group armenianNavyBand = new Group("Armenian Navy Band");
//        rock.addGroup(armenianNavyBand);
//        armenianNavyBand.addGroup(new Group("Arto"));
//
//        Group classic = new Group("classic");
//        classic.addItems(new Item("Bethoven", 45, "USD", new Group("Motsart")));
//        classic.addGroup(new Group("Bakh"));
//
//        Group parent = new Group("parent");
//        parent.addGroup(jazz);
//        parent.addGroup(rock);
//        parent.addGroup(classic);
//
//        GroupUtils.printAllGroups(parent);

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
