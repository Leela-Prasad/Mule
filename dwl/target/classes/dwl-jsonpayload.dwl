%dw 1.0
%output application/json
---
{
	"toAirport" :  payload.destination,
	"operator" : (payload.airline ++ " airlines"),
	"fromAirport" :  "Bangalore"
}