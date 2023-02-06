package com.example.functionalInterfaces.mytryfunvinterface;

public class Main {

    public static void main(String[] args) {

        MyFunctionalInterfaceDisplay mFI_01 = new MyFunctionalInterfaceDisplay() {
            @Override
            public void displayMyFIDisplay() {
                System.out.println("mFI_01 display");
            }
        };

        MyFunctionalInterfaceSout mFI_Sout_Lambda = () -> {
            System.out.println("mFI_Sout_Lambda prints");
        };
//        MyFunctionalInterfaceSout mFISout = new MyFunctionalInterfaceSout() {
//            @Override
//            public void print() {
//
//            }
//        };

        mFI_01.displayMyFIDisplay();
        mFI_01.displayMyFIDisplay();


        MyFunctionalInterfaceDisplay mFI_02 = () -> {
            System.out.println("mFI_02 display");
        };


        MyFunctionalInterfaceSout mFISout_01 = () -> {
            System.out.println("mFISout_01 - " + MyFunctionalInterfaceSout.class.getName());
            System.out.println("mFISout_01 - " + MyFunctionalInterfaceSout.class);
        };
        mFISout_01.print();
        mFI_02.displayMyFIDisplay();
        mFI_Sout_Lambda.print();
    }

}
