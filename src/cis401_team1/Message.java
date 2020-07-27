package cis401_team1;
import java.io.Serializable;

// must implement Serializable in order to be sent
public class Message implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int count = 0;
    private final int id;
    private final String text;
    private final String type;
    private final String userID[];

    public Message(String type, String users[],  String text) {
        this.text = text;
        this.userID = users;
        this.type = type;
        this.id = ++count;

    }

	public String getText() {
        return this.text;
    }

    public int getID(){
        return this.id;
    }
    
    public String[] getUsers() {
        return this.userID;
    }
    

    public String getType(){
        return this.type;
    }
    
    public String toString() {
    	return this.type + "/" + this.text;
    }
}


