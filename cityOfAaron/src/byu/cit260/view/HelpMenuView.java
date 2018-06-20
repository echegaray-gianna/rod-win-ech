/*
 * The HelpMenuView contains few methods that will display to the user 
 * diferent information about the game and how to play it. 
 */
package byu.cit260.view;
/**
 *
 * @author hernan rodriguez
 */
public class HelpMenuView extends MenuView{
    
    
    public  HelpMenuView(){
        super("\n"
                + "-------------       --------------\n"
                + "    CITY OF AARON: HELP MENU  \n"
                + "-------------       --------------\n"
                + " 1 - What are the goals of the game?\n"
                + " 2 - Where is the city of Aaron?\n"
                + " 3 - How do I view the map?\n"
                + " 4 - How do I move to another location?\n"
                + " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n"
                + " 6 - Back to the Main Menu\n",
                6);
    }
    
    @Override
    public void doAction(int option){
        switch (option) {
            case 1:  // What are the goals of the game?
                viewGoals();
                break;
            case 2: // Where is the city of Aaron?
                viewMapHelp();
                break;
            case 3: // How do I view the map?
                viewMapHelp();
                break;
            case 4:// How do I move to another location?
                viewMoveHelp();
                break;
            case 5:// How do I display a list of animals, provisions and tools in the city storehouse?
                viewListHelp();
                break;
            case 6:// Back to the Main Menu.
                System.out.println("Back to the Main Menu.");
        }
    }
    public void viewGoals(){
        System.out.println("View Goals...");
    }
    public void viewMapHelp(){
        System.out.println("View Map Help...");
    }
    public void viewMoveHelp(){
        System.out.println("View Move Help...");
    }
    
    public void viewListHelp(){
        System.out.println("View List Help...");
    }
    
}
