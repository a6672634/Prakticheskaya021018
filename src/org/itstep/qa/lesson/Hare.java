package org.itstep.qa.lesson;

public class Hare {
    private double born;
    private double born1;
    private double now;
    private double now1;
    private double prig;
    private double prig1;
    private double kolprig;


    public Hare (double born, double born1, double now, double now1, double prig, double prig1, double kolprig){
        this.born = born;
        this.born1 = born1;
        this.now = now;
        this.now1 = now1;
        this.prig = prig;
        this.prig1 = prig1;
        this.kolprig = kolprig;
    }



    public void Prigok (double nd, double ns){
        now += nd;
        now1 += ns;
    }


    public double getBorn() {
        return born;
    }

    public void setBorn(double born) {
        this.born = born;
    }

    public double getBorn1() {
        return born1;
    }

    public void setBorn1(double born1) {
        this.born1 = born1;
    }

    public double getNow() {
        return now;
    }

    public void setNow(double now) {
        this.now = now;
    }

    public double getNow1() {
        return now1;
    }

    public void setNow1(double now1) {
        this.now1 = now1;
    }

}
