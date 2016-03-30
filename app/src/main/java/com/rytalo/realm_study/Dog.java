package com.rytalo.realm_study;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * Created by محمد on 27/03/2016.
 */
public class Dog extends RealmObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
