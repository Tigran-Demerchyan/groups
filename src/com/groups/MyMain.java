package com.groups;

public class MyMain {
    public static void main(String[] args) {

        Group jazz = new Group("jazz");

        jazz.addGroup(new Group("armenian jazz"));
        jazz.addGroup(new Group("georgian jazz"));
        jazz.addItems(new Item("name", 25, "USD", new Group("group")));

        Group rock = new Group("rock");
        rock.addItems(new Item("SOAD", 500, "USD", new Group("group2")));
        Group armenianNavyBand = new Group("Armenian Navy Band");
        rock.addGroup(armenianNavyBand);
        armenianNavyBand.addGroup(new Group("Arto"));

        Group classic = new Group("classic");
        classic.addItems(new Item("Bethoven", 45, "USD", new Group("Motsart")));
        classic.addGroup(new Group("Bakh"));

        Group parent = new Group("parent");
        parent.addGroup(jazz);
        parent.addGroup(rock);
        parent.addGroup(classic);

        GroupUtils.printAllGroups(parent);

    }
}
