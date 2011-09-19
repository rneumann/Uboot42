package com.dbs.core.model;

import java.util.Set;

import org.hibernate.annotations.Entity;

/**
 * represents a user group within the clients company that is used to organize cloud users
 * 
 * @author "Rainer Neumann"
 */
@Entity
public class PortalGroup {

    Company company;
    Set<PortalUser> members;

}
