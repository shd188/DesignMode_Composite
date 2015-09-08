package com.aimer.shd.designmode_composite;

/**
 * Created by shd on 2015/9/8.
 */
public abstract class Company {
    private String name;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    protected abstract void add(Company company);

    protected abstract void remove(Company company);

    protected abstract void display(int depth);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
