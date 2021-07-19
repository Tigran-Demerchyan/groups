package com.groups.util;

import com.groups.model.Group;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Group> groups;

    public Storage() {
        this.groups = new ArrayList<>();
    }

    public void addNewGroup(Group group) {
        groups.add(group);
    }


    public List<Group> getGroups() {
        return groups;
    }
}
