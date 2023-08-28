package com.example.dev.java8.predicate;

import java.util.function.Predicate;

public class SEPubPredicate {

    /** Example showing how to use Predicates to check
     *  a Software Engineers eligibility for going to Pubs */
    public static void main(String[] args) {

        SoftwareEngineer[] list = { new SoftwareEngineer("Vinay", 21, true),
                                    new SoftwareEngineer("Akshath", 17 , true),
                                    new SoftwareEngineer("Yathin", 20 , true),
                                    new SoftwareEngineer("Varshith", 19 , false),
                                    new SoftwareEngineer("Mithinesh", 21 , false),
                                    new SoftwareEngineer("Akhil", 19 , true),
                                    };

        Predicate<SoftwareEngineer> p = se -> se.getAge()>18 && se.isHavingGF()==true;

        System.out.println("Allowed Software Engineers to Pub are:");
        for (SoftwareEngineer se: list) {

            if(p.test(se)) {
                System.out.println(se);
            }
        }

    }

}
