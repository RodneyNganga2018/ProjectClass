import javax.sound.sampled.Port;

public class ProjectTest {
    public static void main(String[] args) {
        Project test = new Project("Narnia", "A good story", 25);
        Project test2 = new Project("Harry Potter", "A good story", 50);
        Project test3 = new Project("Pokemon", "Catch them all", 100);
        Project[] projects = {test,test2,test3};

        Portfolio listProjects = new Portfolio(projects);
        listProjects.showPortfolio();
    }
}