package com.company.two;

import com.company.one.*;

class ProtectedDemo
{
    public static void main(String[] args)
    {
        AlphaSub myAlphaSub = new AlphaSub();
        System.out.println("myAlphaSub.getPublicField() returns " + myAlphaSub.getPublicField());
        System.out.println("myAlphaSub.getProtectedField() returns " +  myAlphaSub.getProtectedField());

        AlphaSubSub myAlphaSubSub = new AlphaSubSub();
        System.out.println("myAlphaSubSub.getPublicField() returns " + myAlphaSubSub.getPublicField());
        System.out.println("myAlphaSubSub.getProtectedField() returns " +  myAlphaSubSub.getProtectedField());

        Beta myBeta = new Beta();
        System.out.println("myBeta.getPublicField() returns " + myBeta.getPublicField());
        // only a subclass can access a protected member
        //System.out.println("myBeta.getProtectedField() returns " + myBeta.getProtectedField());

        Gamma myGamma = new Gamma();
        System.out.println("myGamma.getPublicField() returns " + myGamma.getPublicField());
        // only a subclass can access a protected member
        //System.out.println("myGamma.getProtectedField() returns " +  myGamma.getProtectedField());
    }
}