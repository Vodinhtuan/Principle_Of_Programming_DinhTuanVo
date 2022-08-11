/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311_x_lec17_vodinhtuan;

/**
 *
 * @author Admin
 */
public class SinhVien extends Nguoi{
    public double mon1, mon2, mon3;

    public SinhVien() {
    }

    public SinhVien(double mon1, double mon2, double mon3, String ma, String hoTen, String ngaySinh, boolean gioiTinh) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public double getMon1() {
        return mon1;
    }

    public void setMon1(double mon1) {
        this.mon1 = mon1;
    }

    public double getMon2() {
        return mon2;
    }

    public void setMon2(double mon2) {
        this.mon2 = mon2;
    }

    public double getMon3() {
        return mon3;
    }

    public void setMon3(double mon3) {
        this.mon3 = mon3;
    }

    @Override
    public String toString() {
        return "SinhVien{" +super.toString()+ " mon1= " + mon1 + ", mon2= " + mon2 + ", mon3= " + mon3 + " Điểm trung bình: "+tinhdtb()+")";
    }
    public double tinhdtb(){
    return (mon1+mon2+mon3)/3;
    }//(double mon1, double mon2, double mon3, String ma, String hoTen, String ngaySinh, boolean gioiTinh)
    public static void main(String[] args) {
        SinhVien a =new SinhVien(9,9,9," 001 ","Võ Đình Tuấn ","17.IV.02",true);
        System.out.println(a);
    }
}
