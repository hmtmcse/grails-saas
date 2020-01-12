package com.hmtmcse.gsaas


import grails.plugins.Plugin

class GrailsSaasGrailsPlugin extends Plugin {


    def grailsVersion = "3.3.4 > *"
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]
    def version = "1.0.0"

    def title = "SaaS"
    def author = "H.M.Touhid Mia"
    def authorEmail = "hmtm.cse@gmail.com"
    def profiles = ['web']
    def documentation = "http://grails.org/plugin/saas"


    Closure doWithSpring() {
        { ->
            tenantIdResolver(TenantIdResolver)
            tenantContext(TenantContext)
        }
    }

}
