public class Person {
    public String isim;
    public int yas;

    @Override
    public boolean equals(Object diger){
        if(diger instanceof Person){
            //int b = diger.yas;
            Person person = (Person)diger;
            return (this.yas == person.yas && this.isim.equals(person.isim));
        } else{
            return false;
        }
        //return this == otherObject;
    }

    /*public boolean equals(Person diger){
        System.out.println("test");
        return (this.yas == diger.yas && this.isim.equals(diger.isim));
    }*/

    public boolean esitMi(Person diger){
        return (this.yas == diger.yas && this.isim.equals(diger.isim)); 
    }
}
