package contracts.boats

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
Boats should be retrieveds
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
        body([["id"    : 12,
              "name"  : "YellowSubmarine",
              "depth": 7],
              ["id"    : 11,
               "name"  : "Boorplatform",
               "depth": 20],
              ["id"    : 3,
               "name"  : "Baggerboot",
               "depth": 12]
        ])
        headers {
            contentType('application/json')
        }
    }
}