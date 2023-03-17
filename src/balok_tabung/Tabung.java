/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balok_tabung;

/**
 *
 * @author HP
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
     private double tinggi = 0;
     
    public Tabung(double r, double t) {
    super(r);
    this.tinggi = t;
  }

  public double getTinggi() {
    return tinggi;
  }

    @Override
    public double volume() {
        
        return this.luas() * getTinggi();
    }

    @Override
    public double luasPermukaan() {
        return 2 * this.luas() + this.keliling() * getTinggi();
    }

    

    
     

   
    
}
