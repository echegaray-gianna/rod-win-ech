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
            case 3:// How do I move to another location?
                viewMoveHelp();
                break;
            case 4:// How do I display a list of animals, provisions and tools in the city storehouse?
                viewListHelp();
                break;
            case 5:// Back to the Main Menu.
                System.out.println("Back to the Main Menu.");
        }
    }
    public void viewGoals(){
        System.out.println("\n"
               + "View Goals: \n" 
               + "Firstly, you want to have a successful 10 year ruling. \n"
               + "Secondly, starving too many people will result in your termination"
               + "from office and the game. \n"
               + "Thirdly, not paying tithes can result in cataclysmic events. "
               + "So make sure to pay your tithes! \n"
               + "Fourthly, have fun and enjoy your time as a ruler of the City of Aaron!\n"
               );
    }
    
    public void viewMapHelp(){
        System.out.println("\n"
                + "View Map Help: \n"
                + "The City of Aaron is located in the map. Try entering a few \n"
                + "different numbers in the row and columns, under menu option \n"
                + "3 - Move to a New Location to see where you end up. \n"
                );
    }
    
    public void viewMoveHelp(){
        System.out.println("\n"
                + "View Move Help: \n"
                + "To move to a new location, you will need to go to the Game Menu. \n"
                + "From there, click option 3 - Move to a New Location. From there, \n"
                + "you will need to enter a row then column number, which will take \n"
                + "to a new location on the map. \n"
        );
    }
    
    public void viewListHelp(){
        System.out.println("\n" 
                + "View List Help: \n"
                + "Under the Game Menu, option 2 is the View/Print a List. \n"
                + "By entering 1 or 2, you will be able to view or print a list \n"
                + "for any of the following options: \n"
                        + " 1 to print a list \n"
                        + " 2 to view a list \n"
                );
    }
}


