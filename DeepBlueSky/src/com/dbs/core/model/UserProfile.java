package com.dbs.core.model;

import java.util.Map;

/**
 * this class contains information on the company user that should be kept in sync with the information in the
 * different portals.
 * 
 * @author "Rainer Neumann"
 */
public class UserProfile {

    String userId;
    String password;
    String lastname;
    String firstname;
    String email;
    byte[] picture;
    Map<String,String> additionalFields;
    
}
