Feature: CustomerType

	Scenario: type of customer
		Given Customer is with Tesco from 12 years
		When Customer spend more than 12000
		Then Customer is Diamond type
		
	Scenario: type of customer
		Given Customer is with Tesco from 12 years
		When Customer spend more than 1200
		Then Customer is Gold type
		
	Scenario: type of customer
		Given Customer is with Tesco from 5 years
		When Customer spend more than 3000
		Then Customer is Silver type
		
	Scenario: type of customer
		Given Customer is with Tesco from 3 years
		When Customer spend more than 1200
		Then Customer is Bronze type
