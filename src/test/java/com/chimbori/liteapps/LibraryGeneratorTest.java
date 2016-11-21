package com.chimbori.liteapps;

import org.json.JSONException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Generates the library JSON file.
 */
public class LibraryGeneratorTest {
  @Test
  public void testLibraryDataIsGeneratedSuccessfully() {
    try {
      assertTrue(LibraryGenerator.generateLibraryData());
    } catch (IOException | JSONException e) {
      fail(e.getMessage());
    }
  }
}