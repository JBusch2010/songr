# Lab 11: Building Full-Stack Web Apps
# Lab 12: Spring MVC with Databases

- Ensure that you can run the Spring app.
- Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
- Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
- Create a route that reverses the order of the words in a query parameter. For example, if I visit /reverse?sentence=Hello world, it should return an HTML page containing world Hello.
- Write a unit test for the word reversing functionality of the above route. (Note that this will be easiest if you write a helper method for the word reversing, so that you can call that method for testing.)
- Added functionality to add Albums with variables of the artist name, title of album, length of album, number of songs, and image of the album cover.

## Run the app

- Navigate to project in the terminal
- $ gradle bootRun
- Open brower and navigate to http://localhost:8080
- Add album details and submit and view your submission

## Routes

- /HelloWorld
- /capitalize/hello
- /reverse
- /albums

## Contributions

- Chris Coulon
- Nhu Trinh
- Matt Stuhring
- Fabion Brooks
