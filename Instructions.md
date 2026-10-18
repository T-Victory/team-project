# Instructions

Please read this MD file for styling conventions we should all follow to make the code usable, 
editable, and readable.


### Workload
* Workload changes week by week, however always attempt to be actively working on at least one issue, or a workload of 
5-10 hours a week 
* Take a good look at how long each issue should be taking and its difficulty. This should be a good
gauge on how long you will be spending a week. 
* Additionally, ensure that you are allotting time to review others' PRs as well. 
* If you encounter any bugs, make sure to let the whole team know!


### Issues

Issues are all assigned the issues tab. Any code that is edited MUST be edited through an issue
(i.e. after editing code you should be able to close an issue)

When you need to create a new issue:

1. Create a clear title of what the issue pertains to. Try to err on the side of smaller issues, which can be 
resolved in one PR, and/or one method (a self-contained block).
2. Make a list of what needs to be completed in the issue that is exact and can be readily checked
3. Tag it, given an estimated difficulty and a timeline on how long it should take.

When opening an issue:
1. Assign the issue to yourself so that others know you are working on it
2. Create a BRANCH named: <your name> - <issue number or title>

When closing an issue:
1. Create a well-documented and messaged PR 
2. Ping all three other group members, so that people will know to close an issue. 
3. When the PR is approved, close the branch pertaining to the issue, and delete it (make SURE 
your changes have been merged onto main)
4. Assign yourself a new issue!

When reviewing an issue:
1. Look for the checklist and ensure that everything is to order.
2. Read the documented comments and verify that the method/code/class does what is documented
3. If what is documented is not needed, or you have ANY inklings of concerns, reject the PR and let the owner know
4. If you are the second person to review the PR, accept and merge.


### Code Etiquette
To keep our code consistent and clear for everyone, follow the following conventions:
* Write a docstring for every method, file, and class created
* Name variables that are descriptive to their function
* Even if a variable is not in the same scope, avoid using the same name for variables
* If a piece of code is particularly confusing, provide an example in the docstring 
* EVERY new method that is created should have corresponding tests in the test folder. Ensure to test
for edge cases, unit tests, and also broad-scoped tests as well. 