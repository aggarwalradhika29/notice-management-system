import java.io.Serializable;
             			    //'NOTICE' CLASS WITH 'id' AND 'message' AS ITS DATA MEMBERS AND CONSTRUCTORS TO INITIALIZE THEM.
public class Notice implements Serializable
{
	private static final long serialVersionUID= 1L;
	String id;
	String message;

	Notice()
	{
		id = null;
		message = null;
	}

	Notice(String id, String message)
	{
		this.message = message;
		this.id = id;
	}
}

