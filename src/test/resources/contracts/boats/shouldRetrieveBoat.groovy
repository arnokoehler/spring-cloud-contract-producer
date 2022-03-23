package contracts.boats

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
One boat should be retrieved
""")
    request {
        method 'GET'
        url '/api/boats/1'
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body(["id"    : 12,
              "name"  : "YellowSubmarine",
              "depth": 7])
        headers {
            contentType('application/json')
        }
    }
}