package lab_5;

class A {
    protected String a;
    protected X x;

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    @Override
    public String toString() {
        return a + " " + x.x;
    }
}

class B extends A {
    protected String b = "b";

    public B(X x) {
        super("a", x);
    }

    @Override
    public String toString() {
        return b;
    }
}

class C extends B {
    protected String c = "c";

    public C(X x) {
        super(x);
    }

    @Override
    public String toString() {
        return c;
    }
}

class D extends C {
    protected String d = "d";

    public D(X x) {
        super(x);
    }

    @Override
    public String toString() {
        return d;
    }
}

class E extends D {
    protected String e = "e";

    public E(X x) {
        super(x);
    }

    @Override
    public String toString() {
        return e;
    }
}

class F extends E {
    protected String f = "f";

    public F(X x) {
        super(x);
    }

    @Override
    public String toString() {
        return f;
    }
}

class G extends  F {
    protected String g = "g";

    public G(X x) {
        super(x);
    }

    @Override
    public String toString() {
        return g;
    }
}

class H extends G {
    protected String h = "h";

    public H(X x) {
        super(x);
    }

    @Override
    public String toString() {
        return h;
    }
}

class I extends H {
    protected String i = "i";

    public I(X x) {
        super(x);
    }

    @Override
    public String toString() {
        return i;
    }
}

class J extends I {
    protected String j = "j";

    public J(X x) {
        super(x);
    }

    @Override
    public String toString() {
        return x + " " + j + " " + a + " " + b + " " + c + " " + e + " " + f + " " + g + " " + h + " " + i;
    }
}

class X {
    String x;

    X(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return x;
    }
}



