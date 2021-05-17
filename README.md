# challenge-voicemod
The aim of this project is answering the 'QA TEST - VOICEMOD'. It has two parts.
* In the first part, Functional Testing, the explanation of the tests chosen is found.
* In the second part, Automation Testing, everything related to the framework and the test automation is explained.

## Functional Testing
The first thing a user sees when (s)he enters [the Voicemod homepage](https://www.voicemod.net/) from the computers' 
browser is a big button that says 'GET VOICEMOD FREE'. 
When it is clicked, what I called [the Account page](https://account.voicemod.net/) is loaded.
From there, the user can create an account in different ways. After that (s)he will be redirected to what I called 
[the Download page](https://account.voicemod.net/?t=1620998025#/account-activated-success/) and the Voicemod download 
will start.

On the other hand, Voicemod Clips download can be done from what I called 
[the Apps Page](https://www.voicemod.net/voicemod-clips/), that can be accessed from the Homepage and then clicking in 
Our Apps in the top bar.

I am assuming that one of the top priorities of the company currently is acquiring more clients so from my point of 
view, assuring that the happy paths of the downloads of both applications work are the most important test cases.
In order to do so, the functional test cases that I have defined and then automated are the following:
1) The main button 'GET VOICEMOD FREE' in the Homepage links to the Account page.
2) The button 'GET VOICEMOD FREE' that appears in the Homepage after scrolling, links to the Account page.
3) The Account page works properly, redirecting to the correct login page of the third parties. For saving time, I have 
just considered Discord and Twitch, but the others should be checked as well.
4) The download of Voicemod starts from the Download page.
5) From the Apps page, the links to the apps work for both Google Play and App Store.

## Automation Testing

