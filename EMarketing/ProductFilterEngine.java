package EMarketing;

import java.util.ArrayList;
import java.util.List;

public class ProductFilterEngine {
    public List<Product> filter (List<Product> products, List<BaseProductFilter> filters){
       return products.stream()
                .filter(p -> filters.stream().allMatch(f -> f.matches(p))).toList();
    }
}
