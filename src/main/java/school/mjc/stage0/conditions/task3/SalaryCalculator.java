package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void main(String [] args){
        calculateSalary(5000);
    }
    public static void calculateSalary(int salary) {
        if (salary < 0){
            System.out.println("wrong input!");
        } else if (salary <= 10000 ){
            System.out.println(salary * 0.85);
        } else if (salary > 10000 && salary <= 20000){
            System.out.println(salary * 0.82);
        } else if (salary > 20000){
            System.out.println(salary * 0.80);
        }
    }
}
