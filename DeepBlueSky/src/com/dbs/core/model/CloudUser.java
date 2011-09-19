package com.dbs.core.model;

import org.hibernate.annotations.Entity;

/**
 * represents a user account within a specific cloud app
 * 
 * @author "Rainer Neumann"
 */
@Entity
public class CloudUser {

    PortalUser portalUser;
    CloudApp cloudApp;
    UserProfile cloudAppProfile;

}
