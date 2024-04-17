import java.math.BigDecimal;

/**
 * @author
 * @version 1.0
 * @description
 * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
 * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 * @date 2024/4/16 19:24
 */
public class DiscountCalculate extends BaseCalculateStrategy{

  /**折扣因子
   */
  private Integer rate = 8;

  /**满减单元
   */
  private Double full = 100.0;

  /**满减金额
   */
  private Double discount = 10.0;

  public DiscountCalculate(Integer rate, Double full, Double discount) {
    this.rate = rate;
    this.full = full;
    this.discount = discount;
  }

  public DiscountCalculate() {
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
    BigDecimal divide = totalPrice.divide(new BigDecimal(full));
    totalPrice = totalPrice.subtract(divide.multiply(new BigDecimal(discount)));
    return totalPrice;
  }
}
