import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jls
 * @version jls1.0
 * @description TODO
 * @date 2024/4/16 19:17
 */
public abstract class BaseCalculateStrategy{

  /**价格map
   */
  Map<String, Double> priceMap = new HashMap<>();

  /**初始合计
   */
  BigDecimal totalPrice = BigDecimal.ZERO;

  /**初始化价格
   */
  public BaseCalculateStrategy() {
    priceMap.put("苹果", 8.0);
    priceMap.put("草莓", 8.0);
    priceMap.put("芒果", 8.0);
  }

  /**
   * @description
   * 默认累加合计方法
   * @return
   * @author jinmengnan
   * @date 2024/4/16 18:54
   * @version 1.0
   */
   public void calculateTotalPrice(String categoty, Integer size) {
    BigDecimal curPrice = new BigDecimal(size).multiply(new BigDecimal(priceMap.get(categoty)));
    totalPrice = totalPrice.add(curPrice);
  }

  public abstract BigDecimal getTotalPrice();

}
