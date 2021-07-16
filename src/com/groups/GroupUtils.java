package com.groups;

import java.util.List;

public class GroupUtils {

    public static void printAllItemsInGroup(Group parentGroup) {

        List<Group> subGroups = parentGroup.getSubGroups();
        System.out.println(" Group id " + parentGroup.getId());
        printItems(parentGroup.getItems());

        if (subGroups.isEmpty()) {
            return;
        }

        for (Group cur : subGroups) {
            printAllItemsInGroup(cur);
        }
    }

    private static void printItems(List<Item> items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
