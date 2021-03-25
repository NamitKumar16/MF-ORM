package AOP.Assignment2;

public class Validation {
    public void IDCheck(long id)
    {
        try{
            IDNotFound(id);
        } catch(IDNotFoundException e) {
            System.out.println("ID Not Found");
            System.out.println("Want to assign ID?");

        }

    }

    private void IDNotFound(long id) throws IDNotFoundException {
        if(id == 0)
        {
            throw new IDNotFoundException("ID NOT Found");
        }
    }
}
