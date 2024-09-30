from pymongo import MongoClient
client = MongoClient('localhost',27017) #MongoClient('host',port)
db = client.pydb #client.name_of_the_database
def insert():
    try:
        empID = input("Enter the ID: ")
        empName = input("Enter the Name: ")
        empAge = input("Enter the Age: ")
        empCountry = input("Enter the Country: ")
        db.pycoll.insert_one(
            {
                "_id": empID,
                "name": empName,
                "age": empAge,
                "country": empCountry,
            }
        )
        print("\nData Inserted Successfully.")
    except Exception:
        print(str(Exception))
    finally:
        client.close()
insert()
