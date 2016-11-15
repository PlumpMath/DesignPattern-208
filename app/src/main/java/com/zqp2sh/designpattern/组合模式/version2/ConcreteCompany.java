package com.zqp2sh.designpattern.组合模式.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 19:55
 */

public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        if (children.contains(company)) {
            children.remove(company);
        }
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(mName);
        for (Company c : children) {
            c.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company c : children) {
            c.lineOfDuty();
        }
    }
}
