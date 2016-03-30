package com.rytalo.realm_study;

import io.realm.RealmObject;

/**
 * Created by محمد on 28/03/2016.
 */
public class Cat extends RealmObject {
  private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
