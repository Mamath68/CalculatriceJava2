package tests;

public class Test {

    private final double[] num;

    public Test(double[] num) {

        this.num = num;
    }

    public double addition() {
        return this.num[0] + this.num[1] * this.num[2];
    }

    public double soustraction() {
        return this.num[0] - this.num[1] * this.num[2];
    }

    public double multiplication() {
        return this.num[0] * this.num[1] * this.num[2];
    }

    public double division() {
        return this.num[0] / this.num[1] * this.num[2];
    }

    public double modulo() {
        return this.num[0] % this.num[1] * this.num[2];
    }

    public double puissance() {
        return Math.pow(this.num[0], this.num[1] * this.num[2]);
    }

    public double racineCarree() {
        return Math.sqrt(this.num[0] + this.num[1] * this.num[2]);
    }

    public double racineCube() {
        return Math.cbrt(this.num[0] + this.num[1] * this.num[2]);
    }

    public double logarithmeNeperien() {
        return Math.log(this.num[0] + this.num[1] * this.num[2]);
    }

    public double logarithmeBaseDix() {
        return Math.log10(this.num[0] + this.num[1] * this.num[2]);
    }

    public double logarithmeBaseDeux() {
        return Math.log(this.num[0] + this.num[1] * this.num[2]) / Math.log(2);
    }

    public double exponentielle() {
        return Math.exp(this.num[0] + this.num[1] * this.num[2]);
    }

    public double sinus() {
        return Math.sin(this.num[0] + this.num[1] * this.num[2]);
    }

    public double cosinus() {
        return Math.cos(this.num[0] + this.num[1] * this.num[2]);
    }

    public double tangente() {
        return Math.tan(this.num[0] + this.num[1] * this.num[2]);
    }
}
