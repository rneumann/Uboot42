package com.dbs.core.model;

import java.util.Set;

import org.hibernate.annotations.Entity;

/**
 * represents a user account within the clients company that has access to cloud apps.
 * 
 * @author "Rainer Neumann"
 */
@Entity
public class PortalUser {

    Company company;
    UserProfile profile;
    Set<PortalGroup> groups;
    Set<CloudUser> cloudAccounts;

}
