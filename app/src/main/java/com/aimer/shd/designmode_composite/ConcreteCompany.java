package com.aimer.shd.designmode_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shd on 2015/9/8.
 */
public class ConcreteCompany extends Company {

    private List<Company> mCompanies;

    public ConcreteCompany(String name) {
        super(name);
        mCompanies = new ArrayList<>();
    }

    public ConcreteCompany() {
        mCompanies = new ArrayList<>();
    }

    @Override
    protected void add(Company company) {
        mCompanies.add(company);
    }

    @Override
    protected void remove(Company company) {
        mCompanies.remove(company);
    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
        for (Company c : mCompanies) {
            c.display(depth + 2);
        }
    }
}
