package org.generation.italy;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Giggio", "Topo", LocalDate.now(), 800, 12);
		Employee e2 = new Employee("Mario", "Verdi", LocalDate.now(), 2400, 12);
		Employee e3 = new Employee("Sandro", "Torino", LocalDate.now(), 1800, 14);

		Boss b1 = new Boss("Leader", "Cattivo", LocalDate.now(), 2500, 10000);
		Boss b2 = new Boss("Leonardo", "Coeno", LocalDate.now(), 3000, 8000);

		Person[] company = {e1, e2, e3, b1, b2};
		
		int minYearIncome = Integer.MAX_VALUE;
		int maxYearIncome = Integer.MIN_VALUE;
		
		Person minYearIncomePerson = null;
		Person maxYearIncomePerson = null;
		
		int maxIncomeBossValue = Integer.MIN_VALUE;
		int minIncomeEmployeeValue = Integer.MAX_VALUE;
		
		Person maxYearIncomeBoss = null;
		Person minYearIncomeEmployee = null;
		
		int sumCost = 0;
		
		for (int i=0; i<company.length; i++) {
			Person pMin = company[i];
			int minValue = pMin.getYearIncome();
			Person pMax = company[i];
			int maxValue = pMax.getYearIncome();
			
			if(minValue < minYearIncome ) {
				minYearIncome = minValue;
				minYearIncomePerson = pMin;
			}
			
			if(pMin instanceof Employee && minValue < minIncomeEmployeeValue) {
				minYearIncomeEmployee = pMin;
				minIncomeEmployeeValue =  minValue;
			}
			
			if(maxValue > maxYearIncome) {
				maxYearIncome = maxValue;
				maxYearIncomePerson = pMax;
			}

			if(pMax instanceof Boss && maxValue > maxIncomeBossValue) {
				maxYearIncomeBoss = pMax;
				maxIncomeBossValue = maxValue;
			}

			sumCost += maxValue;
			
		}
		
		int avgCost = sumCost/company.length;
		
		System.out.println("Persona con salario annuale maggiore: " + maxYearIncomePerson 
				+ "\n-------------" + "\nPersona con salario annuale minore: " + minYearIncomePerson
				+ "\n-------------" + "\nCosto totale azienda: " + sumCost
				+ "\n-------------" + "\nCosto medio azienda: " + avgCost
				+ "\n-------------" + "\nBoss con salario annuale maggiore: " + maxYearIncomeBoss
				+ "\n-------------" + "\nEmployee con salario annuale minore: " + minYearIncomeEmployee);
	}
}
