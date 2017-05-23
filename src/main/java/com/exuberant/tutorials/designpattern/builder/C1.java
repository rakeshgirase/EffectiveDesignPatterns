package com.exuberant.tutorials.designpattern.builder;

/**
 * Created by rakesh on 20-05-2017.
 */
public class C1 {
	int a, b, c, d, e;

	private C1(final int a, final int b, final int c, final int d, final int e) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	/**
     * Created by rakesh on 20-05-2017.
     */
    public static class C1Builder {
        boolean ag, bg, cg, dg, eg;
        int a, b, c, d, e;

        void setA(final int a) {
            this.a = a;
            ag = true;
        }

        void setB(final int b) {
            this.b = b;
            bg = true;
        }

        void setC(final int c) {
            this.c = c;
            cg = true;
        }

        void setD(final int d) {
            this.d = d;
            dg = true;
        }

        void setE(final int e) {
            this.e = e;
            eg = true;
        }

        C1 giveInstance() {
            if (!ag)
                a = 5;
            if (!bg)
                b = 6;
            if (!cg)
                c = 50;
            if (!dg)
                d = 15;
            if (!eg)
                e = 25;
            return new C1(a, b, c, d, e);
        }
    }
}
