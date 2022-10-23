public class Context {
    private IStrategie strategie;

    public Context() {
        this.strategie = new IStrategieImpl();
    }
    public void process() {
        strategie.applyStrategy();
    }

    public void setStrategie(IStrategie strategie) {
        this.strategie = strategie;
    }
}
