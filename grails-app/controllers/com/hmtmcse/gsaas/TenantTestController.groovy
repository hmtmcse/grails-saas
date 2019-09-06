package com.hmtmcse.gsaas

class TenantTestController {

    def currentTenantId() {
        println("yes")
        render("Tenant: ${TenantContext.getCurrentTenant()}")
    }
}
