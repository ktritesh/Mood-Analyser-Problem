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
}
