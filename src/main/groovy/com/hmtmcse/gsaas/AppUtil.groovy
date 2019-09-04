package com.hmtmcse.gsaas

import grails.util.Holders

class AppUtil {

    static def getBean(String beanIdentifier) {
        try {
            return Holders.grailsApplication.mainContext.getBean(beanIdentifier)
        } catch (Exception e) {
            return null
        }
    }
}
