package com.dbs.core.model;

import java.util.Set;

/**
 * this class represents a client of the portal. Each client has a number of users and groups linked to company users
 * and groups. Additionally, each client has a number of cloud services that are used by or available to users.
 * 
 * @author "Rainer Neumann"
 */
public class Company {

    String mnemonic;
    String companyName;
    Set<CloudApp> availableApps;

}
