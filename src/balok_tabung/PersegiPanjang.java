/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balok_tabung;

/**
 *
 * @author HP
 */
public class PersegiPanjang implements MenghitungBidang {
    final double p;
    final double l; 

    PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }


    public double getP() {
        return p;
    }

    public double getL() {
        return l;
        
    }

    /**
     *
     * @return
     */
    @Override
    public double keliling() {
        return 2*(this.p+this.l);
    }

    @Override
    public double luas() {
        return  this.p * this.l;
    }
    
}
