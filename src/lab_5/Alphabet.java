package lab_5;

class A {
    public String a;

    A(String state){
        a = state;
    }

    static String get_state(String a) {
        return a;
    }
}

class B extends A {
    public static String b;

    B(String state) {
        super(state);
    }
}

class C extends B {
    public static String c;

    C(String state) {
        super(state);
    }
}

class D extends C {
    public static String d;

    D(String state) {
        super(state);
    }
}

class E extends D {
    public static String e;

    E(String state) {
        super(state);
    }
}

class F extends E {
    public static String f;

    F(String state) {
        super(state);
    }
}

class G extends  F {
    public static String g;

    G(String state) {
        super(state);
    }
}

class H extends G {
    public static String h;

    H(String state) {
        super(state);
    }
}

class I extends H {
    public static String i;

    I(String state) {
        super(state);
    }
}

class J extends I {
    public static String j;

    J(String state) {
        super(state);
    }
}


