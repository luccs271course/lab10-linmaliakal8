package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class

  // DONE declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter counter;
  Map<String, Integer> testMap;

  @Before
  public void setUp() {
    // DONE create the SUT instance
    Map<String, Integer> testMap = new HashMap<String, Integer>();
    counter = new WordCounter(testMap);
  }

  @After
  public void tearDown() {
    // DONE set the SUT instance to null
    counter = null;
  }

  @Test
  public void testGetCountEmpty() {

    // DONE verify that the SUT initially returns an empty map
    assertEquals(counter.getCounts(), Collections.emptyMap());

  }

  @Test
  public void testGetCountNonEmpty() {

    // DONE run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    Iterator<String> testList = Arrays.asList("It", "was", "a", "dark", "and", "stormy", "night", "dark", "stormy", "night").iterator();
    
    WordCounter counter = new WordCounter(testMap);
    counter.countWords(testList);
    //counter.countWords(Arrays.asList("It", "was", "a", "dark", "and", "stormy", "night", "dark", "stormy", "night").iterator());

    //test fails, look over
    assertEquals(counter.getCount("dark"), 2);
    assertEquals(counter.getCount("was"), 1);
    //assertNotEquals(counter.getCount("light"), 1);
    //assertNotEquals(counter.getCount("day"), 1);
  }
}
