package com.dbs.core.model;

import java.util.Set;

/**
 * represents a user group within the clients company that is used to organize cloud users
 * 
 * @author "Rainer Neumann"
 */
public class PortalGroup {

    Company company;
    Set<PortalUser> members;
}
