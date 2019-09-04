package com.hmtmcse.gsaas

class TenantTestController {

    def currentTenantId() {
        render("Tenant: ${TenantContext.getCurrentTenant()}")
    }
}
