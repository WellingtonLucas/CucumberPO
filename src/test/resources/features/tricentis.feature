@insurance
Feature: Validate form for vehicle insurance
  This is a test using Page Objetcts Model

  Scenario: Fill in the form for Automobile Insurance
  	Given Browser is open
    And user is on Vehicle Insurance Application
    When user select make as "Audi"
    And user select model as "Scooter"
    And user set cylinder capacity as "100"
    And user set engine performance as "150"
    And user set manufacturing date as "07/14/2020"
    And user select number of seats as "5"
    And user set right hand drive as "Yes"
    And user select number of seats again as "2" 
    And user select fuel type as "Diesel"
    And user set payload as "1000"
    And user set total weight as "1000"
    And user set list price as "10000"
    And user set licence plate number as "1111"
    And user set annual mileage as "200"
    And user clicks the next button to insurant data
    And user set first name as "Wellington"
    And user set last name as "Moura"
    And user set date of birth as "07/14/1989"
    And user set gender as "Male"
    And user set street address as "Rua dr Luciano Venere Decourt"
    And user select country as "Brazil"
    And user set zip code as "13083740"
    And user set city as "Campinas"
    And user select occupation as "Employee"
    And user set hobbies as other
    And user set website as "http://sampleapp.tricentis.com/101/app.php"
    And user clicks the next button to product data
    And user set start date as "07/14/2022"
    And user select insurance sum as "3000000"
    And user select merit rating as "Bonus 4" 
    And user select damage insurance as "Partial Coverage"
    And user set optional products as "Euro Protection" and "Legal Defense Insurance"
    And user select courtesy car as "Yes"
    And user clicks the next button to price option
    And user set price option as "Silver"
    And user clicks the next button to send quote
    And user set email as "teste@teste.com"
    And user set phone as "19999999999"
    And user set username as "wellington"
    And user set password as "Teste123"
    And user set confirm password "Teste123"
    And user set comments "Cadastro concluído."
    And user clicks the next button to send email
    Then user verify success message
    And user clicks on OK button
    
    
    
