package HomeWorks.Hw6.ex1;

public class EmployeeUtils {

//    поиск сотрудника в массиве по его имени

    public static Employee findByName(Employee[] employees, String byName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(byName)) {
                return employee;
            }
        }
        return null;
    }

//    поиск сотрудника в массиве по вхождению указанной строки в его имени

    public static Employee findBySubstring(Employee[] employees, String substring) {
        for (Employee employee : employees) {
            if (employee.getName().contains(substring)) {
                return employee;
            }
        }
        return null;
    }

    //    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double getTotalSalary(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    //    поиск наименьшей зарплаты в массиве
    public static double minSalary(Employee[] employees) {
        if (employees.length == 0) {
            System.out.println("Can't find minimum in an empty array");
            return -1;
        }
        double min = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    //    поиск наибольшей зарплаты в массиве
    public static double maxSalary(Employee[] employees) {
        if (employees.length == 0) {
            System.out.println("Can't find max in an empty array");
            return -1;
        }
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    //    поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minSubordinates(Manager[] manadgers) {
        if (manadgers.length == 0) {
            System.out.println("Can't find minimum in an empty array");
            return -1; // означает ошибку
        }
        int min = manadgers[0].getNumberOfSubordinates();
        for (Manager manager : manadgers) {
            if (manager.getNumberOfSubordinates() < min) {
                min = manager.getNumberOfSubordinates();
            }
        }
        return min;
    }

    //    поиск наибольшего количества подчиненных в массиве менеджеров
    public static int maxSubordinates(Manager[] managers) {
        if (managers.length == 0) {
            System.out.println("Can't find maximum in an empty array");
        }
        int max = managers[0].getNumberOfSubordinates();
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > max) {
                max = manager.getNumberOfSubordinates();
            }
        }
        return max;
    }

    //    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static double maxBonus(Manager[] managers) {
        if (managers.length == 0) {
            System.out.println("Cant do it!");
            return -1;
        }
        double maxBonus = managers[0].getBonus();
        for (Manager manager : managers) {
            double bonus = manager.getBonus();
            if (bonus > maxBonus) {
                maxBonus = bonus;
            }
        }
        return maxBonus;
    }

//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static double minBonus(Manager[] managers) {
        if (managers.length == 0) {
            System.out.println("Cant do it!");
            return -1;
        }
        double minBonus = managers[0].getBonus();
        for (Manager manager : managers) {
            double bonus = manager.getBonus();
            if (bonus < minBonus) {
                minBonus = bonus;
            }
        }
        return minBonus;
    }
}