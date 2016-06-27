package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;

public class Question2 {
    // Q3
    public static int countBandMembersInternal(List<Artist> artists) {
        /*
            artists.stream()
                .mapToLong(artist -> artist.getMembers().count())
                .sum() and have to cast sum result to int

                artists.stream()
                .mapToInt(artist -> Long.valueOf(artist.getMembers().count()).intValue())
                .sum();
                autoboxing long to Long object was done to get intValue
         */

        return artists.stream()
                .map(artist -> artist.getMembers().count())
                .reduce(0L , Long::sum).intValue();
    }
}
