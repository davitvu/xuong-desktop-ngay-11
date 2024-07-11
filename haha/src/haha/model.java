/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haha;

/**
 *
 * @author vit
 */
public class model {
    private String maSV;
    private String hoTen;

    public model() {
    }
    
    public model(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public Object[] toDataRow() {
        return new Object[]{
            this.getMaSV(), this.getHoTen()
        };
    }
    
    public void exData() {
        System.out.println("hi");
        System.out.println("Ma SV: " + this.getMaSV());
        System.out.println("Ten: " + this.getHoTen() + "/n");
    }
}
