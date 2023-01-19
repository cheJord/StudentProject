package week1example;

/**
 * model class - raw data for student
 * @author chefo
 */
public class Student 
{
    // Encapsulation prinicple - private var, getters and setters
    private String name;
    private int sid;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }
}
