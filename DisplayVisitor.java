class DisplayVisitor implements Visitor {
    @Override
    public void visit(DVD dvd) {
        System.out.println("DVD: " + dvd.getTitle() + ", rented: " + dvd.isRented());
    }

    @Override
    public void visit(CD cd) {
        System.out.println("CD: " + cd.getTitle() + ", rented: " + cd.isRented());
    }
}