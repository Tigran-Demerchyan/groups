package com.groups.util;

import com.groups.model.Group;
import com.groups.model.Item;

import java.util.List;

public class GroupUtils {

    public static void printSingleGroup(Group group) {
        System.out.println(" Id " + group.getId() + "   name " + group.getName());
        List<Item> items = group.getItems();
        for (Item curr : items) {
            System.out.println(curr);
        }
    }

    public static void printAllGroups(Group parentGroup) {
        printSingleGroup(parentGroup);
        List<Group> childGroups = parentGroup.getSubGroups();
        if (childGroups.isEmpty()) {
            return;
        }
        for (Group curr : childGroups) {
            printAllGroups(curr);
        }


    }

}
