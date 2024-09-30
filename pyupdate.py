from pymongo import MongoClient
client = MongoClient('localhost',27017)
db = client.pydb
def update():
    try:
        name = input('Enter the name of person whose data is to be updated: ')
        age = input("Enter the updated age: ")
        db.pycoll.update_one(
            {"name": name},
            {"$set": {"age": age}}
        )
        print("\nData Updated Successfully")
    except Exception:
        print(str(Exception))
    finally:
        client.close()
update()
