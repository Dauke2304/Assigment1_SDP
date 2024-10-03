Creating the Cinema Management System Project in Java that demonstrates the five primary creational design patterns Singleton, Factory Method, Abstract Factory, Builder and Prototype. 
For example: each design pattern targets a different element in the system like movie creation, booking tickets, system configuration or adding up user interface.
This project does not have exact functionality of cinema managment system, just console leveled functionality. The main subject was to show the usage of patterns.

The project is divided into the following key components:

Singleton Pattern (CinemaConfig):
SIngleton is used to ensure that all system configuration stuff(like cinema name, number of screens) are global and accesible from CinemaConfig class in one instance.
The Singleton pattern guarantees that the CinemaConfig class will be singleton throughout the application. This also means no configuration drift and ensures your settings are controlled in one location.

Factory Method Pattern (Movie Creation):
Responsible for creating different category of movies. 
The Factory Method pattern is used to create different types of movies (e.g., RegularMovie, IMAXMovie, 3DMovie) without directly instantiating them. 
This approach allows for extending the system easily by adding new movie types (e.g., adding a VR movie class) without modifying the existing code.

Abstract Factory Pattern (User Interface Generation):
Abstarct Factory patterns were used to create and control the the themes of UI generation. The UI components like (buttons, fields) are easly adaptable for any kind of theme.
This pattern ensures a consistent look across the application based on the theme chosen by the user. It also allows switching themes without broking UI logic. Also allows adding a new theme by not changing the exsisting code.

Builder Pattern (Ticket Booking):
The process of TicketBooking, particularly the building of the ticket, is the best application of the Builder design pattern, as it requires the verification of a ticket with an undefined number of optional validations such as the name of the movie,
desired rows for the particular seat, eating and drinking preferences etc. Enables the step by step creation of ticket, and builder pattern role is allow flexibly construct the ticket by chaining methods.

Prototype Pattern (Movie Schedule):
The Prototype pattern was chosen to easily clone movie schedules.  Film showing schedules within a cinema normally run according to a fixed plan (e.g., fixed daily slots), 
but sometimes it is necessary to create a separate and slightly different schedule (e.g., replace the movie with another one or change the session timing adjustment). 
Instead of creating new schedules from scratch, the prototype allows cloning existing schedules. And the basic shedule will be still unchanged.

Clases and interfaces:
CinemaConfig (Singleton): Manages global cinema settings.
Movie, RegularMovie, IMAXMovie (Factory Method): Represents different movie types.
MovieFactory (Factory Method): Abstract class for creating movies.
UIFactory (Abstract Factory): Creates UI components based on the chosen theme.
TicketBooking, TicketBookingBuilder (Builder): Constructs complex ticket booking objects.
MovieSchedule, StandardSchedule (Prototype): Allows cloning of schedules to create new time.

The project made by Dauletkhan and README file was also wrotten by me, in this prolect process were used some templates from professor practice(Aqylbek) and also used translator for README file ;)
