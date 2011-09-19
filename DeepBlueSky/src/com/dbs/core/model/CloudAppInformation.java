package com.dbs.core.model;

import org.hibernate.annotations.Entity;

/**
 * represents a cloud application including all the descriptive an meta information.
 * 
 * @author "Rainer Neumann"
 */
@Entity
public class CloudAppInformation {

    String name;
    String baseUrl;
    
    // TODO: should we add program specific meta information such as workflow handlers here?

}
