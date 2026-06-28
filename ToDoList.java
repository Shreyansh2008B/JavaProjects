
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class TaskManager
{
    String name;
    public static List<TaskManager> tasklist = new ArrayList<>();
   
    public TaskManager(String name) 
    {
        this.name =name;
    }
    
    
    
    
}
public class ToDoList
{
    
    public static  TaskManager CreateTaskList(String listname)
    {
        return new TaskManager(listname);
    }
    public void  showMenu()
    {   
        System.out.println("---Menu---");
        System.out.println("1.Create new Task List");
        System.out.println("2.Select Task List");
        System.out.println("3.Exit");
        System.out.println("----------");
        System.out.print("Enter(1/2/3 ): ");
        
    }
    public void AddTask()
    {

    }
    public  void main(String[] args)
    {   Scanner s = new Scanner(System.in);
        
       
       
        int userinput =0;
        
        while(userinput !=3)
        {   showMenu();
            s.nextLine();
            userinput = s.nextInt();
            s.nextLine();
            if(userinput ==1)
            {   System.out.print("Enter Name of your task List: ");
                String user_input = s.nextLine();
    
                TaskManager tasklistobj = CreateTaskList(user_input);
                TaskManager.tasklist.add(tasklistobj);
    
                System.out.println("----Task List " + tasklistobj.name + " Created Successfully----");
                
               

            }
            else if (userinput ==2) 
            {//display a task list
                if(TaskManager.tasklist.size() ==0)
                {
                    System.out.println("Create A TaskList First!");
                }
                for(int i =0; i< TaskManager.tasklist.size();i++)
                {
                    System.out.println(i+1+"."+TaskManager.tasklist.get(i));
                }
            
            }
            
            
            
        }
    }



}