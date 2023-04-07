package org.fasttrackit.homework7.animal;

public class Cat implements Animal {
    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public String talk() {
        return "meow";
    }

    @Override
    public String eat() {
        return "cat-eating";
    }

    public String purr() {
        return "rrrr";
    }
}
