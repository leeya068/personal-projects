package chocolatesales;

class ChocolateSale {
    private String salesPerson;
    private String country;
    private String product;

    public ChocolateSale(String salesPerson, String country, String product) {
        this.salesPerson = salesPerson;
        this.country = country;
        this.product = product;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public String getCountry() {
        return country;
    }

    public String getProduct() {
        return product;
    }

}
