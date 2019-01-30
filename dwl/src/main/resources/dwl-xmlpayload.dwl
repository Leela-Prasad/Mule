%dw 1.0
%output application/java
---
{
	"toAirport" :  payload.destination,
	"operator" : (payload.airline ++ " airlines"),
	"fromAirport" :  "Bangalore"
} as :object {class:"com.boa.FlightSearch"} 