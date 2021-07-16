package com.groups;

public class MyMain {

    public static void main(String[] args) {
        Group parentGroup = new Group(0);


        parentGroup.addItem(new Item("some song", 10, "USD"));
        parentGroup.addItem(new Item("some song", 12, "USD"));


        Group rock = new Group(1);
        rock.addItem(new Item("rock 1", 10, "USD"));
        rock.addItem(new Item("rock 1 ", 44, "USD"));

        Group jazz = new Group(2);
        jazz.addItem(new Item("jazz 2 item 1", 2, "USD"));
        jazz.addItem(new Item("jazz 2 item 2", 44, "USD"));


        parentGroup.addGroup(rock);
        parentGroup.addGroup(jazz);

        GroupUtils.printAllItemsInGroup(parentGroup);
    }
}
