class RentVisitor implements Visitor {
    @Override
    public void visit(DVD dvd) {
        if (!dvd.isRented()) {
            dvd.setRented(true);
            System.out.println("Renting DVD: " + dvd.getTitle());
        } else {
            System.out.println("DVD " + dvd.getTitle() + " is already rented.");
        }
    }

    @Override
    public void visit(CD cd) {
        if (!cd.isRented()) {
            cd.setRented(true);
            System.out.println("Renting CD: " + cd.getTitle());
        } else {
            System.out.println("CD " + cd.getTitle() + " is already rented.");
        }
    }
}
