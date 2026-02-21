package application;

import entites.Departament;
import entites.HourContract;
import entites.Worker;
import entites_enum.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main() throws ParseException {

        //ENUNCIADO:
        /*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário).
         Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário
         nesse mês*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departamentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(new Departament(departamentName), workerName, baseSalary,
                WorkLevel.valueOf(workerLevel));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date(DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration(hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();
    }
}
