/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balok_tabung;

/**
 *
 * @author HP
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private final double tinggi;

    public Balok(double p, double l, double t) {
        super(p, l);
        this.tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }
    

    @Override
    public double volume() {
        return getTinggi() * this.luas();
        
    }

    @Override
    public double luasPermukaan() {
      return 2*((this.luas())+ super.l * getTinggi()+ super.p * getTinggi());
    
    
}
}
