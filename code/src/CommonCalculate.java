import java.math.BigDecimal;

/**
 * @author jinmengnan
 * @version 1.0
 * @description
 * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
 * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
 * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 * @date 2024/4/16 19:00
 */
public class CommonCalculate extends BaseCalculateStrategy{

  /**
   * @description 获取合计金额
   * @return
   * @date 2024/4/16 19:05
   * @version 1.0
   */
  @Override
  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

}
