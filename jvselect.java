import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import org.bson.Document;
import java.util.Iterator;
public class retrieve {
    public static void main(String args[]) {
        MongoClient mongo = new MongoClient("localhost", 27017);
        System.out.println("Connected to the database successfully:");
        MongoDatabase database = mongo.getDatabase("TYCSJD");
        MongoCollection<Document> collection = database.getCollection("TYCSCOLL");
        System.out.println("Collection TYCSCOLL selected successfully");
       FindIterable<Document> iterDoc = collection.find();
      Iterator it = iterDoc.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }        
        mongo.close();
    }
}
