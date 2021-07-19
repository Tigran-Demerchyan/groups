package com.groups.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public static int idGenerator = 0;
    private int id;
    private String name;
    private List<Group> subGroups;
    private List<Item> items;
    private Group parent;

    public Group(String name) {
        this.id = idGenerator++;
        this.name = name;
        this.subGroups = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subGroups=" + subGroups +
                ", items=" + items +

                '}';
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Group> getSubGroups() {
        return subGroups;
    }

    public List<Item> getItems() {
        return items;
    }

    public Group getParent() {
        return parent;
    }

    public void setParent(Group parent) {
        this.parent = parent;
    }

    public void addGroup(Group group) {
        group.setParent(this);
        this.subGroups.add(group);

    }

    public void addItems(Item item) {
        item.setGroup(this);
        this.items.add(item);
    }
}
