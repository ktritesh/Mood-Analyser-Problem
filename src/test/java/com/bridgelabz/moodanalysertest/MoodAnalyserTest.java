package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalysermain.MoodAnalyser;
import com.bridgelabz.moodanalysermain.MoodAnalyserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    //UC1-TC1.1
    @Test
    void givenIAmInSadMood_shouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "SAD");
    }

    //UC1-TC1.2
    @Test
    void givenIAmInAnyMood_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }

    //UC1-TC-1.1 Repeat
    @Test
    void givenIAmInSadMood_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "SAD");
    }

    //UC1-TC-1.2 Repeat
    @Test
    void givenIAmInHappyMood_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }
}
