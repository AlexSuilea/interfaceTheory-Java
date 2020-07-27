package com.alexsuilea;

public class Main {

    public static void main(String[] args) {
        ITelephone alexsPhone;
        alexsPhone = new DeskPhone(1234567);
        alexsPhone.powerOn();
        alexsPhone.callPhone(1234567);
        alexsPhone.answer();

        alexsPhone = new MobilePhone(234567);
        alexsPhone.powerOn();
        alexsPhone.callPhone(234567);
        alexsPhone.answer();
    }
}
