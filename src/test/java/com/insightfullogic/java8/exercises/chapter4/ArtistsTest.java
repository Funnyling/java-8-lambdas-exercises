package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArtistsTest {

    private final Artists optionalExamples = new Artists(SampleData.getThreeArtists());

    @Test
    public void indexWithinRange() {
        assertTrue(optionalExamples.getArtist(0).isPresent());
    }

    @Test
    public void indexOutsideRange() {
        assertFalse(optionalExamples.getArtist(4).isPresent());
    }

    @Test
    public void nameIndexInsideRange() {
        String artist = optionalExamples.getArtistName(0);
        assertEquals("John Coltrane", artist);
    }

    @Test
    public void nameIndexOutsideRange() {
        String artist = optionalExamples.getArtistName(4);
        assertEquals("unknown", artist);
    }

}
