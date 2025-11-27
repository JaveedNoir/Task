package EMarketing;


public class StockFilter extends BaseProductFilter {

    int minStock;

    public StockFilter(int minStock) {
        super("StockFilter");
        this.minStock = minStock;
    }

    @Override
    public boolean matches(Product p) {
       return p.stock >= minStock;
    }
}
