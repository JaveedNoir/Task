package EMarketing;

public class PriceFilter extends BaseProductFilter{
    double minPrice;

    public PriceFilter(double minPrice) {
        super("PriceFilter");
        this.minPrice = minPrice;
    }

    @Override
    public boolean matches(Product p) {
      return   p.price >= minPrice;
    }
}
