package contracts.boats

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
Boats should be retrieved
""")
    request {
        method 'GET'
        url '/api/boats/'
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body(
                [
                        "boats": [["id"   : 12,
                                   "name" : "YellowSubmarine",
                                   "depth": 7],
                                  ["id"   : 11,
                                   "name" : "Boorplatform",
                                   "depth": 20],
                                  ["id"   : 3,
                                   "name" : "Baggerboot",
                                   "depth": 12]
                        ]
                ])
        headers {
            contentType('application/json')
        }
    }
}