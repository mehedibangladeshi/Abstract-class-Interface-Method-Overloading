package com.sdmag.iiuc.com.interfaceexample;

/**
 * Created by Mehedi on 7/20/2018.
 * mehedipy@gmail.com
 */
public class Main {
    public static void main(String[] args){

        Bank sonaliBank = new SonaliBank();
        Bank dhakaBank = new DhakaBank();
        Bank dutchBanglaBank = new DutchBanglaBank();



        System.out.println(sonaliBank.rateOfInterest() );
        System.out.println(dhakaBank.rateOfInterest() );
        System.out.println(dutchBanglaBank.rateOfInterest() );


    }
}
