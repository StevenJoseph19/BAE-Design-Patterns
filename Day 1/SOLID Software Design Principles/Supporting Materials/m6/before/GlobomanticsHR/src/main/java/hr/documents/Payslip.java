package hr.documents;

import hr.personnel.Employee;

import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Payslip implements ExportableDocument {
    private String employeeName;
    private int monthlyIncome;
    private Month month;

    public Payslip(Employee employee, Month month) {
        this.employeeName = employee.getFullName();
        this.monthlyIncome = employee.getMonthlyIncome();
        this.month = month;
    }

    public Month getMonth() {
        return month;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toTxt() {
        StringBuilder sb = new StringBuilder();
        sb.append("MONTH: ").append(this.month);
        sb.append(System.lineSeparator());
        sb.append("NAME: ").append(this.employeeName);
        sb.append(System.lineSeparator());
        sb.append("INCOME: ").append(this.monthlyIncome);
        sb.append(System.lineSeparator());

        return sb.toString();
    }

    @Override
    public byte[] toPdf() {
        List<String> list = Arrays.asList("ana","are");
      

        throw new UnsupportedOperationException();
    }

    @Override
    public String toJson() {
        throw new UnsupportedOperationException();
    }
}
