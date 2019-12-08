package lab_5;

class A {
    public String a = "a";

    @Override
    public String toString() {
        return a;
    }
}

class B extends A {
    public String b = "b";

    @Override
    public String toString() {
        return b;
    }
}

class C extends B {
    public String c = "c";

    @Override
    public String toString() {
        return c;
    }
}

class D extends C {
    public String d = "d";

    @Override
    public String toString() {
        return d;
    }
}

class E extends D {
    public String e = "e";

    @Override
    public String toString() {
        return e;
    }
}

class F extends E {
    public String f = "f";

    @Override
    public String toString() {
        return f;
    }
}

class G extends  F {
    public String g = "g";

    @Override
    public String toString() {
        return g;
    }
}

class H extends G {
    public String h = "h";

    @Override
    public String toString() {
        return h;
    }
}

class I extends H {
    public String i = "i";

    @Override
    public String toString() {
        return i;
    }
}

class J extends I {
    public String j = "j";

    @Override
    public String toString() {
        return j;
    }
}




