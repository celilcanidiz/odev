public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double  tax(){
        if (this.salary < 1000){
            return 0;
        }else if(this.salary >= 1000){
            return (this.salary / 100 * 3);
        }
        return 0;
    }

    double bonus(){
        if (this.workHours > 40){
            return ((this.workHours - 40) * 30);
        }
        return 0;
    }

    double raiseSalary(){
        if(2021 -this.hireYear < 10){
            return (this.salary / 100 * 5);
        }else if(2021 -this.hireYear > 9 && 2021 - this.hireYear < 20){
            return ((this.salary / 100 * 10));
        }else if(2021 -this.hireYear > 19){
            return((this.salary / 100 * 15)) ;
        }
        return 0;
    }

    void toStringg(){
        System.out.println("Name : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary + bonus() + raiseSalary() - tax()));
    }
}


/*
        Adı : kemal
        Maaşı : 2000.0
        Çalışma Saati : 45
        Başlangıç Yılı : 1985
        Vergi : 60.0
        Bonus : 150.0
        Maaş Artışı : 300.0
        Vergi ve Bonuslar ile birlikte maaş : 2090.0
        Toplam Maaş : 2390.0
 */
