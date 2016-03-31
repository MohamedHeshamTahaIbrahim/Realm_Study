package com.rytalo.realm_study;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * Created by محمد on 28/03/2016.
 */
public class Person extends RealmObject {
    private String name;
    private int age;
    private Product product;
    private RealmList<Products> productses;

    @Ignore
    private int tempReference;
    private long id;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public RealmList<Products> getProductses() {
        return productses;
    }

    public void setProductses(RealmList<Products> productses) {
        this.productses = productses;
    }

    public int getTempReference() {
        return tempReference;
    }

    public void setTempReference(int tempReference) {
        this.tempReference = tempReference;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

