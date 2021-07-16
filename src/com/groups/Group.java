package com.groups;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private int id;

    private final List<Group> subGroups;
    private final List<Item> items;

    public Group(int id){
        this.id = id;
        this.subGroups = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void addGroup(Group group) {
        this.subGroups.add(group);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }


    public int getId() {
        return id;
    }

    public List<Group> getSubGroups() {
        return subGroups;
    }

    public List<Item> getItems() {
        return items;
    }
}
