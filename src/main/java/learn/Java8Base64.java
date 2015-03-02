/********************************************************************
 * File Name:    Java8Base64.java
 *
 * Date Created: 2015年3月2日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package learn;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Java8Base64
{

  public static void main(String[] args) throws UnsupportedEncodingException
  {
    // Basic encode
    String asB64 = Base64.getEncoder().encodeToString("balabala".getBytes("utf-8"));
    System.out.println(asB64);
    // Basic decode
    byte[] asBytes = Base64.getDecoder().decode("YmFsYWJhbGE=");
    System.out.println(new String(asBytes, "utf-8"));

    // URL encode
    String urlEncoded = Base64.getUrlEncoder().encodeToString("subjects?abcd".getBytes("utf-8"));
    System.out.println("Using URL Alphabet: " + urlEncoded);
    // URL decode
    byte[] urlDecoded = Base64.getUrlDecoder().decode("c3ViamVjdHM_YWJjZA==");
    System.out.println(new String(urlDecoded, "utf-8"));

  }
  // CONSTANTS ------------------------------------------------------

  // CLASS VARIABLES ------------------------------------------------

  // INSTANCE VARIABLES ---------------------------------------------

  // CONSTRUCTORS ---------------------------------------------------

  // PUBLIC METHODS -------------------------------------------------

  // PROTECTED METHODS ----------------------------------------------

  // PRIVATE METHODS ------------------------------------------------

  // ACCESSOR METHODS -----------------------------------------------

}
