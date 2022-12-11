package ocp.java.mock.test2;


interface House {
    public default void lockTheGates() {
        System.out.println("Locking House");
    }
}

interface Office {
    public void lockTheGates();
}

class HomeOffice implements House, Office {
    @Override
    public void lockTheGates() {
        House.super.lockTheGates();
    }
}//1

class TestClass3 {
    public static void main(String[] args) {
        Office off = new HomeOffice();  //2
        off.lockTheGates(); //3
        House home = (House) off; //4
        home.lockTheGates(); //5
    }
}


