import java.math.BigDecimal;

/**
 * @author
 * @version 1.0
 * @description
 * 3、超市做促销活动，草莓限时打 8 折。
 * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 * @date 2024/4/16 19:20
 */
public class SaleCalculate extends BaseCalculateStrategy{

  /**折扣因子
   */
  private Integer rate = 8;

  public SaleCalculate(Integer rate) {
    this.rate = rate;
  }

  public SaleCalculate() {
  }

  @Override
  public void calculateTotalPrice(String categoty, Integer size) {
    BigDecimal price = new BigDecimal(priceMap.get(categoty));
    if("草莓".equals(categoty)) {
      price = price.multiply(new BigDecimal(rate).divide(new BigDecimal(10)));
    }
    BigDecimal curPrice = new BigDecimal(size).multiply(price);
    totalPrice = totalPrice.add(curPrice);
  }

  @Override
  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

}
