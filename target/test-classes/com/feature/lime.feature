@SmokeTest
Feature:  LimeOrder

Background:

Scenario: To click on women
Given     User launch the URL "https://www.limeroad.com/"
When      Usee clicks on shop women

Scenario: To select woment footware item
When      User click on women products
And       User click on foodwear flipflops
And       User click on Women Toe Separator Slippers

Scenario: User to select  Add to cart product
When      User select size
And       User click on add to cart

