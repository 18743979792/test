import java.util.Scanner;

/**
 * @author
 * @version 1.0
 * @description 促销子类获取策略
 * @date 2024/4/16 19:34
 */
public class CalculateStrategy {

  public static BaseCalculateStrategy getStrategy(String type) {
    BaseCalculateStrategy baseCalculateStrategy = new CommonCalculate();
    switch (type) {
      case "无活动" :
        baseCalculateStrategy = new CommonCalculate();
        break;
        case "促销活动" :
          baseCalculateStrategy = new SaleCalculate();
          break;
        case "促销满减活动" :
        baseCalculateStrategy = new DiscountCalculate();
        break;
    }
    return baseCalculateStrategy;
  }

}
