import lombok.Data;

@Data
public class Smartphone implements Cloneable{

    private String brandName;
    private String modelName;
    private int batterymAh;
    private  SmartphonePrice producerPricedi;
    private  SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producer, SmartphonePrice retail){
        this.brandName = brandName;
        this.modelName = modelName;
        this.producerPricedi = producer;
        this.retailPrice = retail;
    }
    @Override
    public String toString() {
        return "Smarphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPricedi +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smarphone = (Smartphone) o;
        return batterymAh == smarphone.batterymAh && brandName.equals(smarphone.brandName) && modelName.equals(smarphone.modelName) && producerPricedi.equals(smarphone.producerPricedi) && retailPrice.equals(smarphone.retailPrice);
    }
// il compilatore mi dava Objects ma non capisco xk a me non lo prende
    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPricedi, retailPrice);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
/**
 * tutti gli OVERRIDE  Ij non me li ha compilati lei.
 * come devo fare per l'autocompilazione?
 */
}




