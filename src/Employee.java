
public class Employee {
    String name;
    float salary;
    int workHours;
    int hireYear;

    Employee(String name,float salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public float tax() {
        float vergi=0;
        if(salary>1000)
            vergi = salary * 3 / 100;
        return vergi;
    }
    public float bonus() {
        float bonus=0;
        if(workHours>40)
            bonus=(workHours-40)*30;
        return bonus;
    }
    public float raiseSalary() {
        float raiseSalary=0;
        int worksTime = 2021-hireYear;
        if(worksTime<10)
            raiseSalary = salary*5/100;

        else if(worksTime >=10 && worksTime<20)
            raiseSalary = salary*1/10;

        else if(worksTime>=20)
            raiseSalary = salary*15/100;

        else
            ;
        return raiseSalary;
    }

    @Override
    public String toString() {
        String output;
        float vergi=tax();
        float Bonus= bonus();
        float raiseSalary=raiseSalary();
        float cikarma = Bonus-vergi;
        output="Adı : "+name+"\nMaaşı : "+salary+"\nÇalışma Saati : "+workHours+"\nBaşlangıç Yılı : "+hireYear+"\nVergi: "+vergi+
                "\nBonus : "+Bonus+"\nMaaş Artışı : "+raiseSalary+"\nVergi ve Bonuslar ile birlikte maaş : "+(salary+cikarma)+
                "\nToplam Maaş : "+(salary+raiseSalary+cikarma);

        System.out.println(output);
        return output;
    }


}

