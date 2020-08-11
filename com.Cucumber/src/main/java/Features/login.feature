Feature: NewTours Login feature
Scenario: NewTours Login test scenario

Given User is already login page
When Title name is NewTours
Then user enters username  and password
#DataTable concept
|username|password|
|renukamohan58@gmail.com|08062008|  
Then user clicks Login button
And user on home page



#with Examples Keyword
#Scenario Outline: NewTours Login test scenario
#
#Given user is already  login Page
#When Title name is NewTours
#Then user enters "<username>" and "<password>"
#Then user clicks  Login button
#Then user  on home page
# 


#Examples:
#
#       | username | password |
#      | renukamohan58@gmail.com | 08062008|
