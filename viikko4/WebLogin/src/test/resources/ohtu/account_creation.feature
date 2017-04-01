Feature: A new user account can be created if a proper unused username and password are given

    Scenario: creation succesful with correct username and password
        Given new user is selected
        When  username 'teroantero' and password 'salasana123' and password confirmation 'salasana123' are given
        Then  user is created

    Scenario: creation fails with too short username and valid passord
        Given new user is selected
        When  username 'te' and password 'salasana123' and password confirmation 'salasana123' are given
        Then user is not created and error "username should have at least 3 characters" is reported   

    Scenario: creation fails with correct username and too short password
        Given new user is selected
        When  username 'teroantero' and password 'salis12' and password confirmation 'salis12' are given
        Then user is not created and error "password should have at least 8 characters" is reported   

    Scenario: creation fails with correct username and password consisting of letters
        Given new user is selected
        When  username 'teroantero' and password 'salainensana' and password confirmation 'salainensana' are given
        Then user is not created and error "password can not contain only letters" is reported 

    Scenario: creation fails with already taken username and valid pasword
        Given new user is selected
        When  username 'jukka' and password 'salasana123' and password confirmation 'salasana123' are given 
        Then user is not created and error "username is already taken" is reported 

    Scenario: creation fails when password and password confirmation do not match
        Given new user is selected
        When  username 'teroantero' and password 'salasana123' and password confirmation 'salis123' are given 
        Then user is not created and error "password and password confirmation do not match" is reported   
