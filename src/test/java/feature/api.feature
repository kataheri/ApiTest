Feature: Test Automation for REST API

  Scenario: Test Get List Data
    Given prepare url for "USER_GOREST"
    When hit api for get list users
    Then Validation status code is equal 200
    And Validation response body get list users
    And Validation response json with JSONSchema "get_list_users_normal.json"
    #aman

  Scenario: Test get list data with an invalid URL
    Given prepare an invalid URL for the "INVALID_GOREST"
    When hit api for get list users
    Then Validation status code is equal 404
    And Validation response message should be "Not Found"
    #aman

  Scenario:Test Create New User Normal
    Given prepare url for "CREATE_NEW_USERS"
    When  hit api for post create new user
    Then Validation status code is equal 201
    And Validation response body post create new user
    And Validation response json with JSONSchema "post_create_new_user_normal.json"
    #aman

    Scenario: Test Delete User Normal
      Given prepare url for "CREATE_NEW_USERS"
      When  hit api for post create new user
      Then  Validation status code is equal 201
      And Validation response body post create new user
      When hit api for delete user
      Then Validation status code is equal 204
      #aman

    Scenario: Test Update User Normal
      Given prepare url for "CREATE_NEW_USERS"
      When hit api for post create new user
      Then Validation status code is equal 201
      And Validation response body post create new user
      When hit api for update data
      Then Validation status code is equal 200
      And Validation response body update user
      