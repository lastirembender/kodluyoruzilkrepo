package com.company;

public class Student{
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat_sozlu, int mat_yazili, int fizik_sozlu, int fizik_yazili, int kimya_sozlu, int kimya_yazili) {

        if (mat_sozlu >= 0 && mat_sozlu <= 100) {
            this.mat.note_sozlu = mat_sozlu;
        }

        if (mat_yazili >= 0 && mat_yazili <= 100) {
            this.mat.note_yazili = mat_yazili;
        }

        if (fizik_sozlu >= 0 && fizik_sozlu <= 100) {
            this.fizik.note_sozlu = fizik_sozlu;
        }

        if (fizik_yazili >= 0 && fizik_yazili <= 100) {
            this.fizik.note_yazili = fizik_yazili;
        }

        if (kimya_sozlu >= 0 && kimya_sozlu <= 100) {
            this.kimya.note_sozlu = kimya_sozlu;
        }

        if (kimya_yazili >= 0 && kimya_yazili <= 100) {
            this.kimya.note_yazili = kimya_yazili;
        }

    }

    public void isPass() {
        if (this.mat.note_sozlu == 0 || this.mat.note_yazili == 0 || this.fizik.note_sozlu == 0 || this.fizik.note_yazili == 0 || this.kimya.note_sozlu == 0 || this.kimya.note_yazili == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note_sozlu*0.2+this.fizik.note_yazili*0.8) + (this.kimya.note_sozlu*0.2 + this.kimya.note_yazili*0.8) + (this.mat.note_sozlu*0.2 + this.mat.note_yazili*0.8) / 3);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sözlü Notu : " + this.mat.note_sozlu);
        System.out.println("Matematik Yazılı Notu : " + this.mat.note_yazili);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.note_sozlu);
        System.out.println("Fizik Yazılı Notu : " + this.fizik.note_yazili);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.note_sozlu);
        System.out.println("Kimya Yazılı Notu : " + this.kimya.note_yazili);
    }

}