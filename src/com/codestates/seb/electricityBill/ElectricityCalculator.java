package com.codestates.seb.electricityBill;

public class ElectricityCalculator {

    public static int electricityUseAmount = 0;
    public static double electricityUsePrice = 0;

    public double ElectricityCalculator(double electricityUsePrice) {
        if (electricityUseAmount <= 100) {
            ElectricityCalculator.electricityUsePrice = electricityUseAmount * 60.7;
        } else if (electricityUseAmount <= 200) {
            ElectricityCalculator.electricityUsePrice = 6070 + ((electricityUseAmount - 100) * 125.9);
        } else if (electricityUseAmount <= 300) {
            ElectricityCalculator.electricityUsePrice = 18660 + ((electricityUseAmount - 200) * 187.9);
        } else if (electricityUseAmount <= 400) {
            ElectricityCalculator.electricityUsePrice = 37450 + ((electricityUseAmount - 300) * 280.6);
        } else if (electricityUseAmount <= 500) {
            ElectricityCalculator.electricityUsePrice = 65510 + ((electricityUseAmount - 400) * 417.7);
        } else {
            ElectricityCalculator.electricityUsePrice = 107280 + ((electricityUseAmount - 500) * 670.6);
        }
        return ElectricityCalculator.electricityUsePrice;
    }
}
