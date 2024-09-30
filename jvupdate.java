import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import org.bson.Document;
import com.mongodb.client.model.*;
public class Update {
    public static void main(String[] args) {
        MongoClient mongo = new MongoClient("localhost", 27017);
        System.out.println("Connected to the database successfully:");
        MongoDatabase database = mongo.getDatabase("TYCSJD");
        MongoCollection<Document> collection = database.getCollection("TYCSCOLL");
        System.out.println("Collection TYCSCOLL selected successfully");
        Document filter = new Document("Rollno", 238701);
        Document updateDoc = new Document("$set", new Document("age", 22));
        collection.updateOne(filter, updateDoc);
        System.out.println("Document updated Successfully");
    }
}
