package com.company;

public class Employee {
    Employee e1;
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        double tax;
        if(salary <= 1000){
            tax = 0;
        }
        else{
            tax = salary * 0.3;
        }
        return tax;
    }

    public double bonus(int workHours){
        double bonus;
        if(workHours >= 40){
            bonus = workHours * 30;
        }
        else {
            bonus = 0;
        }
        return bonus;
    }

    public double raiseSalary(double salary, int hireYear){
        double artis = 0;
        if(2021-hireYear < 10){
            artis = (salary*0.05);
        }
        else if(2021-hireYear >= 9 && 2021-hireYear < 20){
            artis = (salary*0.1);
        }
        else if(2021-hireYear >= 19){
            artis = (salary*0.15);
        }
        return artis;
    }

    public void yazdir(){
        double maasArtisi = e1.bonus(e1.workHours);
        double maas = e1.salary + e1.bonus(e1.workHours) + e1.tax(e1.salary);
        double maasSon = maas + e1.raiseSalary(e1.salary, e1.hireYear);

        System.out.println("Adi : "+name);
        System.out.println("Maasi : "+salary);
        System.out.println("Calisma Saati : "+workHours);
        System.out.println("Baslangic Yili : "+hireYear);
        System.out.println("Vergi : "+tax(salary));
        System.out.println("Bonus : "+bonus(workHours));
        System.out.println("Maas Artisi : "+ maasArtisi);
        System.out.println("Vegi ve Bonuslar ile Maas : "+ maas);
        System.out.println("Toplam Maas : "+ maasSon);
    }

    

}
