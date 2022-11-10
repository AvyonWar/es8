public class Main {
    public static void main(String[] args) {
        SmartphonePrice sPrice1 = new SmartphonePrice("Euro", 200);
        SmartphonePrice sPrice2 = new SmartphonePrice("Euro", 500);
        SmartphonePrice sPrice3 = new SmartphonePrice("Euro", 700);
        SmartphonePrice sPrice4 = new SmartphonePrice("Euro", 100);

        Smartphone samsung = new Smartphone("Samsung","A3",80, sPrice1, sPrice2);
        Smartphone apple = new Smartphone("Apple","X",90, sPrice3, sPrice4);
        System.out.println(samsung.toString());
        System.out.println(apple.toString());

        if(samsung.equals(apple)){
            System.out.println("are equals!");
        }else {
            System.out.println("aren't equals!");
        }

   // non mi è chiaro il clone
        Smartphone cloneSmartphone = null;

        try{
            cloneSmartphone =(Smartphone) iphone.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            System.out.println("Unable clone the device");
        }

        System.out.println("Cloned device \n" + cloneSmartphone);

        if(iphone.equals(cloneSmartphone)){
            System.out.println("The second device and the cloned smartphone, are equals!");
        }
    }
}
/**
 * io dalle video lezioni non ho ben chiaro come funzioni la  clonatura
 * penso che andrò a vedermi dei video per capire, e una volta conclusi gli es te lo rinvio
 */




    }
}