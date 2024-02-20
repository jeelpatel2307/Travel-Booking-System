# Travel Booking System

The Travel Booking System is a Python program designed to facilitate the booking of travel services such as flights, hotels, and rental cars. It allows users to search for available services, book them, and manage their bookings.

## Features

- **Flight Booking:** Search for available flights, select a flight, and book tickets.
- **Hotel Booking:** Find available hotels, select a room, and make reservations.
- **Car Rental:** Search for rental cars, select a vehicle, and book rentals.
- **User Management:** Manage user accounts, including registration, login, and profile management.
- **Booking Management:** View and manage existing bookings, including cancellation and modification options.

## How to Use

1. **User Registration/Login:** Users can register for a new account or log in to an existing one.
2. **Service Search:** Search for available flights, hotels, or rental cars based on criteria such as dates, locations, and preferences.
3. **Booking:** Select desired services, provide necessary details, and confirm bookings.
4. **Profile Management:** Users can view and update their profile information, including contact details and preferences.
5. **Booking Management:** View existing bookings, cancel or modify bookings as needed.

## Example Code

Below is a simplified example of how the Travel Booking System might work:

```python
class Flight:
    def __init__(self, origin, destination, date, time, price):
        self.origin = origin
        self.destination = destination
        self.date = date
        self.time = time
        self.price = price

    def display_flight_info(self):
        print(f"Flight from {self.origin} to {self.destination} on {self.date} at {self.time} - ${self.price}")

class Hotel:
    def __init__(self, name, location, check_in_date, check_out_date, price):
        self.name = name
        self.location = location
        self.check_in_date = check_in_date
        self.check_out_date = check_out_date
        self.price = price

    def display_hotel_info(self):
        print(f"{self.name} in {self.location} from {self.check_in_date} to {self.check_out_date} - ${self.price}/night")

class CarRental:
    def __init__(self, brand, model, location, date, price_per_day):
        self.brand = brand
        self.model = model
        self.location = location
        self.date = date
        self.price_per_day = price_per_day

    def display_car_info(self):
        print(f"{self.brand} {self.model} in {self.location} on {self.date} - ${self.price_per_day}/day")

# Usage example
flight1 = Flight("New York", "Los Angeles", "2024-07-15", "10:00", 250.00)
hotel1 = Hotel("Luxury Hotel", "Los Angeles", "2024-07-15", "2024-07-20", 150.00)
car1 = CarRental("Toyota", "Camry", "Los Angeles", "2024-07-15", 50.00)

flight1.display_flight_info()
hotel1.display_hotel_info()
car1.display_car_info()

```

## Next Steps

This example provides a basic framework for a Travel Booking System. Further development could include:

- Implementing user authentication and profile management functionality.
- Integrating with external APIs to fetch real-time availability and pricing information.
- Adding support for additional services such as tours, activities, and travel insurance.
- Enhancing the user interface for a more intuitive booking experience.

## Contributing

Contributions to improve the Travel Booking System project are welcome! Fork the repository, make your changes, and submit a pull request.

## Credits

This project was created by Jeel patel.
