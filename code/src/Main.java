import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author
 * @version 1.0
 * @description TODO
 * @date 2024/3/5 15:31
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //1、从键盘输入促销类型
    String product = scanner.nextLine();
    BaseCalculateStrategy strategy = CalculateStrategy.getStrategy(product);
    //2、从键盘输入水果种类、数量
    String line = scanner.nextLine();
    String[] split = line.split(",");
    //3、根据键盘输入累加合计
    strategy.calculateTotalPrice(split[0], Integer.valueOf(split[1]));
    strategy.calculateTotalPrice(split[2], Integer.valueOf(split[3]));
    scanner.close();

    /*strategy.calculateTotalPrice(split[0], Integer.valueOf(split[1]));
    strategy.calculateTotalPrice(split[2], Integer.valueOf(split[3]));
    strategy.calculateTotalPrice(split[4], Integer.valueOf(split[5]));*/
    //4、输出合计
    System.out.println(strategy.getTotalPrice());
  }



}