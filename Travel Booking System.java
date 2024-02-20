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
