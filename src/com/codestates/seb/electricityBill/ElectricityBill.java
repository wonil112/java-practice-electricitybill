package com.codestates.seb.electricityBill;

public class ElectricityBill extends ElectricityCalculator {
  public static void main(String[] args) {
    System.out.println("=".repeat(25));
    System.out.println(" 주택용 전기요금(저압) 계산기 ");
    System.out.println("=".repeat(25));

    ElectricityCalculator electricityCalculator = new ElectricityCalculator();

    electricityUseAmount = 99;
    print(electricityCalculator);
    electricityUseAmount = 150;
    print(electricityCalculator);
    electricityUseAmount = 250;
    print(electricityCalculator);
    electricityUseAmount = 301;
    print(electricityCalculator);
    electricityUseAmount = 450;
    print(electricityCalculator);
    electricityUseAmount = 510;
    print(electricityCalculator);

    //TODO:

    // 1, 100 이하인 경우 전력당 60.7 원이 부가됩니다. (사용한 전력 100 kWh 이하일 경)

    // 2, 100 이하인 경우 전력당 60.7원 부과, 100 초과인 경우 125.9원 부과 (사용한 전력이 100 kWh 초과일 경우)

    /* 저압의 경우
    100kWh 이하는 kWh당 60.7원(6070),
    100kWh 초과는 125.9원(18660),
    200kWh 초과는 187.9원(37450),
    300kWh 초과는 280.6원(65510),
    400kWh 초과는 417.7원(107280),
    500kWh 초과는 670.6원(
    의 전력량 요금을 내야 한다.

     99kWh, 150kWh, 250kWh, 301kWh, 450kWh, 510kWh 에 해당하는 요금 출력
     */

  }

  private static void print(ElectricityCalculator electricityCalculator) {
    System.out.printf("%dkWh의 전기 요금은 %.1f원 입니다.%n", electricityUseAmount, electricityCalculator.ElectricityCalculator(electricityUsePrice));
  }
}
