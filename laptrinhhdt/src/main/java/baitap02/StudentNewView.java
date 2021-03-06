/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap02;

import baitap01.Student;
import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class StudentNewView {

    public StudentNewView() {
    }
    
    //Hãy xây dựng view nhập dữ liệu cho 1 sinh viên
    //Kết quả trả về là 1 đối tượng kiểu Student
    public Student nhap_du_lieu_mot_sinh_vien(){
        //code của bạn ở đây
        Student result = new Student();
        return result;
    }
    
    
    //Hãy xây dựng view hiển thị danh sách các sinh viên
    public void hien_thi_danh_sach_sinh_vien(ArrayList<Student> students){
        //code của bạn ở đây
    }
    
    //Hãy xây dựng view nhập thông tin cần tìm kiếm là tên của sinh viên
    public String nhap_ten_sv_can_tim_kiem(){
        //code của bạn ở đây
        String hoten = "abc";
        return hoten;
    }
    
    //Hãy xây dựng view bổ sung thêm một sinh viên vào mot danh sach đã có
    //Theo bạn có nên viết view này hay không? Nếu không thì giải pháp thay thế ntn?
}
