public class Drug {
    private String drugName;
    private String drugCode;
    private String manufacturer;

    public Drug(String drugName, String drugCode, String manufacturer) {
        this.drugName = drugName;
        this.drugCode = drugCode;
        this.manufacturer = manufacturer;
    }
    public String getDrugName() {
        return drugName;
    }
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    public String getDrugCode() {
        return drugCode;
    }
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    @Override
    public String toString() {
        return "Drug{drugName='" + drugName + '\'' + ", drugCode='" + drugCode + '\'' + ", manufacturer='" + manufacturer + '\'' + '}';
    }
}