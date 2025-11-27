package EMarketing;

public abstract class BaseProductFilter {

    protected String filterName;

    public BaseProductFilter(String filterName) {
        this.filterName = filterName;
    }

    public abstract boolean matches(Product p);
}
