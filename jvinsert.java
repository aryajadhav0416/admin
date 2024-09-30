import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import org.bson.Document;
public class insert
{
	public static void main(String args[])
	{
		MongoClient mongo=new MongoClient("localhost",27017);
		System.out.println("connected to the database successfully:");
		MongoDatabase database=mongo.getDatabase("TYCSJD");
		MongoCollection<Document>collection=database.getCollection("TYCSCOLL");
		System.out.println("Collection TYCSCOLL selected successfully");
		Document document=new Document();
		document.append("ID",1);
		document.append("Rollno",238701);
		document.append("age",21);
		document.append("college","Mulund College of Commerce");
		collection.insertOne(document);
		System.out.println("Document inserted Successfully");
	}
}
