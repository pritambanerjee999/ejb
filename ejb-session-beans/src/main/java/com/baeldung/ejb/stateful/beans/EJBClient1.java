package com.baeldung.ejb.stateful.beans;

import javax.ejb.EJB;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EJBClient1 {

    @EJB
    public StatefulEJB statefulEJB;


}