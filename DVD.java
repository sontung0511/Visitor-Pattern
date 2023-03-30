class DVD implements Element {
    private String title;
    private boolean rented;

    public DVD(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}