package com.dbs.core.model;

import org.hibernate.annotations.Entity;

/**
 * represents a cloud application that is available to a company, i.e. the assignment of a cloud app to a client
 * 
 * @author "Prof. Dr. Rainer Neumann"
 */
@Entity
public class CloudApp {

    Company client;
    CloudAppInformation cloudApp;
    ContractInformation conractInfo;

}
