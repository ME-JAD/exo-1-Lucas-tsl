package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private final Bar bar;
    private final ArrayList<Baz> bazs = new ArrayList<>();
    private final Qux qux = new Qux();
    private Corge corge;

    public Foo(final Bar bar) {
        this.bar = bar;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public Bar getBar() {
        return this.bar;
    }

    public List<Baz> getBazs() {
        return new ArrayList<>(this.bazs);
    }

    public void addBaz(final Baz baz) {
        this.bazs.add(baz);
    }
}
