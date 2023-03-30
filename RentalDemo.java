public class RentalDemo {
    public static void main(String[] args) {
        ObjectStructure rentalStore = new ObjectStructure();
        DVD dvd1 = new DVD("The Godfather");
        DVD dvd2 = new DVD("The Shawshank Redemption");
        CD cd1 = new CD("Thriller");
        CD cd2 = new CD("Back in Black");
        rentalStore.attach(dvd1);
        rentalStore.attach(dvd2);
        rentalStore.attach(cd1);
        rentalStore.attach(cd2);

        rentalStore.display(dvd1);
        rentalStore.display(dvd2);
        rentalStore.display(cd1);
        rentalStore.display(cd2);

        rentalStore.rent(dvd1);
        rentalStore.rent(dvd2);
        rentalStore.rent(cd1);
        rentalStore.rent(cd2);
        rentalStore.rent(dvd1);

        rentalStore.returnItem(dvd2);
        rentalStore.returnItem(cd1);

        rentalStore.display(dvd1);
        rentalStore.display(dvd2);
        rentalStore.display(cd1);
        rentalStore.display(cd2);
    }

}
