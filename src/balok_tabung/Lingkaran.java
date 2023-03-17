/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balok_tabung;

/**
 *
 * @author HP
 */
public class Lingkaran implements MenghitungBidang{
  private double jari;
  public final double PHI = ((double) 22 / 7);

  public Lingkaran(double jari) {
    this.jari = jari;
  }

  public double getJari() {
    return this.jari;
  }

  public void setJari(double jari) {
    this.jari = jari;
  }

    @Override
    public double keliling() {
         return PHI * this.jari * 2;
    }

    @Override
    public double luas() {
        return PHI * this.jari * this.jari;
  }
    }

