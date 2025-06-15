package com.example.dev.collections.sets;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;
import java.util.TreeSet;

@Slf4j
public class TreeSetApp {

    public static void main(String[] args) {

        /**
         * @TreeSet:
         * 1. Maintains sorting order - natural order sorting
         * 2. Implements Navigable map
         * 3. Efficient for search, insert, delete operations
         */
        TreeSet<Integer> integerTreeSet = new TreeSet<>(Set.of(25, 30, 39, 64, 45, 12, 78, 42, 90, 49));

        log.info(integerTreeSet.toString());

        /**
         * The floor(element) is used to find the element that is less than or equal to the given element
         */
        log.info("Floor of 39 is " + + integerTreeSet.floor(39));

        /**
         * lower(element) is used for value that is strictly lower value than the given element
         */
        log.info("Lower of 39 is " + + integerTreeSet.lower(39));

        /**
         * ceiling(element) is used to find the element that is greater than or equal to the given element
         */
        log.info("Ceiling of 45 is " + integerTreeSet.ceiling(45));

        /**
         * higher(element) is used for value that is strictly greater than the given element
         */
        log.info("Ceiling of 45 is " + integerTreeSet.higher(45));

        /**
         * @Subset
         */
        log.info("Subset of 39, 45 is " + integerTreeSet.subSet(39, 45));
        //Inclusive of 45
        log.info("Subset of 39, 45 is " + integerTreeSet.subSet(39, true, 45, true));
        //Exclusive of 39
        log.info("Subset of 39, 45 is " + integerTreeSet.subSet(39, false, 45, true));
        //In between subset 39 & 45
        log.info("Subset of 39, 45 is " + integerTreeSet.subSet(39, false, 45, false));

        /**
         * @headSet
         */
        //log.info("HeadSet of 45 is " + integerTreeSet.headSet(45,true));
        log.info("HeadSet of 45 is " + integerTreeSet.headSet(45));

        /**
         * @TailSet
         */
        log.info("TailSet of 45 is " + integerTreeSet.tailSet(45));

    }
}
