class ReturnVisitor implements Visitor {
    @Override
    public void visit(DVD dvd) {
        if (dvd.isRented()) {
            dvd.setRented(false);
            System.out.println("Returning DVD: " + dvd.getTitle());
        } else {
            System.out.println("DVD " + dvd.getTitle() + " is not rented.");
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.isRented()) {
            cd.setRented(false);
            System.out.println("Returning CD: " + cd.getTitle());
        } else {
            System.out.println("CD " + cd.getTitle() + " is not rented.");
        }
    }
}