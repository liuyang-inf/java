import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


public class Test {

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		System.out.println(mongoClient.getDatabaseNames());
		DB db = mongoClient.getDB( "test" );
//		boolean auth = db.authenticate(myUserName, myPassword);
		Set<String> colls = db.getCollectionNames();
		for (String s : colls) {
		   System.out.println(s);
		}
		DBCollection dbCollection = db.getCollection("person");
		DBCursor cursor = dbCollection.find();
		for (DBObject dbObject : cursor) {
			System.out.println(dbObject.toMap());
		}
	}

}
