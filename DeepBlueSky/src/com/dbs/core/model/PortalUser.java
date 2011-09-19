package com.dbs.core.model;

import java.util.Set;

/**
 * represents a user account within the clients company that has access to cloud apps.
 * 
 * @author "Rainer Neumann"
 */
public class PortalUser {

    Company company;
    UserProfile profile;
    Set<PortalGroup> groups;

}
